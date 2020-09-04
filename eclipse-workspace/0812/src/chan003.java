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
		System.out.print("처음 점의 크기가 가장 크고 갈수록 작아집니다.");
		System.out.printf("\n첫 번째 점을 입력하세요 : ");
		A1 = s.nextInt();
		A2 = s.nextInt();

		System.out.printf("\n두 번째 점을 입력하세요 : ");
		B1 = s.nextInt();
		B2 = s.nextInt();

		System.out.printf("\n세 번째 점을 입력하세요 : ");
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
			System.out.print("세 점은 한 일직선상에 있습니다.");
		}
		else {
			System.out.print("세 점은 한 일직선상에 없습니다.");
		}
	}

}
