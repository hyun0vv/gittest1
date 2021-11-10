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
		System.out.println("�÷��� 1 �ݹ� �Ǿ����ϴ�");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedAddBtn10() {
		System.out.println("�÷��� 10 �ݹ� �Ǿ����ϴ�");
		count+=10;
		label.setText(count + "");
	}

	@Override
	public void clickedAddBtn20() {
		System.out.println("�÷��� 20 �ݹ� �Ǿ����ϴ�");
		count+=20;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus() {
		System.out.println("���̳ʽ� 1 �ݹ� �Ǿ����ϴ�");
		count--;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus10() {
		System.out.println("���̳ʽ� 10 �ݹ� �Ǿ����ϴ�");
		count-=10;
		label.setText(count + "");
	}

	@Override
	public void clickedMinus20() {
		System.out.println("���̳ʽ� 20 �ݹ� �Ǿ����ϴ�");
		count-=20;
		label.setText(count + "");
	}
	
	
	
	
	
	
}
