import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int year1 = 365;
		int year2 = 366;
		
		int inputY, inputM, inputD;
		int saveY=0;
		int saveM = 0;
		int saveD = 0;
		int feb;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇년 몇월 며칠에 태어났습니까 : ");
		inputY = s.nextInt();
		inputM = s.nextInt();
		inputD = s.nextInt();
		
		for(int i=1990; i<=inputY; i++) {
			if((i%4==0&i%100!=0)|i%400==0) {
				saveY += 366;
			}
			else {
				saveY += 365;
			}
		}
		

		
		for(int k=0; k<inputM; k++) {
			if((inputY%4==0&inputY%100!=0)|inputY%400==0) {
				feb = 29;
			}
			else {
				feb = 28;
			}
			switch(k) {
				case 1:
					saveM += 31;
					break;
				case 2:
					saveM += feb;
					break;
				case 3:
					saveM += 31;
					break;
				case 4:
					saveM += 30;
					break;
				case 5:
					saveM += 31;
					break;
				case 6:
					saveM += 30;
					break;
				case 7:
					saveM += 31;
					break;
				case 8:
					saveM += 31;
					break;
				case 9:
					saveM += 30;
					break;
				case 10:
					saveM += 31;
					break;
				case 11:
					saveM += 30;
					break;
				case 12:
					saveM += 31;
					break;
			}
		}
		
		saveD = saveY + saveM + inputD;
		int days = saveD%7;
		
		switch(days) {
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wensday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;
		case 0:
			System.out.print("Saturday");
			break;
		case 1:
			System.out.print("Sunday");
			break;
		}

	}

}
