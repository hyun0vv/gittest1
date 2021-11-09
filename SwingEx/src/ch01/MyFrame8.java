package ch01;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;

	MyImagePanel imagePanel;
	int xPoint = 200;
	int yPoint = 200;

	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {

			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
//			imageIcon2 = ImageIO

		} catch (Exception e) {

			// err쓰면 글자를 빨간색으로 출력해줌
			System.err.println("파일이 없습니다.");
			System.exit(0);
		}

		imagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		this.setVisible(true);

		// 창의 크기를 늘리거나 못늘리게 하는 메소드
		this.setResizable(false);
		this.add(imagePanel);
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				// 스위치문으로 변경해보기
				// 삼항연산자
				int keyCode = e.getKeyCode();

				if (keyCode == KeyEvent.VK_UP) {
					// 위로가면 y좌표값이 줄어듬
					yPoint = (yPoint < 0) ? 0 : (yPoint -= 10);

				} else if (keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint > 500) ? 500 : (yPoint += 10);

				} else if (keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint < 0) ? 0 : (xPoint -= 10);

				} else if (keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint > 500) ? 500 : (xPoint += 10);

				}
				
				repaint();
				
			}// end of keyPressed

		});
	}

	// 내부클래스
	private class MyImagePanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}

}// end of class
