package ch02;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainActivityEx2 extends JFrame implements ActionListener{
	
	CallbackBtn2 callbackBtn2;
	
	JButton btnAdd;
	JButton btnAdd10;
	JButton btnAdd20;
	
	JButton btnMinus;
	JButton btnMinus10;
	JButton btnMinus20;
	
	

	public MainActivityEx2(CallbackBtn2 callbackBtn2) {
		
		this.callbackBtn2 = callbackBtn2;
		
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout());
		setVisible(true);
		
		btnAdd = new JButton(" + 1 ");
		btnAdd10 = new JButton(" + 10 ");
		btnAdd20 = new JButton(" + 20 ");
		
		btnMinus = new JButton(" - 1 ");
		btnMinus10 = new JButton(" - 10 ");
		btnMinus20 = new JButton(" - 20 ");
		
		add(btnAdd);
		add(btnAdd10);
		add(btnAdd20);
		
		add(btnMinus);
		add(btnMinus10);
		add(btnMinus20);
		
		
		btnAdd.addActionListener(this);
		btnAdd10.addActionListener(this);
		btnAdd20.addActionListener(this);

		btnMinus.addActionListener(this);
		btnMinus10.addActionListener(this);
		btnMinus20.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		JButton targetBtn = (JButton) e.getSource();
		
		if(targetBtn == btnAdd) {
			callbackBtn2.clickedAddBtn();
		}else if(targetBtn == btnAdd10) {
			callbackBtn2.clickedAddBtn10();
		}else if(targetBtn == btnAdd20) {
			callbackBtn2.clickedAddBtn20();
		}else if(targetBtn == btnMinus) {
			callbackBtn2.clickedMinus();
		}else if(targetBtn == btnMinus10) {
			callbackBtn2.clickedMinus10();
		}else if(targetBtn == btnMinus20) {
			callbackBtn2.clickedMinus20();
		}
		
		
		
	}
	
	
	
	
}
