import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int A, B, C;
		int AB;
		float li, mi;
		
		Scanner s = new Scanner(System.in);
		System.out.print("A, B, C�� ���� ���� �Է��ϼ��� : ");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		AB = A*B;
		li = (float)AB/C;
		mi = (float)C/AB;
		
		System.out.printf("1L�δ� %.2f���͸� ĥ�߰�, 1M�� ĥ�ϴ� ���� %.2f���Ͱ� �ʿ��մϴ�.",  li, mi);

	}

}
