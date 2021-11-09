package ch01;

class MyThread3 extends Thread{
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread());
		}
	}
}// end of MyThread3




public class ThreadTest3 {
	// 메인 쓰레드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		// 작업자 3명 생성
		// 작업을 시작 시켜주세요
		
		MyThread3 th1 = new MyThread3();
		th1.start();
		
		MyThread3 th2 = new MyThread3();
		th2.start();
		
		MyThread3 th3 = new MyThread3();
		th3.start();
		
		
		
		
		
	}// end of main

}// end of class
