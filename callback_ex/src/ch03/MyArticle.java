package ch03;

import java.util.Scanner;

// 콜리 ( 호출자 )
public class MyArticle {
	
	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	
	Scanner scanner = new Scanner(System.in);
	
	
	// 주소값 연결
	public MyArticle(WriteArticle hacker, WriteArticle sbs) {
		
		this.hacker = hacker;
		this.sbs = sbs;
		
	}
	
	
	public void complete() {
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행시켜주세요
		// nextLine
		System.out.println("오늘의 날씨를 입력해주세요 ");
		article = scanner.nextLine();
		hacker.printArticle(article);
		sbs.printArticle(article);
	}
	
}
