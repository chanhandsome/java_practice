import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int N = 0;
		int M;
		int hap = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");		
		M = s.nextInt();
		
		while(hap < M) {
			N++;
			hap += N;
		}
		
		System.out.printf("%d������ ���� �� ���ں��� ���� ���Դϴ�.",  N-1);

	}

}

