import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int n;
		int i;
		int output = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 n: ");
		n = s.nextInt();
		
		for(i=1; i<=n; i++)
		{
			output *= i;
		}
		
		System.out.printf("%d까지의 곱 : %d",  n, output);

	}

}
