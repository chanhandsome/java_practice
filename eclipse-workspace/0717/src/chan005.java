import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int work;
		int dayend;
		int daynight;
		double tax;
		
		
		int days;
		double pay = 0;
		double aftertax;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("근무 시수 : " );
		work = s.nextInt();
		System.out.print("근무일(1. 주중, 2. 주말): ");
		dayend = s.nextInt();
		System.out.print("근무시간대(1 주간, 2 야간): ");
		daynight = s.nextInt();
		
		days = dayend + daynight*2;
		
		switch(days)
		{
			case 3:
			{
				pay = 9500 * work;
			}
			case 4:
			{
				pay = 11000 * work;
			}
			case 5:
			{
				pay = 9500 * work * 1.1;
			}	
			case 6:
			{
				pay = 11000 * work * 1.1;
			}
				
		}
		
		if(work >= 10)
			pay += 30000;
		
		if(pay > 100000)
			{
			aftertax = pay*0.95;
			tax = pay*0.05;
			System.out.printf("일당은 %.0f원, 세금은 %.0f원, 실 수령액은 %.0f원 입니다",  pay, tax, aftertax);
			}
		else
			System.out.printf("일당은 %.0f원, 세금 없음 , 실 수령액은 %.0f원 입니다",  pay, pay);
		
		
		
	}

}
