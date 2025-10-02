import React from 'react';
import { Message } from '../../types';
import clsx from 'clsx';
import { formatTimestamp } from '../../utils/messageUtils';

interface ChatMessageProps {
  message: Message;
}

export const ChatMessage: React.FC<ChatMessageProps> = ({ message }) => {
  return (
    <div
      className={clsx(
        'max-w-[80%] rounded-lg p-4 mb-4',
        message.type === 'user'
          ? 'bg-blue-500 text-white ml-auto'
          : 'bg-gray-200 text-gray-800'
      )}
    >
      <p className="text-sm">{message.content}</p>
      <span className="text-xs opacity-75">
        {formatTimestamp(message.timestamp)}
      </span>
    </div>
  );
};