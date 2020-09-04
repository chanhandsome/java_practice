package chapter01;

import java.util.Scanner;

public class first 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float silsu;
		int    jarisu;
		Scanner s = new Scanner(System.in);
				
		while(true)
		{
		System.out.println("실수를 입력하세요 : ");		
		silsu = s.nextFloat();
		
		System.out.println("원하는 자리수를 입력하세요(1~3까지만 가능합니다. 다른 숫자 입력시 실수를 초기화합니다) : ");
		jarisu = s.nextInt();
		

			switch(jarisu)
				{
				case 1: 
					System.out.printf("입력된 수는 약 %.1f 입니다. \n" , silsu);
					break;
				case 2: 
					System.out.printf("입력된 수는 약 %.2f 입니다. \n" , silsu);
					break;
				case 3: 
					System.out.printf("입력된 수는 약 %.3f 입니다. \n" , silsu);
					break;
				default:
				}
			
			
		 }
	}

}
