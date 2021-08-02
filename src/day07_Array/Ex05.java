package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList food = new ArrayList();
		food.add("설탕");
		food.add("소금");
		food.add("라면");
		food.add("계란");
		
		System.out.println(food);
		System.out.print("찾을 값 입력 : ");
		String input = sc.next();
		System.out.println(input+"위치 : " + food.indexOf(input));
		
		
		System.out.print("변경할 위치 입력 : ");
		int num = sc.nextInt();
		System.out.print("변경할 값 입력 : ");
		input = sc.next();
		System.out.println("변경 전 \n" + food);
		food.set(num, input);
		System.out.println("변경 후 \n" + food);
	}
}
