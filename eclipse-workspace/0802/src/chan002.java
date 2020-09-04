import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int A, B, C;
		int AB;
		float li, mi;
		
		Scanner s = new Scanner(System.in);
		System.out.print("A, B, C의 값을 각각 입력하세요 : ");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		AB = A*B;
		li = (float)AB/C;
		mi = (float)C/AB;
		
		System.out.printf("1L로는 %.2f미터를 칠했고, 1M를 칠하는 데는 %.2f리터가 필요합니다.",  li, mi);

	}

}
