import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int eyes[];
		int max = 0;
		int min = 7;
		
		int status = 0;
		int money;
		int eye2 = 0;
		int eyemax = 0;
		
		Scanner s = new Scanner(System.in);
		
		eyes = new int[3];
		
		System.out.print("눈 세개를 입력하세요 : ");
		
		for(int i=0; i<3; i++)
		{
			eyes[i] = s.nextInt();
		}
		
		if(eyes[0]==eyes[1])
		{
			if(eyes[0]==eyes[2])
			{
				status = 1;
			}
			else
			{
				status = 2;
				eye2 = eyes[0];
			}
		}
		
		else if(eyes[1]==eyes[2])
		{
			if(eyes[2]==eyes[0])
			{
				status = 1;
			}
			else
			{
				status = 2;
				eye2 = eyes[1];
			}
		}
		
		else if(eyes[0]==eyes[2])
		{
			if(eyes[0]==eyes[1])
			{
				status = 1;
			}
			else
			{
				status = 2;
				eye2 = eyes[0];
			}
		}
		
		else
		{		status = 3;
				for(int j=0; j<=2; j++)
				{
					if(eyemax<eyes[j])
					{eyemax = eyes[j];}
				}
		}
		
		switch(status) {
		case 1:
			money = eyes[0]*1000 + 10000;
			System.out.printf("%d원 입니다.",  money);
			break;
			
		case 2:
			money = 1000 + eye2*100;
			System.out.printf("%d원 입니다.",  money);
			break;
			
		case 3:
			money = eyemax * 100;
			System.out.printf("%d원 입니다.",  money);
			break;
		}

	}

}
