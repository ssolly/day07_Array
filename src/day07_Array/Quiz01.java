package day07_Array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,54,13,17,25,30};
		
		//�ݺ����� �̿��ؼ� arr�� ����Ǿ� �ִ� ¦���� ���� Ȧ���� ���� ���� ����Ͻÿ�
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println("¦�� : " + arr[i]);
			} else {
				System.out.println("Ȧ�� : " + arr[i]);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		//int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("¦��, Ȧ��, �Է� : ");
		odd_even = sc.next();
		
		if(odd_even.equals("¦��")) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.println("¦�� : " + arr[i]);
				}
			}
		} else if(odd_even.equals("Ȧ��")) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					System.out.println("Ȧ�� : " + arr[i]);
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0 && odd_even.equals("¦��")) {
				System.out.println(odd_even + " : "+arr[i]);
			} else if(arr[i]%2!=0 && odd_even.equals("Ȧ��")) {
				System.out.println(odd_even + " : "+arr[i]);
			}
		}
	}
}
