package ch01;

// 마우스 어댑터 사용
// 불필요한 코드줄이고 가독성 높이기위해

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame{

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("어댑터 클래스 사용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
	}
	
	private void setInitLayout() {
		setVisible(true);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
		
	}

	// 추상메소드는 new키워드를 사용할수없다. 클래스의 타입으로만 존재한다.
	// 어댑터 패턴이란 추상메서드를 다 구현하고 (일반메서드로 다 변환시킨것) { 구현부는 비워놓음 }
	// 내부 클래스
	private class MyMouseListener extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x좌표값 : " + x);
			System.out.println("y좌표값 : " + y);
		}

	}

	// 메인함수
	public static void main(String[] args) {
		
		new MyFrame6();

	}// end of main

}// end of class
