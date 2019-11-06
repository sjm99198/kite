package test;

import java.util.Scanner;

public class Rullet2 {
	public static void main(String[] args) {
		
		int ran;
		
		Scanner kb = new Scanner(System.in);
		
		int captain = 0;
		// new String[24];
		
		// name[0] ==> 고현주
		
		// 0번지의 값 == 임의의 위치의 값을 바꾼다
		// name1, name2, temp
		// 1. temp = name1
		// 2. name1 = name2
		// 3. name2 = temp
		
		
		String[] name = { 
				"고현주", "구자윤", /* "김난형", */ "김동진", "김주연", 
				"문영기", "박준섭", "박지은", "방창용", "양햇살", 
				"엄예빈", "위은주", "이용재", "황다울", "이진형", 
				"이택수", "장한솔", "정엄지", "정용기", "조성빈", 
				"조지윤", "최찬영", "하재운", "홍지수" 
				};

		System.out.println("제비뽑기를 시작하려면 1번을 누르세요");
		int menu = Integer.parseInt(kb.nextLine());

		if (menu == 1) {
			ran = (int) (Math.random() * 24); // 0 <= ran <= 23
			//captain = ran % 24;
			System.out.print("축하합니다. 반장은 " + name[ran] + "입니다.");
		}

	}
}
