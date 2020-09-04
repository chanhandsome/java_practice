import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int save[];
		save = new int[12];
		int colmajor[][];
		colmajor = new int[4][3];
		
		int input[][];
		input = new int[3][4];
		
		Scanner s = new Scanner(System.in);
		System.out.print("12개의 수를 입력하세요");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
				{
					input[i][j] = s.nextInt();
					save[j+i*4] = input[i][j];
				}
		}
		
		for(int k=0; k<4; k++)
		{
			for(int m=0; m<3; m++)
			{
				colmajor[k][m] = save[k+m*3];
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
				{
					System.out.printf("%d ",  input[i][j]);
				}
			System.out.println("");
		}
		
		System.out.println("");
		
		
		for(int k=0; k<4; k++)
		{
			for(int m=0; m<3; m++)
			{
				System.out.printf("%d ",  colmajor[k][m]);
			}
			System.out.println("");
		}
		
		

	}

}
