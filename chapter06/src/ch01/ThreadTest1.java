package ch01;

public class ThreadTest1 {
	
	// 메인함수 ( 메인쓰레드 )
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			
		}// end of for
		
		
		
	}// end of main

}// end of class
