import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		
		float list[];
		int student = 0;
		float weight=0;
		int i = 0;
		int j = 0;
		float imsi;
		int min=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		student = s.nextInt();

		
		
		list = new float[student];
		
		System.out.printf("\nü���Է� : ");
		
		for(i=0; i<student; i++)
		{ 
			weight = s.nextFloat();
			
			list[i] = weight;
		}
		
	
		
		
		System.out.printf("\n�����������İ�� : ");
		
		for(i=0; i<student; i++)
		{
			min = i;
			for(j=i; j<student; j++) {
				if(list[j] < list[min]) {
					min = j;
				}
					imsi = list[i];
					list[i] = list[min];
					list[min] = imsi;
				}
			System.out.printf(" %f ", list[i]);
			}
			
		
		
		for(i=0; i<student; i++)
		{
			
		}
		
		
		
	}
	}


