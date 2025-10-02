package com.example.imageenhancer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnhancementResponse {
    private String originalImage;
    private String enhancedImage;
    private String status;
}