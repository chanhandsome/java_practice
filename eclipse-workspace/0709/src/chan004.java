import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		float student[][][];
		int i;
		int j = 0;
		float weightmax=0;
		float weightmin=9999;
		float heightmax=0;
		float heightmin=9999;
		float weighthap = 0;
		float heighthap = 0;
		double weightever;
		double heightever;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		i = s.nextInt();
		
		student = new float[i][1][2];
		
		for(j = 0; j < i; j++)
		{
			System.out.printf("%d��° �л��� Ű�� ������ : ",  j+1);
			student[j][0][0] = s.nextFloat();
			student[j][0][1] = s.nextFloat();
			
			
			//---------------------------------
			
			if(weightmax<student[j][0][1])
			{ 
				weightmax = student[j][0][1];
			}
			
			if(weightmin>student[j][0][1])
			{
				weightmin = student[j][0][1];
			}
			
			if(heightmax<student[j][0][0])
			{
				heightmax = student[j][0][0];
			}
			
			if(heightmin>student[j][0][0])
			{
				heightmin = student[j][0][0];
			}
			
			weighthap += student[j][0][1];
			heighthap += student[j][0][0];
			
			
			
			
		}
		
		weightever = weighthap/i;
		heightever = heighthap/i;
		
		System.out.print("Ű     :");	
		for(j=0; j<i; j++)
		{
			System.out.printf(" %.0f", student[j][0][0]);
		}
		
		
		System.out.printf("\n������:");
		for(j=0; j<i; j++)
		{
			System.out.printf(" %.1f", student[j][0][1]);
		}
		
		
		System.out.printf("�ְ���� : %f",  heightmax);
		System.out.printf("  �������� : %f",  heightmin);
		System.out.printf("  ��ս��� : %f" , heightever);
		
		System.out.printf("\n�ְ�ü�� : %f",  weightmax);
		System.out.printf("  ����ü�� : %f",  weightmin);
		System.out.printf("  ���ü�� : %f",  weightever);
		
		
				
	}

}
