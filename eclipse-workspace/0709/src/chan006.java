import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		float number;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ǽ� : ");
		number = s.nextFloat();
		
		System.out.printf("\n���� �κ� : %.0f\n�Ҽ� �κ� : %f",  number, number-(int)number);

	}

}
