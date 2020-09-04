import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int num[];
		boolean check[];
		check = new boolean[]{false, false, false, false, false, false, false, false, false, false };
		num = new int[10];
		Scanner s = new Scanner(System.in);
		
			for(int i=0; i<=9; i++)
			{
				num[i] = s.nextInt();
			}
			
			for(int j=0; j<=9; j++)
			{
				for(int m=j+1; m<=9; m++)
				{
					if(num[j]==num[m])
					{
						check[j] = true;
						check[m] = true;
					}
				}
			}
			
			for(int k=0; k<=9; k++)
			{
				if(check[k]==false)
				{
					System.out.printf("%d",  num[k]);
				}
			}
	}

}
