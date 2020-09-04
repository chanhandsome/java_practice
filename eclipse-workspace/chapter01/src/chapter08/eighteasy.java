package chapter08;

import java.util.Scanner;

public class eighteasy {
	

	
	public static void main(String[] args) {
		int  year, month, plus;
		Scanner s = new Scanner(System.in);
		
		System.out.println("월 입력:");
		month = s.nextInt();
		
		switch(month) {
		
		case 1:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 2:
			System.out.println("년도를 입력해주세요:");
			year = s.nextInt();
			plus = (year%4);
			if(plus==0)
				System.out.println("2월의 일수는 29일입니다.");
			else
				System.out.println("2월의 일수는 28일입니다.");
			break;	
			
		case 3:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 4:
			System.out.printf("%d월의 일수는 30일입니다.",  month);
			break;
			
		case 5:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 6:
			System.out.printf("%d월의 일수는 30일입니다.",  month);
			break;
			
		case 7:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 8:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 9:
			System.out.printf("%d월의 일수는 30일입니다.",  month);
			break;
			
		case 10:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
			
		case 11:
			System.out.printf("%d월의 일수는 30일입니다.",  month);
			break;
			
		case 12:
			System.out.printf("%d월의 일수는 31일입니다.",  month);
			break;
		
		


		}
	}
		
			
}


