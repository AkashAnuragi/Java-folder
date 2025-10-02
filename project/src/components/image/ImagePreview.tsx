import React from 'react';
import { ImageEnhancement } from '../../types';
import { downloadImage } from '../../utils/downloadUtils';

interface ImagePreviewProps {
  enhancement: ImageEnhancement;
}

export const ImagePreview: React.FC<ImagePreviewProps> = ({ enhancement }) => {
  const handleDownload = (imageUrl: string, type: 'original' | 'enhanced') => {
    const timestamp = new Date().getTime();
    const filename = `${type}-image-${timestamp}.png`;
    downloadImage(imageUrl, filename);
  };

  return (
    <div className="flex flex-col gap-4">
      <div className="grid grid-cols-2 gap-4">
        <div>
          <div className="flex justify-between items-center mb-2">
            <h3 className="text-lg font-semibold">Original Image</h3>
            <button
              onClick={() => handleDownload(enhancement.originalImage, 'original')}
              className="px-3 py-1 text-sm bg-gray-100 hover:bg-gray-200 text-gray-700 rounded-md transition-colors"
            >
              Download
            </button>
          </div>
          <img
            src={enhancement.originalImage}
            alt="Original"
            className="w-full rounded-lg"
          />
        </div>
        <div>
          <div className="flex justify-between items-center mb-2">
            <h3 className="text-lg font-semibold">Enhanced Image</h3>
            {enhancement.status === 'completed' && enhancement.enhancedImage && (
              <button
                onClick={() => handleDownload(enhancement.enhancedImage!, 'enhanced')}
                className="px-3 py-1 text-sm bg-gray-100 hover:bg-gray-200 text-gray-700 rounded-md transition-colors"
              >
                Download
              </button>
            )}
          </div>
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