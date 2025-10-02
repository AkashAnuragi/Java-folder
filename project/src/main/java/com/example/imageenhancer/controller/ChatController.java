package com.example.imageenhancer.controller;

import com.example.imageenhancer.dto.ChatMessage;
import com.example.imageenhancer.dto.ChatResponse;
import com.example.imageenhancer.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/message")
    public ChatResponse sendMessage(@RequestBody ChatMessage message) {
        return chatService.processMessage(message);
    }
}