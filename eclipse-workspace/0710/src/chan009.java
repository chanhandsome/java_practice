import java.util.Scanner;

public class chan009 {

	public static void main(String[] args) {

		int a;
		int n;	
		int space = 0;
		int Prime;
		int number=0;
		int i;
		int namozi;
		int dooge = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 :");
		a = s.nextInt();
		Prime = s.nextInt();
		n = s.nextInt();
		
		
		for(i=a; i<=Prime; i++)
		{
			number++;
			for(i=1; i<=number; i++)
			{
				namozi = (number % i);
				
				
				if(namozi == 0)
				dooge++;
		
			
			}

			if(dooge == 2)
			{
			 System.out.printf("%d ", number);
			 space++;
			}
			
			dooge = 0;
			
			if(space==n)
			{
				System.out.println("");
				space = 0;
			}
	}

}
}