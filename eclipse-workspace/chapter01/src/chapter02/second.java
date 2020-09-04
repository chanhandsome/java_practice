package chapter02;

import java.util.Scanner;

public class second 
{

	public static void main(String[] args) 
	{

		int m, n, i, besu;
		Scanner su = new Scanner(System.in);
		
		System.out.println("최대가 될 정수를 입력하세요 :");
		m = su.nextInt();
		
		System.out.println("배수가 될 정수를 입력하세요 :");
		n = su.nextInt();
		System.out.printf("m   : %d \n"
	     		+ 		  "n   : %d \n" 
	     		+		  "결 과 :" , m, n
	     				 );
		for(i=1; i*n<=m; i++)		
		{	     
	    	 besu = i*n;
	    	 System.out.printf(" %d", besu  );  
		}
	}

}
