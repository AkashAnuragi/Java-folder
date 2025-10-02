import axios from 'axios';
import { ApiResponse } from '../types';

const API_URL = 'http://localhost:8080/api';

const api = axios.create({
  baseURL: API_URL,
  headers: {
    'Content-Type': 'application/json',
  },
});

export const enhanceImage = async (file: File): Promise<ApiResponse<any>> => {
  try {
    const formData = new FormData();
    formData.append('image', file);

    const response = await api.post('/images/enhance', formData, {
      headers: {
        'Content-Type': 'multipart/form-data',
      },
    });

    return {
      data: response.data,
      status: 'success',
    };
  } catch (error) {
    return {
      data: null,
      status: 'error',
      message: 'Failed to enhance image',
    };
  }
};

export const sendMessage = async (content: string, type: 'user' | 'bot'): Promise<ApiResponse<any>> => {
  try {
    const response = await api.post('/chat/message', {
      content,
      type,
    });

    return {
      data: response.data,
      status: 'success',
    };
  } catch (error) {
    return {
      data: null,
      status: 'error',
      message: 'Failed to send message',
    };
  }
};