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
		
		System.out.println("�迭�� ��� �� : ");
		col = s.nextInt();
		row = s.nextInt();

		aa=new int[col][row];
		
				
		for(i=0; i<col; i++)
		{ 
			System.out.printf("%d ���� �ప�� �Է��Ͻÿ�\n", i+1);
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

		System.out.printf("�ִ밪 : %d\n",  scoremax);
		System.out.printf("�ִ밪 : %d\n",  scoremin);
						
			
	}

}
