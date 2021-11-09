package ch02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame implements ActionListener {

	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;

	CustomJPanel customJPanel;

	//
	BorderLayout borderLayout;
	JPanel bottomPanel;
	JButton btnStart;
	JButton btnStop;

	// thread 사용할 이미지
	int among1XPoint = 0;
	int among1YPoint = 370;

	int among2XPoint = 200;
	int among2YPoint = 200;

	boolean isOn = true;
	boolean isRight;
	JButton btn1;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		// 스레드 동작 시작
		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage2 = ImageIO.read(new File("among2.png"));
		} catch (Exception e) {
			System.out.println(" 파일이 없습니다 ");
		}

		customJPanel = new CustomJPanel();

		borderLayout = new BorderLayout();
		bottomPanel = new JPanel();
		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");

	}

	private void setInitLayout() {

		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(borderLayout);

		this.add(customJPanel, BorderLayout.CENTER);
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		bottomPanel.add(btnStart);
		bottomPanel.add(btnStop);

	}

	private void addEventListener() {

		btnStart.addActionListener(this);
		btnStop.addActionListener(this);

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				switch (code) {
				case KeyEvent.VK_UP:
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				}

				repaint();

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. 버튼이 스탑, 스타트 구분
		// getSource가 오브젝트타입이라 형변환 필요
		btn1 = (JButton) e.getSource();
		if (btn1 == btnStart) {
			System.out.println("시작버튼");
			isOn = true;
		} else {
			System.out.println("종료버튼");
			isOn = false;

		}

		// 2. 변수를 새롭게 활용해서 while문 멈추거나 다시 시작하게끔 코드 수정
	}

	// 내부클래스
	private class CustomJPanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {

			isRight = true;

			// 무한반복으로 x축으로 왔다갔다 거리기

			while (true) {

				if (isOn) {

					if (isRight) {
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}

					if (among1XPoint == 400) {
						isRight = false;
					}

					if (among1XPoint == 0) {
						isRight = true;
					}

					// 이미지1과 이미지2의 좌표값 x,y가 일치한다면 이미지2를없애라

					if ((among1XPoint == among2XPoint) && (among1YPoint == among2YPoint)) {
						amongImage2 = null;
					}

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				repaint();

			} // end of while

		}
	}// end of 내부클래스

}// end of mini어몽어스

public class MainTest1 {

	public static void main(String[] args) {

		new MiniAmongUs();

	}// end of main

}// end of class
