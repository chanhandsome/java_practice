import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {

		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int match = 0;
		boolean plus = true;
		int scoremax=0;
		int scoremin=100;

		
		
		
		
		Scanner s = new Scanner(System.in);
		do {
			
		int score =0;
		int scoreview = 0;
			
		System.out.println("������ �Է��ϼ���(������ �ԷµǸ� ����)");
		score = s.nextInt();
		
		
		
		if(score>=0)
			plus = true;
		else if(score<0)
			plus = false;
		else
			System.out.print("100�� �̻��� ������ �����ϴ�.");
		
		if(scoremax < score)
			scoremax = score;
		else if(scoremin > score)
				if(score>0)
					scoremin = score;
			
		
		scoreview = score/10;
		
		
		switch(scoreview)
		{
		case(10):
			a++;
			break;
		case(9):
			a++;
			break;
		case(8):
			b++;
			break;
		case(7):
			c++;
			break;
		case(6):
			d++;
			break;
		default:
			e++;
			break;
		}
		}while(plus == true);
		
		System.out.print("90�� �̻�: ");
		for(match=0; match<a; match++)
		{System.out.print("*");}
		
		System.out.printf("\n80�� ��: ");
		for(match=0; match<b; match++)
		{System.out.print("*");}
		
		System.out.printf("\n70�� ��: ");
		for(match=0; match<c; match++)
		{System.out.print("*");}
		
		System.out.printf("\n60�� ��: ");
		for(match=0; match<d; match++)
		{System.out.print("*");}
		
		System.out.printf("\n60�� �̸�: ");
		for(match=1; match<e; match++)
		{System.out.print("*");}
		
		System.out.printf("\n�ְ����� : %d", scoremax);
		System.out.printf("\n�������� : %d", scoremin);
		
		
		
		
		
	}	

}
