package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 # ����ó ���� ���α׷� ����� 
		  - ArrayList 2���� ���
		   �� �ϳ��� ����Ʈ : �̸� ����
		   �� �ϳ��� ����Ʈ : ����ó ����
		  - 1. ����ó ��� : �̸�, ��ȭ��ȣ (�ߺ� ��� X)
		  - 2. ����ó ���� : ���ϵǾ� ���� ������ ��Ͽ� �����ϴ�.
		  - 3. ����ó ���� : ��Ͽ� ������ ��Ͽ� �����ϴ�.
		  - 4. ��� ����ó ���� : ��ϵǾ� �ִ� ��� ���� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int choice, i;
		String input_name, input_telNum;
		ArrayList name =  new ArrayList();
		ArrayList telNum = new ArrayList();
		
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>> ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1 : 
				System.out.print("�̸� �Է� : ");
				input_name = sc.next();
				System.out.print("����ó �Է� : ");
				input_telNum=sc.next();
				
				if(!name.contains(input_name) && !telNum.contains(input_telNum)) {
					name.add(input_name);
					telNum.add(input_telNum);
				} else {
					if (name.contains(input_name)) {
						System.out.println("������ �̸��� �����մϴ�");
					} else if(telNum.contains(input_telNum)) {
						System.out.println("������ ����ó�� �����մϴ�");
					}
					continue;
				}
				break;
				
			case 2 :
				System.out.print("ã�� �̸� �Է� : ");
				input_name = sc.next();
				if (name.contains(input_name)) {
					i = name.indexOf(input_name);
					System.out.println("�̸� : " + name.get(i));
					System.out.println("����ó : " + telNum.get(i));
				} else {
					System.out.println(input_name+"���� ����ó ��Ͽ� �����ϴ�.");
				}
				break;
				
			case 3 : 
				System.out.print("������ �̸� �Է� : ");
				input_name = sc.next();
				if(name.contains(input_name)) {
					i=name.indexOf(input_name);
					name.remove(i);
					telNum.remove(i);
					System.out.println(input_name + "�� ����ó�� �����Ǿ����ϴ�");
				} else {
					System.out.println("����ó ��Ͽ� �������� �ʴ� �̸��Դϴ�");
				}
				break;
				
			case 4 :
				System.out.println("�̸�\t����ó");
				System.out.println("----------------------");
				for(int n=0; n<name.size(); n++) {
					System.out.print(name.get(n));
					System.out.println("\t" + telNum.get(n));
				}
				
				break;
			case 5 :
				System.exit(1);
			}
		}
	}
}
