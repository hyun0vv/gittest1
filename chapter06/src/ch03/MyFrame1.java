package ch03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame{

	
	BorderLayout borderLayout;
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	
	JButton button1;
	JButton button2;
	JPanel  panel1;
	JPanel  panel2;
	
	MyImagePanel imagePanel;
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("이미지 백그라운드 연습하기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayout = new BorderLayout();
		
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon1 = ImageIO.read(new File("image2.png"));
			imageIcon2 = ImageIO.read(new File("image3.png"));
			
		} catch (IOException e) {
			System.err.println("파일을 찾을 수 없습니다");
			System.exit(0);
		}
		
		imagePanel = new MyImagePanel();
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		button1 = new JButton("Start");
		button2 = new JButton("Stop");
		
	}
	
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(borderLayout);

		
		panel1.add(imagePanel);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);
		panel2.add(button1);
		panel2.add(button2);

		
		
//		panel1.setPreferredSize(new Dimension(500, 500));
//		panel1.add(imagePanel);
//		add(panel1, BorderLayout.NORTH);
//		
//		panel2.setPreferredSize(new Dimension(500,100));
//		add(panel2,BorderLayout.SOUTH);
	
		
	}


	private void addEventListener() {
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JButton b1 = (JButton)e.getSource();
				boolean flag = true;
				
				if(b1.getText().equals(button1.getText())) {
					while(flag) {
						
					}
				}else {
					
				}
				
			}
		};
		
	}
	
	
	
	private class MyImagePanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 400, null);
			g.drawImage(imageIcon1, 50, 50, 100, 100, null);
			g.drawImage(imageIcon2, 300, 300, 100, 100, null);
			
		}
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new MyFrame1();
		
		
		
	}
}