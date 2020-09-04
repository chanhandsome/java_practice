import java.util.Scanner;

public class chan07 {

	public static void main(String[] args) {
		String input;
		int i = 0;
		char k[];
		int number[];
		int num[];
		int plus[];
		int minus[];
		int divide[];
		int mul[];
		int namozi[];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("¼ö½Ä:");
		input = s.nextLine();

		number = new int[input.length()];
		
		k = new char[input.length()];
		
		plus = new int[input.length()];
		plus = null;
		minus = new int[input.length()];
		minus = null;
		divide = new int[input.length()];
		divide = null;
		mul = new int[input.length()];
		mul = null;
		namozi = new int[input.length()];
		namozi = null;
		
		num = null;
		num = new int[input.length()];
		
		for(i=0 ;i<=input.length(); i++)
		{
			k[i] = input.charAt(i);
			num[i] = 1;
			if((int)k[i]>=48)
			{
				
				switch((int)k[i])
				{
					case 48:
						number[i] = 0;
						break;
					case 49:
						number[i] = 1;
						break;
					case 50:
						number[i] = 2;
						break;
					case 51:
						number[i] = 3;
						break;
					case 52:
						number[i] = 4;
						break;
					case 53:
						number[i] = 5;
						break;
					case 54:
						number[i] = 6;
						break;
					case 55:
						number[i] = 7;
						break;
					case 56:
						number[i] = 8;
						break;
					case 57:
						number[i] = 9;
						break;
				}}
			
			if((int)k[i]==43)
			{
				num[i] = 1;
			}
			
			if((int)k[i]==37)
			{
				k[i] = '%';
			}
			
			if((int)k[i]==45)
			{
				k[i] = '-';
			}
			
			if((int)k[i]==47)
			{
				k[i] = '/';
			}
			
			if((int)k[i] == 42)
			{
				mul[i] = 1;
			}
			
			
			
			
		}
		
		for(i=0; i<=input.length(); i++)
			{
				
				
			
			}
		

	}

}
