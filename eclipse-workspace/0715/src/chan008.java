import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int number;
		float weight[];
		int i, j;
		int k;
		float imsi;
		int choise = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л� ��:");
		number = s.nextInt();
		
		weight = new float[number];
		
		System.out.print("ü�� �Է� : ");
		for(i=0; i<=number-1; i++)
		{
			weight[i] = s.nextFloat();
		}
		
		System.out.printf("1. �������� \n2. ��������");
		choise = s.nextInt();
		
				if(choise == 1)
				{System.out.printf("\n�����������İ�� : ");
					
					for(i=0; i<number; i++)
					{
						
						for(j=0; j<number-1-i; j++)
						{if(weight[j] < weight[j+1]) 
							{
								imsi = weight[j];
								weight[j] = weight[j+1];
								weight[j+1] = imsi;
								
							}
						}
						System.out.printf(" %f ", weight[j]);
			
					}
				}	
				
				if(choise == 2)
				{System.out.printf("\n�����������İ�� : ");
					
					for(i=0; i<number; i++)
					{
						
						for(j=0; j<number-1-i; j++)
						{if(weight[j] > weight[j+1]) 
							{
								imsi = weight[j];
								weight[j] = weight[j+1];
								weight[j+1] = imsi;
							
							}
						}
					
					}
					for(k=number-1; k>=0; k--)
					{
						System.out.printf(" %f ", weight[k]);
					}
					
				}

}
}
