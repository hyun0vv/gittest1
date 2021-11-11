package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

//수정하기 while문


public class DataStructureTest2 {

	public static void main(String[] args) {
		
		Set set0;
		
		// 순서가 없고, 중복이 불가능 덮어쓰기로 됨
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1); // 중복값
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값 
		
		System.out.println("set1 : " + set1);
		
		// 사이즈 값
		System.out.println("사이즈 확인 : " + set1.size());
		
		// 삭제
		set1.remove(1);
		System.out.println("값 삭제 후 확인 : " + set1);
//		set1.clear();
//		System.out.println("값 전체 삭제 후 확인 : " + set1);
		
//		for (int i = 0; i < set1.size(); i++) {
//			System.out.println("set1값 확인 : " + i);
//		}
		
		// while문 사용방법
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		}
		
		// 내부에 값이 있는지 확인
		System.out.println(set1.contains(3));
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		// set2 사이즈가 6개면 완료.
		// 아니라면 한번더 동작
		boolean flag = true;
		while(flag) {
			
		}

		
		
		
		
//		if(set2.size() == 6) {
//			for (int i = 0; i < set2.size(); i++) {
//				set2.add(getRandomNumber());
//			break;
//			}
//		}else if(set2.size()!=6) {
//			
//		}
//		
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		set2.add(getRandomNumber());
//		
//		System.out.println(set2);
		
		
	}// end of main

	// 로또 번호 
	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) + 1;
		return value;
	}
	
	
	
}
