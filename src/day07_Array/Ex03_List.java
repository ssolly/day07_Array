package day07_Array;

import java.util.ArrayList;

public class Ex03_List {

	/*
	 # List
	  - ArrayList
	   └ 데이터에 대한 순서가 있다. index로 접근 가능
	   └ 중복된 데이터를 저장할 수 있다
	   └ 배열과는 다르게 서로 다른 자료형도 넣을 수 있다
	   └ 가변의 크기를 갖는다
	  - LinkedList
	  - Stack...등등
	 */
	
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		
		arr.add("123");
		arr.add("456");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		System.out.println(arr.size());
		
		System.out.println(arr.contains("1231"));
		
		//System.out.println(arr.remove("123"));
		System.out.println(arr.remove(1));
		
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		arr.clear();//ArrayList안 내용들을 전부 삭제
		System.out.println("삭제 후 arr : " + arr);
		
	}
}
