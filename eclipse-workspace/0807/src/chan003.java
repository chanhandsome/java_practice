import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int one, three, four;
		int num = 0;
		int count=0;
		int minute = 0;
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		one = 0;
		three = 0;
		four = 0;
		
		while(count!=num) {

			one++;
			three++;
			four++;
			minute++;
			
			if(one==1) {
				count++;
				one = 0;
			}
			if(three==3) {
				count++;
				three = 0;
			}
			if(four==4) {
				count++;
				four = 0;
			}
			
		}
		
		System.out.printf("%d",  minute);
		
		
		
	}

}
