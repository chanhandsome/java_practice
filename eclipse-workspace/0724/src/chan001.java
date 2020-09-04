import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int hap;
		int minus;
		
		int A, B;
		
		Scanner s = new Scanner(System.in);
		System.out.print("두 수의 합과 차를 입력하세요 : ");
		hap = s.nextInt();
		minus = s.nextInt();
		
		A = (hap + minus)/2;
		B = hap-A;
		
		System.out.printf("두 수는 각각 %d, %d입니다.", A, B);

	}

}
