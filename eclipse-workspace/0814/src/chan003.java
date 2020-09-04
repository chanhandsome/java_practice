import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int count = 0;
		int input, check;
		int num = 0;
		Scanner s = new Scanner(System.in);
		
		input = s.nextInt();
		
		while(input!=0) {
			check = input%10;
			input/=10;
			num++;
			if(check==6 | check==9) {
				count++;
			}
			if(count==2) {
				count=0;
				num--;
			}
		}
		
		System.out.printf("%d",  num);

	}

}
