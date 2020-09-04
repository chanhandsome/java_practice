import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int A, B;
		int C = 0;
		int D = 0;
		
		int dot1 = 0;
		int dot2 = 0;
		int dot3 = 0;
		int dot4 = 0;
		
		int Line1 = 0;
		
		boolean one = false;
		boolean two = false;
		boolean three = false;
		boolean four = false;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("한 현의 두 개의 점을 입력하시오 : ");
		A = s.nextInt();
		B = s.nextInt();
		System.out.println
		("두 번째 현의 두 개의 점을 입력하시오 : ");
		C = s.nextInt();
		D = s.nextInt();
		
		if(A<B) {
			dot1 = A;
			dot2 = B;
		}
		else if(B<A) {
			dot1 = B;
			dot2 = A;
		}
		
		if(C<D) {
			dot3 = C;
			dot4 = D;
		}
		else if(D<C) {
			dot3 = D;
			dot4 = C;
		}
		

		
			if(dot1>=dot3) {
				one = true;
			}
			if(dot1<=dot4&dot2>=dot4) {
				two = true;
			}
			
			if(dot1<=dot3&dot2>=dot3) {
				three = true;
			}
			if(dot2<=dot4) {
				four = true;
			}
			
			if(one==true&two==true) {
				System.out.print("두 현은 서로 교차합니다.");
			}
			if(three==true&four==true) {
				System.out.print("두 현은 서로 교차합니다.");
			}
			else {
				System.out.print("두 현은 서로 교차하지 않습니다.");
			}
}
}