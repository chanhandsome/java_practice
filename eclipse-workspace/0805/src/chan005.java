import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int com[];
		int ask[];
		String input;
		int strike = 0;
		int ball = 0;
		int tries = 0;
		
		Scanner s = new Scanner(System.in);
		
		com = new int[4];
		for(int i=0; i<=3; i++) {
		com[i] = (int)(Math.random()*10);
		}
		System.out.println("������ �½��ϴ�.");
		do {
			
			//System.out.printf("%d%d%d%d",  com[0], com[1], com[2], com[3]);

			strike = 0;
			ball = 0;
			
		input = s.nextLine();
		
		ask = new int[4];
		for(int i=0; i<=3; i++) {
			ask[i] = (int)input.charAt(i)-48;
		}
		
		for(int i=0; i<=3; i++) {
			if(ask[i]==com[i]) {
				strike++;
				ask[i] = 19;
			}
			else{
			for(int j=0; j<=3; j++) {
				if(ask[j]==com[i]&i!=j) {
					ball++;
					ask[j] = 12;
				}
			}
			}
		
		}

		tries++;
		System.out.printf("%s�� %d��Ʈ����ũ %d���Դϴ�.",  input, strike, ball);
		}while(strike!=4);
		
		System.out.printf("������ϴ�. %d�� ���� ������ϴ�.", tries);
	}

}
