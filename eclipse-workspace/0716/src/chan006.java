import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("16���� �� ���� �Է��ϼ��� :");
		
		num1 = s.nextInt(16);
		num2 = s.nextInt(16);
		
		System.out.printf("%d",  num1+num2);

	}

}
