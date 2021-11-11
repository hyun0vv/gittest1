package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Telmanagement {

	// 삽입하는 기능
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		String name, address, telephone;
		Scanner s = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("* 입력 나가기 : 0 번 ");
			System.out.println("이름 >> : ");
			name = s.next();
			if (name.equals("0")) {
				flag = false;
				break;
			}
			System.out.println("주소 >> : ");
			address = s.next();
			System.out.println("전화번호 >> : ");
			telephone = s.next();
			

			phone = new Phone(name, address, telephone);
			map.put(phone.name, phone);

		}

	}

	// 삭제
	public static void delete(HashMap<String, Phone> map) {
		System.out.println("삭제 할 정보의 이름을 입력해주세요");
		Scanner sc = new Scanner(System.in);

		String del = sc.next();
		// key는 이름을 입력 받아서 사용
		if (map.containsKey(del)) {
			System.out.println("삭제 한 사용자 이름 : " + map.get(del).name + " / 연락처 : " + map.get(del).telephone);
			
			map.remove(del);
		} else {
			System.out.println(del + "은 등록되지 않은 사람입니다.");
		}

	}

	// 찾기
	public static void search(HashMap<String, Phone> map) {
		System.out.println("검색할 정보의 이름을 입력해주세요");
		Scanner scn = new Scanner(System.in);

		String ser = scn.next();
		// key 이름을 입력 받아서 찾고 화면에 보여주세요

		if (map.containsKey(ser)) {
			System.out.println(map.get(ser).name + map.get(ser).telephone + map.get(ser).address);
		} else {
			System.out.println("등록되지 않은 사람입니다.");
		}

	}

	// 전체보기
	public static void showInfo(HashMap<String, Phone> map) {

		// 화면에 전체정보를 뿌려주는 기능을 만들어 주세요.

		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println("=======================\n"
							+  "    사용자 정보 전체보기\n"
							+  "-----------------------");
			System.out.println(name + " " + person.telephone);
			System.out.println("=======================");
		}

//		for (String name : map.keySet()) {
//			System.out.println(name + " : " + map.get(name));
//		}
	}

	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();

		// 실행의 흐름 만들어보기
		

//		System.out.println("추가는 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");

		// 메서드 이용해보기
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("----------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("----------------");
		
		
		
		while (flag) {

			System.out.println("원하는 작업을 선택해주세요.\n" 
								+ "0. 사용자 추가하기\n" 
								+ "1. 사용자 삭제하기\n" 
								+ "2. 사용자 검색하기\n" 
								+ "3. 정보보기\n"
								+ "4. 나가기\n" 
								+ "번호 입력 : ");

			int input = sc.nextInt();

			switch (input) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				
			}
			System.out.println();
		}
		System.out.println();

	}

}
