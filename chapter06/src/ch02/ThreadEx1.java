package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true;
	
	
	@Override
	public void run() {
		
		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}

		}// end of while

	}// end of run

}// end of class

public class ThreadEx1 {

	public static void main(String[] args) {
		
		System.out.println("�۾��ڸ� ���� �ϰڽ��ϴ�.");
		// ���� �����尡 �۾��ڸ� ��û�ؼ� ����
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		
		System.out.println("0���� �Է��ϸ� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		
		
//		if(userInput == 0) {
////		thread1.stop();  // deprecated ( ���̻� �������� �������� ) 
//			thread1.flag = false;
//		}
		
		// ���� 3 
		// do while���� ����ؼ� �ڵ带 �������ּ���
		
		// do while�� �����
		// do �ȿ� � �ڵ尡 ���� �����ؼ� �ۼ�
		// while�� ���ǽĿ� ����
		
		int userInput;
		
		// if�� ����� ���
//		do {
//			// do while�� �ܺο��� �Է��� �ްԵǸ� �ݺ��� ���� �ʱ⶧���� �ȿ� �ۼ�
//			userInput = scanner.nextInt();
//			
//			if( userInput == 0) {
//				thread1.flag = false;
//			}
//		} while (userInput != 0 );
	
		
		// ���׿����� ����� ���
		do {
			userInput = scanner.nextInt();
			thread1.flag = userInput == 0 ? false : true;
		}while(userInput != 0 );

		
	}

}
