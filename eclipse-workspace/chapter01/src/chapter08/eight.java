package chapter08;

import java.util.Scanner;

public class eight {
	

	
	public static void main(String[] args) {
		int  year, month, month2, plus;
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� �Է�:");
		month = s.nextInt();
		
		switch(month) {
		
		case 1:
			month2 = 31;
			//break;
			
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
			month2 = 31;
			//break;
			
		case 4:
			month2 = 30;
			//break;
			
		case 5:
			month2 = 31;
			//break;
			
		case 6:
			month2 = 30;
			//break;
			
		case 7:
			month2 = 31;
			//break;
			
		case 8:
			month2 = 31;
			//break;
			
		case 9:
			month2 = 30;
			//break;
			
		case 10:
			month2 = 31;
			//break;
			
		case 11:
			month2 = 30;
			//break;
			
		case 12:
			month2 = 31;
			//break;
		
		

			
		if(month2 == 31)
			{
				System.out.printf("%d���� �ϼ��� 31���Դϴ�.",  month);
				break;
			}
		else
			{
				System.out.printf("%d���� �ϼ��� 30���Դϴ�.",  month);
				break;
			}
		}
	}
		
			
}


