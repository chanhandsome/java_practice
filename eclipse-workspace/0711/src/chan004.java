import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		double number;
		int sel;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է�");
		number = s.nextFloat();
		
		System.out.printf("\n1. �ݿø�    2. ����    3. �ø�");
		sel = s.nextInt();
		
		
		if(sel == 1)
		{	
			System.out.printf("%.0f", number);
		}
		
		if(sel == 2)
		{
			number = Math.floor(number);
			System.out.printf("%.0f", number);
		}
		
		if(sel == 3)
		{
			number = Math.ceil(number);
			System.out.printf("%.0f", number);
		}

	}

}
//math.floor() -> ����
//Math.ceil()  -> �ø�
//math.round() -> �ݿø�