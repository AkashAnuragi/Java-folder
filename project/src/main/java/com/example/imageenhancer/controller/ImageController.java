package com.example.imageenhancer.controller;

import com.example.imageenhancer.dto.EnhancementResponse;
import com.example.imageenhancer.service.ImageEnhancementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ImageController {

    private final ImageEnhancementService imageEnhancementService;

    @PostMapping(value = "/enhance", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public EnhancementResponse enhanceImage(@RequestParam("image") MultipartFile image) {
        return imageEnhancementService.enhanceImage(image);
    }
}