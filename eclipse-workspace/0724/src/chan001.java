import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int hap;
		int minus;
		
		int A, B;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� �հ� ���� �Է��ϼ��� : ");
		hap = s.nextInt();
		minus = s.nextInt();
		
		A = (hap + minus)/2;
		B = hap-A;
		
		System.out.printf("�� ���� ���� %d, %d�Դϴ�.", A, B);

	}

}
