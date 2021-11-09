package ch01;

/**
 * import 안될때
 * Window->Preferences->Java->Appearance->Type Filters에서 java.awt.*체크 해제
 */



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {
	
	JButton button;
	JButton button2;
	// 코드 수정
	// button2생성
	// add, 
	// 이벤트 리스너 등록 -> 익명구현객체를 사용해서 처리
	// 실행확인
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("익명 구현객체 사용해보기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("버튼2");
	}
	
	private void setInitLayout() {
		setVisible(true);
		
//		setLayout(new GridLayout(2,1));
		
		add(button, BorderLayout.NORTH);
		add(button2 , BorderLayout.SOUTH);
	}
	
	private void addEventListener() {
		
		ActionListener ac = (new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				  System.out.println("버튼 클릭됨");
				  System.out.println("추후 알아서 코드 작성해주세요");
			  }
		});
			
			
		
		
		
		// 익명 구현 객체
		// 일회성의 인터페이스를 익명구현객체로 만들어서 사용할수있다.
		// 
		
		button.addActionListener(ac);
		
		button.addActionListener(ac);
	}// end of addEventListener
	
	
	public static void main(String[] args) {
//		MyFrame4 mf = new MyFrame4();
//		mf.button.setText("안녕하세요");
		
		// 익명클래스 ( 인스턴스 변수가 없기 때문에 지속적으로 접근해서 사용할수는없다.)
		new MyFrame4();
		
	}// end of main

}// end of class