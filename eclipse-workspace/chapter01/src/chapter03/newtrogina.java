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
			System.out.println("아래에 몸무게(KG)와 키(CM)를 입력하세요.");
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
				System.out.printf("평균 몸무게 %f, ",  everweight );
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
				System.out.printf("평균 키 %f입니다",  evertall);
				go = 0;
			}
			

		}while(go==1);	

		
		}
}


