package com.example.imageenhancer.service;

import com.example.imageenhancer.dto.EnhancementResponse;
import lombok.extern.slf4j.Slf4j;
import org.imgscalr.Scalr;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

@Service
@Slf4j
public class ImageEnhancementService {

    public EnhancementResponse enhanceImage(MultipartFile image) {
        try {
            BufferedImage originalImage = ImageIO.read(image.getInputStream());
            
            // Apply enhancement operations
            BufferedImage enhancedImage = Scalr.apply(originalImage, ops -> {
                // Increase brightness
                ops.brightness(1.2f);
                // Increase contrast
                ops.contrast(1.1f);
                // Sharpen the image
                ops.sharpen();
            });

            // Convert images to Base64
            String originalBase64 = toBase64(originalImage);
            String enhancedBase64 = toBase64(enhancedImage);

            return new EnhancementResponse(originalBase64, enhancedBase64, "completed");
        } catch (Exception e) {
            log.error("Error enhancing image", e);
            return new EnhancementResponse(null, null, "error");
        }
    }

    private String toBase64(BufferedImage image) throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageIO.write(image, "png", output);
        return Base64.getEncoder().encodeToString(output.toByteArray());
    }
}