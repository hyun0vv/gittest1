package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 선언한다
interface CallbackBtnAction {

	public abstract void clickedAddBtn();

	public void clickedMinusBtn();

	// 매개변수로 값 전달 가능
	public void passValue(int value);

	// 문제2. 메서드 3개 추가 생성
	public void clickedAddBtn10();

	public void clickedAddBtn20();

	public void clickedMinusBtn20();

}// end of interface

// 콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의 한다.
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

		// 콜백되어지는 메서드 :
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn() {

		System.out.println("마이너스 콜백 받았습니다");
		count--;
		label.setText(count + "");

	}

	@Override
	public void clickedAddBtn10() {
		System.out.println("플러스 10 콜백 받았습니다");
		count += 10;
		label.setText(count + "");

	}

	@Override
	public void clickedAddBtn20() {
		System.out.println("플러스 20 콜백 받았습니다");
		count += 20;
		label.setText(count + "");

	}

	@Override
	public void clickedMinusBtn20() {
		System.out.println("마이너스 20 콜백 받았습니다");
		count -= 20;
		label.setText(count + "");

	}

	@Override
	public void passValue(int value) {
		System.out.println("value 값을 전달받음 : " + value);
		label.setText(value+"");
	}

}// end of mainActivity

// 콜리 ( 호출자) : 콜백받는 객체의 주소값을 알고있어야 메서드가 호출되었다고 알릴수있다.
class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd;
	JButton btnMinus;
	// 문제1. 버튼 3개 생성
	JButton btnAdd10;
	JButton btnAdd20;
	JButton btnMinus20;
	JButton btnPassValue;

	// 1. 멤버변수로 선언을 해준다.
	CallbackBtnAction callbackBtnAction;

	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!
		this.callbackBtnAction = callbackBtnAction;

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnAdd = new JButton("+ 1 버튼");
		btnMinus = new JButton("- 1 버튼");
		btnAdd10 = new JButton("+ 10 버튼");
		btnAdd20 = new JButton("+ 20 버튼");
		btnMinus20 = new JButton("- 20 버튼");
		btnPassValue = new JButton("값 전달 버튼");
		
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

//		System.out.println("더하기 버튼이 클릭 되었습니다.");
//		callbackBtnAction.clickedAddBtn();
	}

}// end of SubActivity

public class CallbackTest {

	public static void main(String[] args) {

		MainActivity mainActivity = new MainActivity();

		new SubActivity(mainActivity);

	}// end of main

}
