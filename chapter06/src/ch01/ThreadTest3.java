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
	// ���� ������
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		// �۾��� 3�� ����
		// �۾��� ���� �����ּ���
		
		MyThread3 th1 = new MyThread3();
		th1.start();
		
		MyThread3 th2 = new MyThread3();
		th2.start();
		
		MyThread3 th3 = new MyThread3();
		th3.start();
		
		
		
		
		
	}// end of main

}// end of class
