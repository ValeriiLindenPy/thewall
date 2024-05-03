package com.wall.thewall.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wall.thewall.Service.impl.WallMessageServiceImpl;

import lombok.AllArgsConstructor;
import com.wall.thewall.Model.Message;

@RestController
@RequestMapping("/api/v1/walls/{wallId}/messages")
@AllArgsConstructor
public class WallMessageApiController {
    private final WallMessageServiceImpl messageService;

    @GetMapping
    public List<Message> getAllMessages(@PathVariable("wallId") Long wallId) {
        return messageService.getAllMessagesForWall(wallId);
    }

    @PostMapping
    public ResponseEntity<String> addMessage(@PathVariable("wallId") Long wallId, @RequestBody Message message) {
        String result = messageService.createMessage(message, wallId);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping(value = "/{messageId}")
    public Optional<Message> getMessageById(@PathVariable("wallId") Long wallId, @PathVariable("messageId") Long messageId) {
        return messageService.findMessageById(messageId);
    }

    @DeleteMapping(value = "/{messageId}")
    public String deleteMessageById(@PathVariable("wallId") Long wallId, @PathVariable("messageId") Long messageId) {
        return messageService.deleteMessageById(messageId);
    }

    @PutMapping(value = "/{messageId}")
    public ResponseEntity<String> updateMessage(@PathVariable("wallId") Long wallId, @PathVariable("messageId") Long messageId, @RequestBody Message message) {
        String result = messageService.updateMessage(message, messageId);
        return ResponseEntity.ok().body(result);
    }
    
}
