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
		
		// ������ �ְ� ( �ε����� �ִ�) �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// ����� ���ÿ� �ʱ�ȭ
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		// �� �߰����
		list.add(3); // index  0��°
		list.add(null); // index  1��°
		list.add(1, 10); // index 1��°�� 10�� ���� (���� 1��°�� �ִ� null�� �ڵ����� index2��°�� �з�����)
		System.out.println("�� Ȯ�� : " + list);
		
		// �� �������
		list.remove(2);
		System.out.println("�� ���� Ȯ�� : " + list);
//		list.clear();
//		System.out.println("�� ��ü���� Ȯ�� : " + list);
		
		// �� ��¹�� (�������� ���)
		// 1.
		System.out.println("�� ��� ��� : " +list.get(1));
		// 2.
		for (Integer i : list) {
			System.out.println("for ����� : " + i);
		}
		//3.
		// while �����
		// ��� ��ȸ ( �ݺ��� ) �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ°� 
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while����ϴ� �� : " + iter.next());
		}
		
		// �� �˻����
		// 1.
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		
		// 2.
		// ���� ������ �ε����� ��ȣ�� ��ȯ ������ -1�� ��ȯ�ϴ� �༮
		System.out.println(list.indexOf(10));  // 1��° �ε����� �ִ� �˷���
		System.out.println(list.indexOf(300));  // ������ -1�� ��ȯ�Ѵ�
		System.out.println(list.indexOf(3));  // 0��° �ε����� �ִ�
		
		
		
		// ���� 1
		ArrayList<String> names = new ArrayList<String>();
		
		// ��ĳ�� ��� 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		
		// �̸��� �Է��ϸ� names����Ʈ�� ���� while
		String input;
//		while() {
//			input = scanner.nextLine();
//			names.add(input);
//			
//		}
		
		
		
		
		// ȭ�鿡 �Է��� �̸��� �ѷ��ּ���
		
		
		
		
		
//		Iterator<String> iterator = names.iterator();
//		while(iterator.hasNext()) {
//			System.out.println("[ ����� �̸� ȭ�鿡 ��� ]\n" + iterator.next());
//		}
		
		
		
		
		
	}

}
