export interface Message {
  id: string;
  type: 'user' | 'bot';
  content: string;
  timestamp: Date;
}

export interface ImageEnhancement {
  originalImage: string;
  enhancedImage: string | null;
  status: 'processing' | 'completed' | 'error';
}

export interface ApiResponse<T> {
  data: T;
  status: 'success' | 'error';
  message?: string;
}