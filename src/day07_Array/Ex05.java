package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList food = new ArrayList();
		food.add("����");
		food.add("�ұ�");
		food.add("���");
		food.add("���");
		
		System.out.println(food);
		System.out.print("ã�� �� �Է� : ");
		String input = sc.next();
		System.out.println(input+"��ġ : " + food.indexOf(input));
		
		
		System.out.print("������ ��ġ �Է� : ");
		int num = sc.nextInt();
		System.out.print("������ �� �Է� : ");
		input = sc.next();
		System.out.println("���� �� \n" + food);
		food.set(num, input);
		System.out.println("���� �� \n" + food);
	}
}
