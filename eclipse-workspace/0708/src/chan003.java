import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		float x;
		float ax;
		int n;
		int i = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("x와 n을 입력하세여");
		x = s.nextFloat();
		ax = x;
		n = s.nextInt();
		
		for(i=1; i<n; i++)
		{x = x*ax;}
		System.out.printf("%.3f", x );
		
	}

}
