package ch01;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame5 extends JFrame {
	
	JLabel label; 
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("hello java ~ ");
		label.setSize(150, 50);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		
		// label ó�� ��ġ �����ϴ� �޼ҵ�
		label.setLocation(12, 40);
	}
	
	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {
			
			// ���콺�� ���������� ����Ǵ� �޼���
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			// ���콺�� ������������ ( ���������� ) ����Ǵ� �޼���
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			// ���콺�� �������� ����Ǵ� �޼���
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			// ���콺�� �������� ����Ǵ� �޼���
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			// ���콺�� Ŭ���Ǿ����� ����Ǵ� �ż���
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(e.getX() + " : ��ǥ�� x");
				System.out.println(e.getY() + " : ��ǥ�� y");
				
				label.setLocation(e.getX(), e.getY());
				
			}
		});
		
	} // end of addEventListener
	
	// ���� �Լ�
	public static void main(String[] args) {
		new MyFrame5();
	}
	
}
