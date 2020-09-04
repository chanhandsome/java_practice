import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int input;
		int FH, OH, FT, OT;
		
		Scanner s = new Scanner(System.in);
		
		input = s.nextInt();
		
		input = input - 150;
		
		FH = input/500;
		input = input - FH*500;
		
		OH = input/100;
		input = input - OH*100;
		
		FT = input/50;
		input = input - FT*50;
		
		OT = input/10;
		input = input - OT*10;
		
		System.out.printf("500원짜리 : %d\n100원짜리 : %d\n50원짜리 : %d\n10원짜리 : %d", FH, OH, FT, OT);

	}

}
