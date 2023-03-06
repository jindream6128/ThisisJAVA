package chap09.practice;

public class Chatting {
	class Chat{
		public void start() {
		}
		public void sendMessage(String message) {}
	}
	
	public void startChat(String chatID) {
		String nickName = chatID;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

}

