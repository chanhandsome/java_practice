import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		String str;
		int eng = 0;
		int big = 0;
		int small = 0;
		int num = 0;
		int blank = 0;
		int ex = 0;
		char engchar[];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		str = s.nextLine();
		
		engchar = new char[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{engchar[i] = str.charAt(i);
		
			if((int)engchar[i]>=65)
			{
				if((int)engchar[i]<=90)
				{big++;}
			}
			
			if((int)engchar[i]>=97)
			{
					if((int)engchar[i]<=122)
					{small++;}
			}
			
			if((int)engchar[i]==0x20)
			{blank++;}
			
			if((int)engchar[i]>=49)
			{
				if((int)engchar[i]<=57)
				{num++;}
			}
			
			
			
			}
		eng = big + small;
		ex = (str.length()-eng-blank-num);
		
		System.out.printf("������ �� : %d",  eng);
		System.out.printf("\n�빮�� �� : %d",  big);
		System.out.printf("\n�ҹ��� �� : %d",  small);
		System.out.printf("\n��  �� �� : %d",  num);
		System.out.printf("\n��  �� �� : %d",  blank);
		System.out.printf("\n��Ÿ���� �� : %d",  ex);
		
		}
		
		

	}


