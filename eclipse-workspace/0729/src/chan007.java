import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int max=2;
		int num1, num2;
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		for(int i=1; i<=num1&&i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				max=i;
			}
		}
		
		if(max==1)
		{
			System.out.print("yes");
		}
		
		else
		{
			System.out.print("no");
		}

}

}
