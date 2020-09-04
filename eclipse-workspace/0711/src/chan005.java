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
		
		System.out.print("가위(1), 바위(2), 보(3)");
		user = s.nextInt();
		
		
	
		if(user == 1)			//가위
		{
			if(computer==1)
			{
				lose++;
				System.out.print("졌습니다");
			}
			
			else if(computer==2)
			{
				equal++;
				System.out.print("이겼습니다");
			}
			
			else if(computer==3)
			{
				win++;
				System.out.print("비겼습니다");
			}		
		}
		
		else if(user == 2)		//바위
		{
			if(computer == 1)
			{
				win++;
				System.out.print("이겼습니다");
			}
			
			else if(computer==2)
			{
				equal++;
				System.out.print("비겼습니다");
			}
			
			else if(computer == 3)
			{
				lose++;
				System.out.print("졌습니다");
			}
		}
		
		else if(user == 3)		//보
		{
			if(computer == 1)
			{
				lose++;
				System.out.print("졌습니다");
			}
			
			else if(computer == 2)
			{
				win++;
				System.out.print("이겼습니다");
			}
			
			else if(computer==3)
			{
				equal++;
				System.out.print("비겼습니다");
			}
		}
		
			
			System.out.printf("\n계속 하시렵니까(1.yes  /  else.no) : ");
			will = s.nextInt();
			

			
			
	}  while(will == 1);
			System.out.printf("당신은 %d번 이기고, %d번 비기고, %d번 졌습니다.", win, equal, lose);
		
}
}
		
	

