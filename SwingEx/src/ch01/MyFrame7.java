package ch01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
		
		// ���⼭ this�� KeyListener�� ���ϴ°�
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("���� ����Ű�� �������ϴ�.");
				}else if( e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("�Ʒ��� ����Ű�� �������ϴ�.");
				}else if( e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("���� ����Ű�� �������ϴ�.");
				}else if( e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("������ ����Ű�� �������ϴ�.");
				}else {
					area.append("����Ű�� ������ �ʾҽ��ϴ�.");
				}
			}
		});
	}

	
	// ���ڸ� �������� ȣ��, ����Ű���� �����մϴ� (ȭ��ǥ�� ���Ű���� ��������)
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyTyped : " + e.getID());
//	}
//
//	// Ű���带 �������� ȣ��, ��� Ű���忡 �����մϴ�
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());
//		e.getKeyCode();
//		
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode()+"");
//		
//		int code = e.getKeyCode();
//		// JTextArea�� area�� ���� �������� ���̰� �ϴ� �ڵ�
//		area.append(code + "\n");
//		
//		// ���� ����Ű ������
//		// �Ʒ��� ����Ű ������
//		// ���� ����Ű 
//		// ������ ����Ű
//		if(code == KeyEvent.VK_UP) {
//			area.append("���� ����Ű�� �������ϴ�.");
//		}else if( code == KeyEvent.VK_DOWN) {
//			area.append("�Ʒ��� ����Ű�� �������ϴ�.");
//		}else if( code == KeyEvent.VK_LEFT) {
//			area.append("���� ����Ű�� �������ϴ�.");
//		}else if( code == KeyEvent.VK_RIGHT) {
//			area.append("������ ����Ű�� �������ϴ�.");
//		}else {
//			area.append("����Ű�� ������ �ʾҽ��ϴ�.");
//		}
//	}
//
//	// Ű���带 ������ ȣ��, ��� Ű���忡 �����մϴ�
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.getID());
//	}

}// end of class
