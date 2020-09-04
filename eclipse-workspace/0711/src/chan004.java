import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		double number;
		int sel;
		Scanner s = new Scanner(System.in);
		
		System.out.print("실수 입력");
		number = s.nextFloat();
		
		System.out.printf("\n1. 반올림    2. 버림    3. 올림");
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
//math.floor() -> 버림
//Math.ceil()  -> 올림
//math.round() -> 반올림