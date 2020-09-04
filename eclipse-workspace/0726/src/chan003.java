import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int n;
		int numbers[];
		int start = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ют╥б : ");
		n = s.nextInt();
		
		int per = (n^2);
		numbers = new int[(per)];
		
		for(int i=0; i<per; i++)
		{
			start++;
			numbers[i] = start;
		}

	}

}
