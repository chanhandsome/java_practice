import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int input;
		int count = 0;
		int out = 1;
		
		int compare;
		
		int num = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		input = s.nextInt();
		
		compare = input;
		
		while(count != input) {
			count++;
			compare -= count;
			if(compare == 0) {
				num++;
				compare = input;
				out++;
				count = out;
			}
			if(compare <= 0) {
				compare = input;
				out++;
				count = out;
			}
		}
		
		System.out.printf("%d가지", num);

	}

}
