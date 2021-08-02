package day07_Array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		//반복문을 이용해서 arr에 저장되어 있는 짝수의 값과 홀수의 값을 따로 출력하시오
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println("짝수 : " + arr[i]);
			} else {
				System.out.println("홀수 : " + arr[i]);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		//int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("짝수, 홀수, 입력 : ");
		odd_even = sc.next();
		
		if(odd_even.equals("짝수")) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.println("짝수 : " + arr[i]);
				}
			}
		} else if(odd_even.equals("홀수")) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					System.out.println("홀수 : " + arr[i]);
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0 && odd_even.equals("짝수")) {
				System.out.println(odd_even + " : "+arr[i]);
			} else if(arr[i]%2!=0 && odd_even.equals("홀수")) {
				System.out.println(odd_even + " : "+arr[i]);
			}
		}
	}
}
