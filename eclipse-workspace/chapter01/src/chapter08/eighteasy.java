package chapter08;

import java.util.Scanner;

public class eighteasy {
	

	
	public static void main(String[] args) {
		int  year, month, plus;
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� �Է�:");
		month = s.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 2:
			System.out.println("�⵵�� �Է����ּ���:");
			year = s.nextInt();
			plus = (year%4);
			if(plus==0)
				System.out.println("2���� �ϼ��� 29���Դϴ�.");
			else
				System.out.println("2���� �ϼ��� 28���Դϴ�.");
			break;	
			
		case 3:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 4:
			System.out.printf("%d���� �ϼ��� 30���Դϴ�.",  month);
			break;
			
		case 5:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 6:
			System.out.printf("%d���� �ϼ��� 30���Դϴ�.",  month);
			break;
			
		case 7:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 8:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 9:
			System.out.printf("%d���� �ϼ��� 30���Դϴ�.",  month);
			break;
			
		case 10:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
			
		case 11:
			System.out.printf("%d���� �ϼ��� 30���Դϴ�.",  month);
			break;
			
		case 12:
			System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
			break;
		
		


		}
	}
		
			
}


