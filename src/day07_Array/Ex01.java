package day07_Array;

public class Ex01 {

	/*
	 # �迭
	  : ���� �ڷ������� �������� ������ ����� ����ϴ� ��
	  - ����
	   : �ڷ���[] �迭��;
	     �ڷ��� �迭��(������)[];
	  - index(�ε���:÷��) : 0������ ����
	 */
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		
		System.out.println(arr.length);
		
		for(int i=0;i<5;i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		
		int arr01[] = {10,20,30,40,50};
		for(int i=0; i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
	}
}
