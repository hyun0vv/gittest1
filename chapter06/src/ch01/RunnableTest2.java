package ch01;

import javax.swing.JFrame;

class MyRunnble2 extends JFrame{
	
	int grade = 10;
	
	public MyRunnble2() {
//		runnable.run();
	}
	
	
	// �ڹٹ���
	// ���� ��ü
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
		
		// ���� 1. ��ü ������ ���ÿ� run �޼��带 ��������ּ���
		
		MyRunnble2 myRunnble2 = new MyRunnble2();
		
		// ���� 2. �ܺο��� run�޼��带 ���۽����ּ���
		
		myRunnble2.runnable.run();
		
		
		
		
	}

}
