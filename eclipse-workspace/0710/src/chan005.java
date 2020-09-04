import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		float race;
		float waste;
		double rate;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("총주행거리(km, args) : ");
		race = s.nextFloat();
		
		System.out.printf(")\n총연료소모량(L) : ");
		waste = s.nextFloat();
		
		rate = race/waste;
		
		System.out.printf("당신 차량의 연비는 %.4f 입니다.", rate);
		
	}

}
