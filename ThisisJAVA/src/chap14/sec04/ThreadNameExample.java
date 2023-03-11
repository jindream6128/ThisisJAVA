package chap14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		for(int i = 0; i<3; i++) {
			Thread tA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName());
				}
			};
			tA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName());
			}
		};
		chatThread.setName("chat - thread");
		chatThread.start();
		
	}

}
