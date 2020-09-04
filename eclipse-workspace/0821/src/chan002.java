import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		double line;
		float x, y;
		
		int input;
		
		double percent;
		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		
		x = s.nextFloat();
		y = s.nextFloat();
		
		line = Math.sqrt(x*x + y*y);
		
		percent = input/line;
		x *= percent;
		y *= percent;
		
		System.out.printf("%.0f, %.0f", x/1, y/1);
		
		

	}

}
