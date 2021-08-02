package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_List {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();

		int num;
		String addNum, printNum;
		System.out.print("만들 공간의 개수 입력 : ");
		num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.print("추가할 수 입력 : ");
			addNum=sc.next();
			arr.add(addNum);
		}
		System.out.println("----저장 값 출력----");
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		/*
		 자료형에서 첫글자가 대문자로 만들어진 자료형에선 .을 찍으면 기능들을 제공해준다.
		 자료형에서 첫글자가 소문자로 만들어진 자료형에서는 특별한 기능이 없다.
		 */
	}
}
                            