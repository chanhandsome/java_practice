import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int nun1 = 1;
		int nun2 = 1;
		
		int input;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		input = s.nextInt();
		
		for(nun1=1; nun1<=6; nun1++)
		{
			for(nun2=1; nun2<=6; nun2++)
			{
				if(input==nun1+nun2) {
					System.out.printf("%d, %d\n",  nun1, nun2);
				}
			}
		}

	}

}
