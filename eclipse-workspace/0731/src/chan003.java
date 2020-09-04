import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int N = 0;
		int M;
		int hap = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");		
		M = s.nextInt();
		
		while(hap < M) {
			N++;
			hap += N;
		}
		
		System.out.printf("%d까지의 합은 그 숫자보다 작은 값입니다.",  N-1);

	}

}

