package chapter03;

import java.util.Scanner;

public class third {

		public static void main(String[] args) {
		int number, i;
		float ki[] = null;
		float mom[] = null;
		float imsiki, imsimom;
		float everki ;
		float evermom; 	

		Scanner s = new Scanner(System.in);
		
		System.out.printf("학생수를 입력하세요");
		number = s.nextInt();
		
		for(i=0; i<=number; i++) 
		{ 	
			System.out.println("키를 입력하세요");
			ki[i] = s.nextFloat();
			if(ki[i]<= 0)
			{
			System.out.println("끕니다");
			return;
			}		
			System.out.println("그 학생의 몸무게를 입력하세요");
			mom[i] = s.nextFloat();
			
			if(mom[i]<= 0)
			{
			System.out.println("끕니다");
			return;
			}	
			
			imsiki = ki[i];
			imsimom = mom[i];
			everki = imsiki/i;
			evermom = imsimom/i;
			System.out.printf("키는 .2%f입니다"   , everki);
			System.out.printf("몸무게는 .2%f입니다", evermom);

		}

		

	}
}

		

		













