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
		
		System.out.println("작업자를 생성 하겠습니다.");
		// 메인 쓰레드가 작업자를 요청해서 생성
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		
		System.out.println("0번을 입력하면 중지합니다.");
		Scanner scanner = new Scanner(System.in);
		
		
		
//		if(userInput == 0) {
////		thread1.stop();  // deprecated ( 더이상 유지보수 하지않음 ) 
//			thread1.flag = false;
//		}
		
		// 문제 3 
		// do while문을 사용해서 코드를 수정해주세요
		
		// do while문 사용방법
		// do 안에 어떤 코드가 들어갈지 생각해서 작성
		// while문 조건식에 구현
		
		int userInput;
		
		// if문 사용한 방법
//		do {
//			// do while문 외부에서 입력을 받게되면 반복을 하지 않기때문에 안에 작성
//			userInput = scanner.nextInt();
//			
//			if( userInput == 0) {
//				thread1.flag = false;
//			}
//		} while (userInput != 0 );
	
		
		// 삼항연산자 사용한 방법
		do {
			userInput = scanner.nextInt();
			thread1.flag = userInput == 0 ? false : true;
		}while(userInput != 0 );

		
	}

}
