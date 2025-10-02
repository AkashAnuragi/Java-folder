import React from 'react';
import { ImageEnhancement } from '../types';

interface ImagePreviewProps {
  enhancement: ImageEnhancement;
}

export const ImagePreview: React.FC<ImagePreviewProps> = ({ enhancement }) => {
  return (
    <div className="flex flex-col gap-4">
      <div className="grid grid-cols-2 gap-4">
        <div>
          <h3 className="text-lg font-semibold mb-2">Original Image</h3>
          <img
            src={enhancement.originalImage}
            alt="Original"
            className="w-full rounded-lg"
          />
        </div>
        <div>
          <h3 className="text-lg font-semibold mb-2">Enhanced Image</h3>
          {enhancement.status === 'processing' ? (
            <div className="flex items-center justify-center h-full">
              <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-blue-500"></div>
            </div>
          ) : enhancement.enhancedImage ? (
            <img
              src={enhancement.enhancedImage}
              alt="Enhanced"
              className="w-full rounded-lg"
            />
          ) : null}
        </div>
      </div>
      <div className="text-center text-sm text-gray-500">
        {enhancement.status === 'processing'
          ? 'Enhancing your image...'
          : enhancement.status === 'completed'
          ? 'Enhancement complete!'
          : 'Something went wrong'}
      </div>
    </div>
  );
};