package com.wall.thewall.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wall.thewall.Model.Message;
import com.wall.thewall.Model.Wall;
import com.wall.thewall.Repository.WallMessageRepository;
import com.wall.thewall.Service.WallMessageService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class WallMessageServiceImpl implements WallMessageService {
    private final WallMessageRepository messageRepository;

    @Override
    public List<Message> getAllMessagesForWall(Long wallId) {
        return messageRepository.findByWallId(wallId);
    }

    @Override
    public String createMessage(Message message, Long wallId) {
        Wall wall = new Wall();
        wall.setId(wallId);
        message.setWall(wall);
        messageRepository.save(message);
        return "Message created successfully";
    }

    @Override
    public Optional<Message> findMessageById(Long messageId) {
        return messageRepository.findById(messageId);
    }

    @Override
    public String deleteMessageById(Long messageId) {
        messageRepository.deleteById(messageId);
        return "The message was deleted successfully";
    }

    @Override
    public String updateMessage(Message message, Long messageId) {
        Optional<Message> optionalMessage = messageRepository.findById(messageId);

        if (optionalMessage.isPresent()) {
            Message existingMessage = optionalMessage.get();
            existingMessage.setMessage(message.getMessage());
            // Update other fields as needed
            messageRepository.save(existingMessage);
            return "The message is updated successfully";
        } else {
            return "No such message found in the database";
        }
    }


    
}
