import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
	
		int[][]aa;
		int k = 0;
		int i = 0;
		int row, col;
		int component = 0;
		int scoremax=0;
		int scoremin=100;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("배열의 행과 열 : ");
		col = s.nextInt();
		row = s.nextInt();

		aa=new int[col][row];
		
				
		for(i=0; i<col; i++)
		{ 
			System.out.printf("%d 번쨰 행값을 입력하시오\n", i+1);
			for(k=0; k<row; k++)			
			{
			component = s.nextInt();
			aa[i][k] = component;
			if(scoremax < aa[i][k])
				scoremax = aa[i][k];
			else if(scoremin > aa[i][k])
					scoremin = aa[i][k];
			
			}
		
			
		}

		System.out.printf("최대값 : %d\n",  scoremax);
		System.out.printf("최대값 : %d\n",  scoremin);
						
			
	}

}
