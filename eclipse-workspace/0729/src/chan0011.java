import java.util.Scanner;

public class chan0011 {

	public static void main(String[] args) {
		int num1, num2;
		int max=0;
		int min=0;
		
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		for(int i=1; i<=num1 && i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				max = i;
			}
		}
		
		for(int j=num1*num2; j>=num1 | j>=num2; j--)
		{
			if(j%num1==0 && j%num2==0)
			{
				min = j;
			}
		}
		
		System.out.printf("최대 공약수는 : %d\n최소 공배수는 : %d", max, min);

	}

}
