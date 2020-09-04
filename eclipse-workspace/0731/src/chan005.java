import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int num[];
		num = new int[4];
		int fir = 0;
		int sec = 0; 
		int third = 0;
		int four = 10;
		int number;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("네 자리 숫자를 입력하세요 : ");
		number = s.nextInt();
		num[0] = number/1000;
		num[1] = number/100%10;
		num[2] = number/10%10;
		num[3] = number%10;
		
	/*	for(int i=0; i<=3; i++) {
			num[i] = s.nextInt();
		}  */
		
		for(int j=0; j<=3; j++) {
			if(fir<=num[j])
			{
				fir = num[j];
			}
			if(four>=num[j])
			{
				four = num[j];
			}
		}
		
		for(int l=0; l<=3; l++) {
			if(fir==num[l]) {
				num[l] = 0;
				break;
			}
		}
		for(int g=0; g<=3; g++) {
			if(four==num[g]) {
				num[g] = 0;
				break;
			}
		}
		
		for(int n=0; n<=3; n++) {
			if(sec<=num[n])
			{
				sec = num[n];
			}
		}
		
		for(int b=0; b<=3; b++) {
			if(sec==num[b]) {
				num[b] = 0;
				break;
			}
		}
		
		for(int h=0; h<=3; h++) {
			if(third<=num[h]) {
				third = num[h];
			}
		}
		

			System.out.printf("그 숫자로 만들 수 있는 가장 큰 수는 %d%d%d%d 입니다.", fir, sec, third, four);
		

	}

}

