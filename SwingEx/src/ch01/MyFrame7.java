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
		setTitle("키 이벤트 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
		
		// 여기서 this는 KeyListener를 뜻하는것
//		area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					area.append("위쪽 방향키를 눌렀습니다.");
				}else if( e.getKeyCode() == KeyEvent.VK_DOWN) {
					area.append("아래쪽 방향키를 눌렀습니다.");
				}else if( e.getKeyCode() == KeyEvent.VK_LEFT) {
					area.append("왼쪽 방향키를 눌렀습니다.");
				}else if( e.getKeyCode() == KeyEvent.VK_RIGHT) {
					area.append("오른쪽 방향키를 눌렀습니다.");
				}else {
					area.append("방향키를 누르지 않았습니다.");
				}
			}
		});
	}

	
	// 문자를 눌렀을때 호출, 문자키에만 반응합니다 (화살표나 기능키에는 반응없음)
//	@Override
//	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyTyped : " + e.getID());
//	}
//
//	// 키보드를 눌렀을때 호출, 모든 키보드에 반응합니다
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed : " + e.getID());
//		e.getKeyCode();
//		
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode()+"");
//		
//		int code = e.getKeyCode();
//		// JTextArea인 area에 내가 누른값을 보이게 하는 코드
//		area.append(code + "\n");
//		
//		// 위쪽 방향키 눌러짐
//		// 아래쪽 방향키 눌러짐
//		// 왼쪽 방향키 
//		// 오른쪽 방향키
//		if(code == KeyEvent.VK_UP) {
//			area.append("위쪽 방향키를 눌렀습니다.");
//		}else if( code == KeyEvent.VK_DOWN) {
//			area.append("아래쪽 방향키를 눌렀습니다.");
//		}else if( code == KeyEvent.VK_LEFT) {
//			area.append("왼쪽 방향키를 눌렀습니다.");
//		}else if( code == KeyEvent.VK_RIGHT) {
//			area.append("오른쪽 방향키를 눌렀습니다.");
//		}else {
//			area.append("방향키를 누르지 않았습니다.");
//		}
//	}
//
//	// 키보드를 땠을때 호출, 모든 키보드에 반응합니다
//	@Override
//	public void keyReleased(KeyEvent e) {
//		System.out.println("keyReleased : " + e.getID());
//	}

}// end of class
