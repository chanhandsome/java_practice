import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� : ");
		number = s.nextInt();
		
		System.out.println("");
		
		if(number%2==0)
		{
			System.out.print("(2�� ���)");
		}
		
		if(number%3==0)
		{
			System.out.print("(3�� ���)");
					
		}
		
		if(number%5==0)
		{
			System.out.print("(5�� ���)");
		}
		
		if(number%7==0)
		{
			System.out.print("(7�� ���)");
		}
		
		if(number%9==0)
		{
			System.out.print("(9�� ���);");
		}
		
		else
		{
			System.out.print("�� �ɴϴ�");
		}
		
	}

}
