package chapter02;

import java.util.Scanner;

public class second 
{

	public static void main(String[] args) 
	{

		int m, n, i, besu;
		Scanner su = new Scanner(System.in);
		
		System.out.println("�ִ밡 �� ������ �Է��ϼ��� :");
		m = su.nextInt();
		
		System.out.println("����� �� ������ �Է��ϼ��� :");
		n = su.nextInt();
		System.out.printf("m   : %d \n"
	     		+ 		  "n   : %d \n" 
	     		+		  "�� �� :" , m, n
	     				 );
		for(i=1; i*n<=m; i++)		
		{	     
	    	 besu = i*n;
	    	 System.out.printf(" %d", besu  );  
		}
	}

}
