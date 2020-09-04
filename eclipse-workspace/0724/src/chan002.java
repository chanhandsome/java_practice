import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C = 0;
		Scanner s = new Scanner(System.in);
		
		do{System.out.print("세 변의 길이를 입력하세요 가장 긴 변을 마지막에 입력하세요 : ");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		if(C>A+B)
		{
			System.out.println("삼각형이 아닙니다.");
		}
		}while(C>A+B);
			
			
		if((C^2)==(A^2 + B^2))
		{
			System.out.print("삼각형은 직각삼각형입니다.");
		}
		
		if((C^2)>(A^2 + B^2))
		{
			System.out.print("삼각형은 둔각삼각형입니다.");
		}
		
		if((C^2)<(A^2 + B^2))
		{
			System.out.print("삼각형은 예각삼각형입니다.");
		}

	}

}
