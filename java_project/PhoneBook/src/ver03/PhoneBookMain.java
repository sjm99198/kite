package ver03;

import java.util.Scanner;

import ver01.PhoneInfor;

public class PhoneBookMain {

	// 저장 공간 : 배열 생성
	static PhoneInfor[] pBook = new PhoneInfor[100];
	// 저장된 정보의 개수 : 저장시의 index, 배열의 반복의 조건, 저장된 정보의 개수
	static int cnt = 0;

	static Scanner sc = new Scanner(System.in);

	// 기능 : 전화번호 정보 저장, 검색, 삭제, 찾기(검색어로 배열의 index 찾기)

	public static void main(String[] args) {
		
		while(true) {
			insert();
		}
		
		
		
	}

	public static void insert() {

		System.out.println("------------------------------");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String pNum = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		String bDay = sc.nextLine();
		
		PhoneInfor pi=null;
		
		if(bDay != null && bDay.trim().length()>0 ) {
			pi=new PhoneInfor(name, pNum, bDay);
		} else {
			pi=new PhoneInfor(name, pNum);
		}

		pBook[cnt++] = pi;
		// 저장된 횟수 증가
		// cnt++;
		
		System.out.println("정상적으로 저장되었습니다.");
		
		
		//System.out.println("저장된 정보의 개수는 : " + cnt);
		//pBook[cnt-1].showInfo();
	}

	
	public static int searchIndex(String name) {
		// index : 0 ~ N-1
		// index -> -1
		
		// 찾는 index가 없다의 의미 : -1
		int index = -1;
		
		// index 찾기 : i-> 0~cnt-1
		for(int i=0; i<cnt; i++) {
			
			if(pBook[i].name.equals(name)) {
				index = i;
				break;
			}
		}
		
		
		return index;
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
