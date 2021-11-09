package ch01;

import javax.swing.JFrame;

// Runnable 인터페이스를 구현하여 만들면 된다.

class MyRunnable1 extends JFrame implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0 ; i < 200; i++) {
			System.out.print(i + "\t");
			
		}
	}
}


public class RunnableTest1 {

	public static void main(String[] args) {
		
		MyRunnable1 myRunnable1 = new MyRunnable1();
		
		// Runnable을 구현한 객체는 Thread를 생성해서 매개변수에 담고 쓰레드를 시작한다.
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();
		
		Thread thread2 = new Thread(myRunnable1);
		thread2.start();
		
		
		
	}

}
