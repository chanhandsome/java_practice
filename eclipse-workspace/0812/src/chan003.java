import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int A1, A2;
		int B1, B2;
		int C1, C2;
		
		int i1, i2, k1, k2, l1, l2;
		
		boolean A = false;
		boolean B = false;
		boolean C = false;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ó�� ���� ũ�Ⱑ ���� ũ�� ������ �۾����ϴ�.");
		System.out.printf("\nù ��° ���� �Է��ϼ��� : ");
		A1 = s.nextInt();
		A2 = s.nextInt();

		System.out.printf("\n�� ��° ���� �Է��ϼ��� : ");
		B1 = s.nextInt();
		B2 = s.nextInt();

		System.out.printf("\n�� ��° ���� �Է��ϼ��� : ");
		C1 = s.nextInt();
		C2 = s.nextInt();
		
		
		
		if(A1/B1 == A2/B2) {
			A = true;
		}
		if(B1/C1 == B2/C2) {
			B = true;
		}
		if(A1/C1 == A2/C2) {
			C = true;
		}
		
		if(A==true & B==true & C==true) {
			System.out.print("�� ���� �� �������� �ֽ��ϴ�.");
		}
		else {
			System.out.print("�� ���� �� �������� �����ϴ�.");
		}
	}

}
