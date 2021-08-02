package day07_Array;

public class Ex01 {

	/*
	 # 배열
	  : 같은 자료형으로 여러개의 공간을 만들어 사용하는 것
	  - 형식
	   : 자료형[] 배열명;
	     자료형 배열명(변수명)[];
	  - index(인덱스:첨자) : 0번부터 시작
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
