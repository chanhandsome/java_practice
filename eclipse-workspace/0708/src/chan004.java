import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int[][]aa;
		int[][]bb;
		int[][]cc = null;
		int k = 0;
		int i = 0;
		int row, col;
		int component = 0;

		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�迭�� ��� �� : ");
		col = s.nextInt();
		row = s.nextInt();

		aa=new int[col][row];
		bb=new int[col][row];
		
					
		for(i=0; i<col; i++)
		{ 
			System.out.printf("%d ���� �ప�� �Է��Ͻÿ�\n", i+1);
			for(k=0; k<row; k++)			
			{
			component = s.nextInt();
			aa[i][k] = component;
			}
		}
		
		
		
		for(i=0; i<col; i++)
		{ 
			System.out.printf("%d ���� �ప�� �Է��Ͻÿ�\n", i+1);
			for(k=0; k<row; k++)			
			{
			component = s.nextInt();
			bb[i][k] = component;
			}
		}
		
		cc = new int[col][row];
		
		for(i=0; i<col; i++)
		{ for(k=0; k<row; k++)
		{cc[i][k] = aa[i][k]+bb[i][k];
		System.out.printf("%d ",  cc[i][k]);
		}
		System.out.println("");
		}
		
						
			

		
	}

}
