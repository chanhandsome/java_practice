import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int n;
		int k;
		int i=0;
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("n과 k를 입력하시오");
		n = s.nextInt();
		k = s.nextInt();
		
		for(i=0; i<=n; i++)
		{
			sum += Math.pow(i, k);
		}
		
		
		
		System.out.printf("\n%d", sum);
	}

}
