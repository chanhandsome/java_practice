import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int eyes;

		
		int tries;
		
		int dice[];
		dice = new int[] { 0, 0, 0, 0, 0, 0 };
		
		Scanner s = new Scanner(System.in);
		System.out.print("주사위를 던지는 횟수 : ");
		tries = s.nextInt();
		
		for(int i=0; i<tries; i++)
		{
			eyes = (int)(Math.random()*6)+1;
			switch(eyes)
			{
			case 1:
				dice[0]++;
				break;
			case 2:
				dice[1]++;
				break;
			case 3:
				dice[2]++;
				break;
			case 4:
				dice[3]++;
				break;
			case 5:
				dice[4]++;
				break;
			case 6:
				dice[5]++;
				break;
			}

			
		}
		for(int k=0; k<6; k++)
		{
			System.out.printf("\n 눈 %d:",  k+1);
			for(int l=0; l<dice[k]; l++)
			{
				System.out.print("*");
			}
		}
		

	}

}
