package ch01;

/**
 * import �ȵɶ�
 * Window->Preferences->Java->Appearance->Type Filters���� java.awt.*üũ ����
 */



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {
	
	JButton button;
	JButton button2;
	// �ڵ� ����
	// button2����
	// add, 
	// �̺�Ʈ ������ ��� -> �͸�����ü�� ����ؼ� ó��
	// ����Ȯ��
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�͸� ������ü ����غ���");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("��ư2");
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
				  System.out.println("��ư Ŭ����");
				  System.out.println("���� �˾Ƽ� �ڵ� �ۼ����ּ���");
			  }
		});
			
			
		
		
		
		// �͸� ���� ��ü
		// ��ȸ���� �������̽��� �͸�����ü�� ���� ����Ҽ��ִ�.
		// 
		
		button.addActionListener(ac);
		
		button.addActionListener(ac);
	}// end of addEventListener
	
	
	public static void main(String[] args) {
//		MyFrame4 mf = new MyFrame4();
//		mf.button.setText("�ȳ��ϼ���");
		
		// �͸�Ŭ���� ( �ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����Ҽ��¾���.)
		new MyFrame4();
		
	}// end of main

}// end of class