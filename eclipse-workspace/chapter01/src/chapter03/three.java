package chapter03;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		
		int b;
		int i = 1;


		float firsttall, firstweight, evertall, everweight;
		float haptall = 0;
		float hapweight = 0;


		int end1 = 1; 
		int end2 = 1;
		int ending;
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("¸ö¹«°Ô(kg)°ú Å°(cm)¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
			firstweight = s.nextFloat();
			firsttall = s.nextFloat();

			++i;
			
			if(firsttall>=0)
				{
				int k = 1;
				float[]tall = new float[k];
					tall[k] = firsttall;
					haptall += tall[k];
					k++;
				}
			else
				{
					end1 = 0;
				}
			
			if(firstweight>=0)
				{
				int j = 1;	
				float[]weight = new float[j];

					weight[j] = firstweight;
					hapweight += weight[j];
					j++;
				}
			else
				{	
					end2 = 0;
				}

			ending = end1*end2;	
			
		}	while(ending == 1);
		

		
			
		evertall = (haptall/i);
		everweight = (hapweight/i);
		
		System.out.printf("Æò±Õ ¸ö¹«°Ô(kg): %f", everweight);
		System.out.printf("Æò±Õ Å°(cm, args) : %f", evertall);
		
	}

}
