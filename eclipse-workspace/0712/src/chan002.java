import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int line;
		int star = -1;
		int i = 1;
		int j = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("��(line)�� ���� �Է��ϼ��� : ");
		line = s.nextInt();
		
		for(i=1; i<=line; i++) 
		{
			star += 2;
			

			for(j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
		

	}

}
