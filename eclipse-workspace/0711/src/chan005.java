import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int user;
		int computer;
		int will;
		
		
		int win = 0;
		int lose = 0;
		int equal = 0;
		
		
		Scanner s = new Scanner(System.in);
		
	do{	computer = (int)(Math.random()*3) +1;
		
		System.out.print("����(1), ����(2), ��(3)");
		user = s.nextInt();
		
		
	
		if(user == 1)			//����
		{
			if(computer==1)
			{
				lose++;
				System.out.print("�����ϴ�");
			}
			
			else if(computer==2)
			{
				equal++;
				System.out.print("�̰���ϴ�");
			}
			
			else if(computer==3)
			{
				win++;
				System.out.print("�����ϴ�");
			}		
		}
		
		else if(user == 2)		//����
		{
			if(computer == 1)
			{
				win++;
				System.out.print("�̰���ϴ�");
			}
			
			else if(computer==2)
			{
				equal++;
				System.out.print("�����ϴ�");
			}
			
			else if(computer == 3)
			{
				lose++;
				System.out.print("�����ϴ�");
			}
		}
		
		else if(user == 3)		//��
		{
			if(computer == 1)
			{
				lose++;
				System.out.print("�����ϴ�");
			}
			
			else if(computer == 2)
			{
				win++;
				System.out.print("�̰���ϴ�");
			}
			
			else if(computer==3)
			{
				equal++;
				System.out.print("�����ϴ�");
			}
		}
		
			
			System.out.printf("\n��� �Ͻ÷ƴϱ�(1.yes  /  else.no) : ");
			will = s.nextInt();
			

			
			
	}  while(will == 1);
			System.out.printf("����� %d�� �̱��, %d�� ����, %d�� �����ϴ�.", win, equal, lose);
		
}
}
		
	

