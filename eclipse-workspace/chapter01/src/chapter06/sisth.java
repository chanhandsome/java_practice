package chapter06;

import java.util.Scanner;

public class sisth {

	public static void main(String[] args) {
		char moon;

		Scanner s = new Scanner(System.in);
		
		System.out.println("문자 입력하세요 :");
		moon = s.next().charAt(0);

		
		System.out.printf("%c의 아스키 코드값은%d 입니다", moon, (int)moon);
		
		
	}

}
