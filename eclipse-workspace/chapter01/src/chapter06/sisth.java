package chapter06;

import java.util.Scanner;

public class sisth {

	public static void main(String[] args) {
		char moon;

		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� :");
		moon = s.next().charAt(0);

		
		System.out.printf("%c�� �ƽ�Ű �ڵ尪��%d �Դϴ�", moon, (int)moon);
		
		
	}

}
