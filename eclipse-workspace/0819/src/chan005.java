import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int N, F;
		int count;
		
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		F = s.nextInt();
		
		N /= 100;
		N *= 100;
		
		for(count=0; count<100; count++) {
			if(N%F==0) {
				System.out.printf("%d",  count);
				break;
			}
			N += 1;
		}

	}

}
