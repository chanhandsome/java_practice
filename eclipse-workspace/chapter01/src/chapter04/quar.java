package chapter04;
import java.util.Scanner;

public class quar {

	public static void main(String[] args) {
		int Prime;
		int i;
		int namozi;
		int dooge = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���ڸ� �Է��ϼ��� :");
		Prime = s.nextInt();
		
		for(i=1; i<=Prime; i++)
		{
			namozi = (Prime % i);
			
			if(namozi == 0)
			dooge++;

			
		}
		
		if(dooge == 2)
			System.out.printf("%d�� �Ҽ��Դϴ�.", Prime);
		
		else
			System.out.printf("%d�� �Ҽ��� �ƴմϴ�", Prime);
		
	}
}
