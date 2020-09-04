package chapter04;
import java.util.Scanner;

public class quar {

	public static void main(String[] args) {
		int Prime;
		int i;
		int namozi;
		int dooge = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 :");
		Prime = s.nextInt();
		
		for(i=1; i<=Prime; i++)
		{
			namozi = (Prime % i);
			
			if(namozi == 0)
			dooge++;

			
		}
		
		if(dooge == 2)
			System.out.printf("%d는 소수입니다.", Prime);
		
		else
			System.out.printf("%d는 소수가 아닙니다", Prime);
		
	}
}
