package com.example.imageenhancer.service;

import com.example.imageenhancer.dto.ChatMessage;
import com.example.imageenhancer.dto.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public ChatResponse processMessage(ChatMessage message) {
        // Simple response logic
        String response = "Please upload an image that you'd like me to enhance.";
        return new ChatResponse(response);
    }
}