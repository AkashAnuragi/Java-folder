import { useState, useCallback } from 'react';
import { ImageEnhancement } from '../types';
import { enhanceImage } from '../utils/imageProcessor';
import { readFileAsDataURL } from '../utils/imageUtils';

export const useImageEnhancer = () => {
  const [enhancement, setEnhancement] = useState<ImageEnhancement | null>(null);

  const processImage = useCallback(async (imageFile: File) => {
    try {
      const originalImage = await readFileAsDataURL(imageFile);
      
      setEnhancement({
        originalImage,
        enhancedImage: null,
        status: 'processing',
      });

      const result = await enhanceImage(imageFile);
      setEnhancement(result);
    } catch (error) {
      setEnhancement(prev => prev ? { ...prev, status: 'error' } : null);
    }
  }, []);

  return {
    enhancement,
    enhanceImage: processImage,
  };
};