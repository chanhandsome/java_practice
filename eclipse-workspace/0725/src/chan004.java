import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int num;
		int save[];
		save = new int[30];
		int i = 0;
		boolean exit = false;
		
		int star = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("1이상 9이하의 자연수를 최대 30개 입력하세요. 0을 입력하면 종료합니다 : ");
		do {
			num = s.nextInt();
			i++;
			if(i==30)
			{exit = true;}
			
			if(num == 0)
			{exit = true;
			break;}
			
			
			save[i-1] = num;
			
		}while(exit==false);
		

		for(int j=0; j<=i-2; j++)
		{
			System.out.printf("%d : ",  save[j]);
			for(star=0; star<save[j]; star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
