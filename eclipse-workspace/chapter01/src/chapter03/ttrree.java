package chapter03;

import java.util.Scanner;

public class ttrree {

	public static void main(String[] args) {
		float weight, tall;
		float hapweight = 0;
		float haptall = 0;
		float everweight, evertall;
		int i = 0;
		int j = 0;
		int go = 1;
		int se; 
		int tal = 1;
		int wei = 1;
		Scanner s = new Scanner(System.in);
		

		
		do
		{
			System.out.println("�Ʒ��� ������(KG)�� Ű(CM)�� �Է��ϼ���.");
			weight = s.nextFloat();
			tall = s.nextFloat();
			if(tall<0)
				tal = 0;
			else if(weight<0)
				wei = 0;
			
			se = tal*wei;
			
			if(se!=0)
			{
				hapweight += weight;
				i++;
				haptall += tall;
				j++;
			}
			

			else
			{
				everweight = hapweight/i;
				System.out.printf("��� ������ %f, ",  everweight );
				evertall = haptall/j;
				System.out.printf("��� Ű %f�Դϴ�",  evertall);
				go = 0;
			}
			

		}while(go==1);	

		
		}
}


