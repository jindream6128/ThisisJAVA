package chap14.sec03.exam02;
import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {

		//익명 자식객체 -> 여기서만 사용할꺼면 이렇게 작성해도 문제가 안됨
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i<5;i++) {
					toolkit.beep();
					try{Thread.sleep(500);}catch(Exception e) {}
				}
			}
			
		});
		
		thread.start();
		//그러나 다른곳에서도 사용된다면 명시적으로 자식클래스를 정의하면 어디서든 사용가능
		/*for(int i = 0;i<5;i++) {
			System.out.println("띵");
			try{Thread.sleep(500);}catch(Exception e) {}
		}*/
		Thread pt = new PrintThread();
		pt.start();
	}

}
