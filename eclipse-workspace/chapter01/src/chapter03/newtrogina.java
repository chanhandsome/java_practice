package chapter03;

import java.util.Scanner;

public class newtrogina {

	public static void main(String[] args) {
		float weight, tall;
		float hapweight = 0;
		float haptall = 0;
		float everweight, evertall;
		int i = 0;
		int j = 0;
		int go = 1;
		Scanner s = new Scanner(System.in);
		

		
		do
		{
			System.out.println("�Ʒ��� ������(KG)�� Ű(CM)�� �Է��ϼ���.");
			weight = s.nextFloat();
			tall = s.nextFloat();
			
			if(weight>=0) 
			{
				hapweight += weight;
				i++;
			}
			else
			{
				everweight = hapweight/i;
				System.out.printf("��� ������ %f, ",  everweight );
				go = 0;
			}
			
			
			if(tall>=0)
			{
				haptall += tall;
				j++;
			}
			else
			{
				evertall = haptall/j;
				System.out.printf("��� Ű %f�Դϴ�",  evertall);
				go = 0;
			}
			

		}while(go==1);	

		
		}
}


