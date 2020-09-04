import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		char alphabet;
		int num;
		int i = 0;
		boolean eng = false;
		
		Scanner s = new Scanner(System.in);
		
		do{System.out.print("영문자 정수 입력 : ");
		alphabet = s.next().charAt(0);
		num = s.nextInt();
				
		
		if((int)alphabet>=65)
		{
			if((int)alphabet<=90)
			eng = true;
			
			else
			eng = false;
		}
		
		if((int)alphabet>=97)
		{
			if((int)alphabet<=122)
			eng = true;
			
			else
				eng = false;
		}
		
		else
		{eng = false;}
			
		if(eng == true)
			{for(i = 0; i<num; i++)
		{
			System.out.printf("%c",  alphabet);
		}
			}
		
		System.out.println("");
		
		
		}while(eng == true);
		
		
		System.out.print("프로그램을 종료합니다");
		
	}

}
