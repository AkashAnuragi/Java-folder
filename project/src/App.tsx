import React from 'react';
import { ChatMessage } from './components/chat/ChatMessage';
import { ChatInput } from './components/chat/ChatInput';
import { ImageUploader } from './components/image/ImageUploader';
import { ImagePreview } from './components/image/ImagePreview';
import { useChat } from './hooks/useChat';
import { useImageEnhancer } from './hooks/useImageEnhancer';

function App() {
  const { messages, addMessage } = useChat();
  const { enhancement, enhanceImage } = useImageEnhancer();

  const handleImageSelect = async (file: File) => {
    addMessage('I\'ve uploaded an image for enhancement.', 'user');
    addMessage('I\'ll enhance your image right away!', 'bot');
    await enhanceImage(file);
  };

  const handleSendMessage = (message: string) => {
    addMessage(message, 'user');
    // Simple bot response
    setTimeout(() => {
      addMessage('Please upload an image that you\'d like me to enhance.', 'bot');
    }, 500);
  };

  return (
    <div className="min-h-screen bg-gray-100 p-4">
      <div className="max-w-4xl mx-auto bg-white rounded-xl shadow-lg p-6">
        <h1 className="text-2xl font-bold text-center mb-6">
          Image Enhancer Chatbot
        </h1>
        
        <div className="mb-6">
          <ImageUploader onImageSelect={handleImageSelect} />
        </div>

        {enhancement && <ImagePreview enhancement={enhancement} />}

        <div className="h-[400px] overflow-y-auto mb-4 p-4 bg-gray-50 rounded-lg">
          {messages.map((message) => (
            <ChatMessage key={message.id} message={message} />
          ))}
        </div>

        <ChatInput onSend={handleSendMessage} />
      </div>
    </div>
  );
}

export default App;