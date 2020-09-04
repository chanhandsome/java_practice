import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int A, B;
		int count, save;
		int num;
		int clap = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("시작점을 입력하세요 : ");
		A = s.nextInt();
		System.out.print("끝점을 입력하세요 : ");
		B = s.nextInt();
		
		
		for(count=A; count<=B; count++) {
			num = count;
			save = count;
			if(num%3==0) {
				clap++;
			}
			else {
				while(save!=0) 
				{
				if(save%10==3|save%10==6|save%10==9) 
				{
					clap++;
					save = 0;
				}
					save/=10;
				}
			}
		
		}
		
		System.out.printf("박수를 치는 횟수는%d회 입니다.", clap);

	}

}
