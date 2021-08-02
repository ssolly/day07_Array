package day07_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 # 연락처 저장 프로그램 만들기 
		  - ArrayList 2개를 사용
		   └ 하나의 리스트 : 이름 정보
		   └ 하나의 리스트 : 연락처 정보
		  - 1. 연락처 등록 : 이름, 전화번호 (중복 허용 X)
		  - 2. 연락처 보기 : 동록되어 있지 않으면 목록에 없습니다.
		  - 3. 연락처 삭제 : 목록에 없으면 목록에 없습니다.
		  - 4. 모든 연락처 보기 : 등록되어 있는 목록 전부 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int choice, i;
		String input_name, input_telNum;
		ArrayList name =  new ArrayList();
		ArrayList telNum = new ArrayList();
		
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1 : 
				System.out.print("이름 입력 : ");
				input_name = sc.next();
				System.out.print("연락처 입력 : ");
				input_telNum=sc.next();
				
				if(!name.contains(input_name) && !telNum.contains(input_telNum)) {
					name.add(input_name);
					telNum.add(input_telNum);
				} else {
					if (name.contains(input_name)) {
						System.out.println("동일한 이름이 존재합니다");
					} else if(telNum.contains(input_telNum)) {
						System.out.println("동일한 연락처가 존재합니다");
					}
					continue;
				}
				break;
				
			case 2 :
				System.out.print("찾을 이름 입력 : ");
				input_name = sc.next();
				if (name.contains(input_name)) {
					i = name.indexOf(input_name);
					System.out.println("이름 : " + name.get(i));
					System.out.println("연락처 : " + telNum.get(i));
				} else {
					System.out.println(input_name+"님은 연락처 목록에 없습니다.");
				}
				break;
				
			case 3 : 
				System.out.print("삭제할 이름 입력 : ");
				input_name = sc.next();
				if(name.contains(input_name)) {
					i=name.indexOf(input_name);
					name.remove(i);
					telNum.remove(i);
					System.out.println(input_name + "님 연락처가 삭제되었습니다");
				} else {
					System.out.println("연락처 목록에 존재하지 않는 이름입니다");
				}
				break;
				
			case 4 :
				System.out.println("이름\t연락처");
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
