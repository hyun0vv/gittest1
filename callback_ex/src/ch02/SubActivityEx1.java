package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SubActivityEx1 extends JFrame implements CallbackBtn2{

	int count;
	JLabel label;
	
	public SubActivityEx1() {
		count = 0;
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		label = new JLabel(count + "");
		add(label);
		
	}
	
	@Override
	public void clickedAddBtn() {
		System.out.println("플러스 1 콜백 되었습니다");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedAddBtn10() {
		System.out.println("플러스 10 콜백 되었습니다");
		count+=10;
		label.setText(count + "");
	}

	@Override
	public void clickedAddBtn20() {
		System.out.println("플러스 20 콜백 되었습니다");
		count+=20;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus() {
		System.out.println("마이너스 1 콜백 되었습니다");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus10() {
		System.out.println("마이너스 10 콜백 되었습니다");
		count-=10;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus20() {
		System.out.println("마이너스 20 콜백 되었습니다");
		count-=20;
		label.setText(count + "");
	}
	
	
	
	
	
	
}
