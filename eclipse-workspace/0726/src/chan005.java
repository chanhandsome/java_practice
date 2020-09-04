import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int a;
		int n;	
		int space = 0;
		int Prime;
		int number=0;
		int i;
		int namozi;
		int dooge = 0;
		
		int Emirp = 0;
		
		boolean prime = false;
		boolean emirp = false;
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
			{
			 prime = true;
			 dooge = 0;
			}
			
			int Primesave = Prime;
			if(Prime>10) {
			 while(Prime!=0)
			 {
		            Emirp = Emirp * 10 + Prime % 10;
		            Prime /= 10;
			 }
			}
			 int dooge2 = 0;
			 
			 for(int m=1; m<=Emirp; m++)
				{
				
						namozi = (Emirp % m);
										
						if(namozi == 0)
							dooge2++;		
				}
			 
			 if(dooge2 == 2)
				{
				 emirp = true;
				 dooge2 = 0;
				}
			
			if(prime==true)
			{
				if(emirp == true)
				{
					System.out.printf("%d is emirp.",  Primesave);
				}
				else
				{
					System.out.printf("%d is prime.",  Primesave);
				}
			}
			else if(prime==false)
			{
				System.out.printf("%d is not prime.",  Primesave);
			}

	}
	}