import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {

		int number;
		int i;
		int outnum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� n : ");
		number = s.nextInt();
		
		for(i=0; i<=number; i++)
		{
			outnum += i;
		}
		
		System.out.printf("%d������ �� : %d", number, outnum);
		
	}

}
