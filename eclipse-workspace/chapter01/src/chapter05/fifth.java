package chapter05;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		int i, gugu;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("����� ����ұ��? :");
		gugu = s.nextInt();
		
		for(i=1; i<=9; i++)
		System.out.printf("������ : %d X %d = %d \n", gugu, i, gugu*i);

	}

}
