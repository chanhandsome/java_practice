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
		
		System.out.print("�ٹ� �ü� : " );
		work = s.nextInt();
		System.out.print("�ٹ���(1. ����, 2. �ָ�): ");
		dayend = s.nextInt();
		System.out.print("�ٹ��ð���(1 �ְ�, 2 �߰�): ");
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
			System.out.printf("�ϴ��� %.0f��, ������ %.0f��, �� ���ɾ��� %.0f�� �Դϴ�",  pay, tax, aftertax);
			}
		else
			System.out.printf("�ϴ��� %.0f��, ���� ���� , �� ���ɾ��� %.0f�� �Դϴ�",  pay, pay);
		
		
		
	}

}
