import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 : ");
		number = s.nextInt();
		
		System.out.println("");
		
		if(number%2==0)
		{
			System.out.print("(2의 배수)");
		}
		
		if(number%3==0)
		{
			System.out.print("(3의 배수)");
					
		}
		
		if(number%5==0)
		{
			System.out.print("(5의 배수)");
		}
		
		if(number%7==0)
		{
			System.out.print("(7의 배수)");
		}
		
		if(number%9==0)
		{
			System.out.print("(9의 배수);");
		}
		
		else
		{
			System.out.print("가 옵니다");
		}
		
	}

}
