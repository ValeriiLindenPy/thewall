package com.wall.thewall.Service;

import java.util.List;
import java.util.Optional;

import com.wall.thewall.Model.Message;

public interface  WallMessageService {
    List<Message> getAllMessagesForWall(Long wallId);
    String createMessage(Message message, Long wallId);
    Optional<Message> findMessageById(Long messageId);
    String deleteMessageById(Long messageId);
    String updateMessage(Message message, Long messageId);
}
