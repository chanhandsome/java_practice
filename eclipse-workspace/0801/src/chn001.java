import java.util.Scanner;

public class chn001 {

	public static void main(String[] args) {
		int n, i
		;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� n�� �Է��ϼ��� ; ");
		n = s.nextInt();
		
		for(i=1; i<=n; i++) {
			System.out.printf("%d",  i);
		}
		
		for(i=n; i>=1; i--)
		{
			System.out.printf("%d",  i);
		}

	}

}