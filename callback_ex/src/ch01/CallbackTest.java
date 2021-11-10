package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// �������̽��� �����Ѵ�
interface CallbackBtnAction {

	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	// �Ű������� �� ���� ����
	public void passValue(int value);

	// ����2. �޼��� 3�� �߰� ����
	public void clickedAddBtn10();

	public void clickedAddBtn20();

	public void clickedMinusBtn20();

}// end of interface

// �ݹ� �޴� ��ü : CallbackBtnAction �������̽��� �����ؼ� �޼��带 ���� �Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction {

	int count;
	JLabel label;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
	}

	@Override
	public void clickedAddBtn() {

		// �ݹ�Ǿ����� �޼��� :
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn() {

		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedAddBtn10() {
		System.out.println("�÷��� 10 �ݹ� �޾ҽ��ϴ�");
		count += 10;
		label.setText(count + "");

	}

	@Override
	public void clickedAddBtn20() {
		System.out.println("�÷��� 20 �ݹ� �޾ҽ��ϴ�");
		count += 20;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn20() {
		System.out.println("���̳ʽ� 20 �ݹ� �޾ҽ��ϴ�");
		count -= 20;
		label.setText(count + "");

	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���޹��� : " + value);
		label.setText(value+"");
	}

}// end of mainActivity

// �ݸ� ( ȣ����) : �ݹ�޴� ��ü�� �ּҰ��� �˰��־�� �޼��尡 ȣ��Ǿ��ٰ� �˸����ִ�.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// ����1. ��ư 3�� ����
	JButton btnAdd10;
	JButton btnAdd20;
	JButton btnMinus20;
	JButton btnPassValue;

	// 1. ��������� ������ ���ش�.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿�!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnAdd = new JButton("+ 1 ��ư");
		btnMinus = new JButton("- 1 ��ư");
		btnAdd10 = new JButton("+ 10 ��ư");
		btnAdd20 = new JButton("+ 20 ��ư");
		btnMinus20 = new JButton("- 20 ��ư");
		btnPassValue = new JButton("�� ���� ��ư");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		add(btnAdd);
		add(btnMinus);
		add(btnAdd10);
		add(btnAdd20);
		add(btnMinus20);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnAdd10.addActionListener(this);
		btnAdd20.addActionListener(this);
		btnMinus20.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton targetBtn = (JButton) e.getSource();

		if (targetBtn == btnAdd) {
			callbackBtnAction.clickedAddBtn();
		} else if (targetBtn == btnMinus) {
			callbackBtnAction.clickedMinusBtn();
		} else if (targetBtn == btnAdd10) {
			callbackBtnAction.clickedAddBtn10();
		} else if (targetBtn == btnAdd20) {
			callbackBtnAction.clickedAddBtn20();
		} else if (targetBtn == btnPassValue) {
			callbackBtnAction.passValue(100);
		} else {
			callbackBtnAction.clickedMinusBtn20();
		}

//		System.out.println("���ϱ� ��ư�� Ŭ�� �Ǿ����ϴ�.");
//		callbackBtnAction.clickedAddBtn();
	}

}// end of SubActivity

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();

		new SubActivity(mainActivity);

	}// end of main

}
