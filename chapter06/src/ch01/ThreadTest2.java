package ch01;

class MyThreadEx2 extends Thread{
	
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
		
	}
	
	// ���
	@Override
	public void run() {
		int i;
		for(i = 0; i < 50; i++) {
			System.out.println(name + " : " + i + "\t");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of run
	
	
}// end of MyThreadEx2


public class ThreadTest2 {
	// ���� ������
	public static void main(String[] args)  {
		
		System.out.println(Thread.currentThread());
		System.out.println("���� ������ ����");
		
//		MyThreadEx2 th1 = new MyThreadEx2("�۾���1");
//		th1.start();     // <- ���������۾��� �����ϴ� ��ɾ�
//		
//		MyThreadEx2 th2 = new MyThreadEx2("�۾���2");
//		th2.start();
//		
//		
//		MyThreadEx2 th3 = new MyThreadEx2("�۾���3");
//		th3.start();
	
		
		for( int i = 0 ; i < 50 ; i++) {
			System.out.println("test : " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("���� ������ ����");
		
		
		
		
		
	}// end of main

}// end of class
