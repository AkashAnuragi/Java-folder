import { useState, useCallback } from 'react';
import { Message } from '../types';
import { generateUniqueId } from '../utils/idUtils';

export const useChat = () => {
  const [messages, setMessages] = useState<Message[]>([]);

  const addMessage = useCallback((content: string, type: 'user' | 'bot') => {
    const newMessage: Message = {
      id: generateUniqueId(),
      type,
      content,
      timestamp: new Date(),
    };
    setMessages((prev) => [...prev, newMessage]);
  }, []);

  const clearChat = useCallback(() => {
    setMessages([]);
  }, []);

  return {
    messages,
    addMessage,
    clearChat,
  };
};