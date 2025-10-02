import { ImageEnhancement } from '../types';

export const enhanceImage = async (imageFile: File): Promise<ImageEnhancement> => {
  return new Promise((resolve) => {
    const canvas = document.createElement('canvas');
    const ctx = canvas.getContext('2d')!;
    const img = new Image();

    img.onload = () => {
      // Set canvas size to match image
      canvas.width = img.width;
      canvas.height = img.height;

      // Draw original image
      ctx.drawImage(img, 0, 0);

      // Get image data for processing
      const imageData = ctx.getImageData(0, 0, canvas.width, canvas.height);
      const data = imageData.data;

      // Enhance image
      for (let i = 0; i < data.length; i += 4) {
        // Increase brightness
        data[i] = Math.min(255, data[i] * 1.2);     // Red
        data[i + 1] = Math.min(255, data[i + 1] * 1.2); // Green
        data[i + 2] = Math.min(255, data[i + 2] * 1.2); // Blue

        // Increase contrast
        for (let j = 0; j < 3; j++) {
          const value = data[i + j];
          data[i + j] = Math.min(255, ((value - 128) * 1.1) + 128);
        }
      }

      // Put enhanced image data back to canvas
      ctx.putImageData(imageData, 0, 0);

      // Convert to base64
      const enhancedImage = canvas.toDataURL('image/png');

      resolve({
        originalImage: img.src,
        enhancedImage,
        status: 'completed'
      });
    };

    // Read the file and set as image source
    const reader = new FileReader();
    reader.onload = (e) => {
      img.src = e.target?.result as string;
    };
    reader.readAsDataURL(imageFile);
  });
};