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
		
		System.out.printf("�л����� �Է��ϼ���");
		number = s.nextInt();
		
		for(i=0; i<=number; i++) 
		{ 	
			System.out.println("Ű�� �Է��ϼ���");
			ki[i] = s.nextFloat();
			if(ki[i]<= 0)
			{
			System.out.println("���ϴ�");
			return;
			}		
			System.out.println("�� �л��� �����Ը� �Է��ϼ���");
			mom[i] = s.nextFloat();
			
			if(mom[i]<= 0)
			{
			System.out.println("���ϴ�");
			return;
			}	
			
			imsiki = ki[i];
			imsimom = mom[i];
			everki = imsiki/i;
			evermom = imsimom/i;
			System.out.printf("Ű�� .2%f�Դϴ�"   , everki);
			System.out.printf("�����Դ� .2%f�Դϴ�", evermom);

		}

		

	}
}

		

		













