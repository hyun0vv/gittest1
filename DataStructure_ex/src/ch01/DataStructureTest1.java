package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
	String name;
	int grade;
	
}

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		List list0;
		
		// 순서가 있고 ( 인덱스가 있다) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// 선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		// 값 추가방법
		list.add(3); // index  0번째
		list.add(null); // index  1번째
		list.add(1, 10); // index 1번째에 10을 삽입 (원래 1번째에 있던 null은 자동으로 index2번째로 밀려난다)
		System.out.println("값 확인 : " + list);
		
		// 값 삭제방법
		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);
//		list.clear();
//		System.out.println("값 전체삭제 확인 : " + list);
		
		// 값 출력방법 (꺼내오는 방법)
		// 1.
		System.out.println("값 출력 방법 : " +list.get(1));
		// 2.
		for (Integer i : list) {
			System.out.println("for 사용방법 : " + i);
		}
		//3.
		// while 사용방법
		// 요소 순회 ( 반복자 ) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것 
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while사용하는 법 : " + iter.next());
		}
		
		// 값 검색방법
		// 1.
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		// 2.
		// 값이 있으면 인덱스의 번호를 반환 없으면 -1을 반환하는 녀석
		System.out.println(list.indexOf(10));  // 1번째 인덱스에 있다 알려줌
		System.out.println(list.indexOf(300));  // 없으면 -1을 반환한다
		System.out.println(list.indexOf(3));  // 0번째 인덱스에 있다
		
		
		
		// 문제 1
		ArrayList<String> names = new ArrayList<String>();
		
		// 스캐너 사용 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		
		// 이름을 입력하면 names리스트에 저장 while
		String input;
//		while() {
//			input = scanner.nextLine();
//			names.add(input);
//			
//		}
		
		
		
		
		// 화면에 입력한 이름을 뿌려주세요
		
		
		
		
		
//		Iterator<String> iterator = names.iterator();
//		while(iterator.hasNext()) {
//			System.out.println("[ 저장된 이름 화면에 출력 ]\n" + iterator.next());
//		}
		
		
		
		
		
	}

}
