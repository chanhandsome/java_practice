import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		
		float list[];
		int student = 0;
		float weight=0;
		int i = 0;
		int j = 0;
		float imsi;
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		student = s.nextInt();

		
		
		list = new float[student];
		
		System.out.printf("\n체중입력 : ");
		
		for(i=0; i<student; i++)
		{ 
			weight = s.nextFloat();
			
			list[i] = weight;
		}
		
	
		
		
		System.out.printf("\n오름차수정렬결과 : ");
		
		for(i=0; i<student; i++)
		{
			
			for(j=0; j<student-1-i; j++)
			{if(list[j] < list[j+1]) 
				{
					imsi = list[j];
					list[j] = list[j+1];
					list[j+1] = imsi;
					
				}
			}
			
			System.out.printf(" %f ", list[j]);			
		}
		
		
		
	}
	}


