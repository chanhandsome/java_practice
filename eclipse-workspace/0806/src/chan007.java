import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class chan007 {

	public static void main(String[] args) {
		int M = 0;
		int N = 0;
		int count = 0;
		int min;
		int sqr;
		
		Scanner s = new Scanner(System.in);
		
		
		M = s.nextInt();
		double Mdiv = Math.sqrt(M);
		N = s.nextInt();
		double Ndiv = Math.sqrt(N);
		min = N;

		
		
		for(int i=1; i<=Ndiv; i++) {
				sqr = i*i;
				
				if(sqr<=N & sqr>=M) {
					count++;
					
					if(min>=sqr) {
						min = sqr;
					}

				}	
		}
		
		System.out.printf("�� %d��\n",  count);
		System.out.printf("�� �� �ּҰ��� %d�̴�",  min);

	}

}
