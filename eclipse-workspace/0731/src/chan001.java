import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int num;
		int change[];
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num = s.nextInt();
		int numchange = num;
		change = new int[num];
		
		for(int i=0; i<=num/2+1; i++)
		{		
			change[i] = numchange%2;
			numchange = numchange/2;
		}
		
		for(int j=num/2+1; j>=0; j--)
		{
			System.out.printf("%d", change[j]);
		}
		
		

	}

}
