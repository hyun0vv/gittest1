package ch01;

import javax.swing.JFrame;

class MyRunnble2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnble2() {
//		runnable.run();
	}
	
	
	// 자바문법
	// 구현 객체
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}// end of for

		}// end of run
	};
	
	
	
}// end of MyRunnable2



public class RunnableTest2 {

	public static void main(String[] args) {
		
		// 문제 1. 객체 생성과 동시에 run 메서드를 실행시켜주세요
		
		MyRunnble2 myRunnble2 = new MyRunnble2();
		
		// 문제 2. 외부에서 run메서드를 동작시켜주세요
		
		myRunnble2.runnable.run();
		
		
		
		
	}

}
