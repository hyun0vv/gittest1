package ch03;

import java.util.Scanner;

// �ݸ� ( ȣ���� )
public class MyArticle {
	
	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	
	Scanner scanner = new Scanner(System.in);
	
	
	// �ּҰ� ����
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		
		this.hacker = hacker;
		this.sbs = sbs;
		
	}
	
	
	public void complete() {
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ��������ּ���
		// nextLine
		System.out.println("������ ������ �Է����ּ��� ");
		article = scanner.nextLine();
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
	
}
