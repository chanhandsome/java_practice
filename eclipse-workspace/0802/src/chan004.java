import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		float quartes = (float) 0.25;
		float dimes = (float) 0.10;
		float nuckels = (float) 0.05;
		float pennies = (float) 0.01;
		int Qg, Dg, Ng, Pg;
		
		float left;
		float given;
		
		Scanner s = new Scanner(System.in);
		System.out.print("줘야 할 거스름돈을 입력하세요 : ");
		left = s.nextFloat();
		given = left;
		
			Qg = (int)(left/0.25);
			given = (float) (left - 0.25*Qg);
			
			Dg = (int)(given/0.10);
			given = (float) (given - 0.10*Dg);
			
			Ng = (int)(given/0.05);
			given = (float) (given - 0.05*Ng);
			
			Pg = (int)(given/0.01);
		
		System.out.printf("%d quartes, %d diems, %d nickels, %d pennis", Qg, Dg, Ng, Pg);

	}

}
