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
		
		System.out.print("학생 수를 입력하세요 : ");
		i = s.nextInt();
		
		student = new float[i][1][2];
		
		for(j = 0; j < i; j++)
		{
			System.out.printf("%d번째 학생의 키와 몸무게 : ",  j+1);
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
		
		System.out.print("키     :");	
		for(j=0; j<i; j++)
		{
			System.out.printf(" %.0f", student[j][0][0]);
		}
		
		
		System.out.printf("\n몸무게:");
		for(j=0; j<i; j++)
		{
			System.out.printf(" %.1f", student[j][0][1]);
		}
		
		
		System.out.printf("최고신장 : %f",  heightmax);
		System.out.printf("  최저신장 : %f",  heightmin);
		System.out.printf("  평균신장 : %f" , heightever);
		
		System.out.printf("\n최고체중 : %f",  weightmax);
		System.out.printf("  최저체중 : %f",  weightmin);
		System.out.printf("  평균체중 : %f",  weightever);
		
		
				
	}

}
