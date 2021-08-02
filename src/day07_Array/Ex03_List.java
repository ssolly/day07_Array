package day07_Array;

import java.util.ArrayList;

public class Ex03_List {

	/*
	 # List
	  - ArrayList
	   �� �����Ϳ� ���� ������ �ִ�. index�� ���� ����
	   �� �ߺ��� �����͸� ������ �� �ִ�
	   �� �迭���� �ٸ��� ���� �ٸ� �ڷ����� ���� �� �ִ�
	   �� ������ ũ�⸦ ���´�
	  - LinkedList
	  - Stack...���
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
		
		arr.clear();//ArrayList�� ������� ���� ����
		System.out.println("���� �� arr : " + arr);
		
	}
}
