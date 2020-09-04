import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int point;
		int input;
		
		int square = 2;
		
		Scanner s = new Scanner(System.in);
		
		input = s.nextInt();;
		
		for(int i=1; i<input; i++) {
		square = square + (square-1);
		}
		
		point = square * square;
		
		System.out.printf("%d",  point);

	}

}
