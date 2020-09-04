import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		float number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("실수 : ");
		number = s.nextFloat();
		
		System.out.printf("\n정수 부분 : %.0f\n소수 부분 : %f",  number, number-(int)number);

	}

}
