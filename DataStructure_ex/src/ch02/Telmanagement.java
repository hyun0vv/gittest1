package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Telmanagement {

	// �����ϴ� ���
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		String name, address, telephone;
		Scanner s = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("* �Է� ������ : 0 �� ");
			System.out.println("�̸� >> : ");
			name = s.next();
			if (name.equals("0")) {
				flag = false;
				break;
			}
			System.out.println("�ּ� >> : ");
			address = s.next();
			System.out.println("��ȭ��ȣ >> : ");
			telephone = s.next();
			

			phone = new Phone(name, address, telephone);
			map.put(phone.name, phone);

		}

	}

	// ����
	public static void delete(HashMap<String, Phone> map) {
		System.out.println("���� �� ������ �̸��� �Է����ּ���");
		Scanner sc = new Scanner(System.in);

		String del = sc.next();
		// key�� �̸��� �Է� �޾Ƽ� ���
		if (map.containsKey(del)) {
			System.out.println("���� �� ����� �̸� : " + map.get(del).name + " / ����ó : " + map.get(del).telephone);
			
			map.remove(del);
		} else {
			System.out.println(del + "�� ��ϵ��� ���� ����Դϴ�.");
		}

	}

	// ã��
	public static void search(HashMap<String, Phone> map) {
		System.out.println("�˻��� ������ �̸��� �Է����ּ���");
		Scanner scn = new Scanner(System.in);

		String ser = scn.next();
		// key �̸��� �Է� �޾Ƽ� ã�� ȭ�鿡 �����ּ���

		if (map.containsKey(ser)) {
			System.out.println(map.get(ser).name + map.get(ser).telephone + map.get(ser).address);
		} else {
			System.out.println("��ϵ��� ���� ����Դϴ�.");
		}

	}

	// ��ü����
	public static void showInfo(HashMap<String, Phone> map) {

		// ȭ�鿡 ��ü������ �ѷ��ִ� ����� ����� �ּ���.

		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println("=======================\n"
							+  "    ����� ���� ��ü����\n"
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

		// ������ �帧 ������
		

//		System.out.println("�߰��� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");

		// �޼��� �̿��غ���
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("----------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("----------------");
		
		
		
		while (flag) {

			System.out.println("���ϴ� �۾��� �������ּ���.\n" 
								+ "0. ����� �߰��ϱ�\n" 
								+ "1. ����� �����ϱ�\n" 
								+ "2. ����� �˻��ϱ�\n" 
								+ "3. ��������\n"
								+ "4. ������\n" 
								+ "��ȣ �Է� : ");

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
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				
			}
			System.out.println();
		}
		System.out.println();

	}

}
