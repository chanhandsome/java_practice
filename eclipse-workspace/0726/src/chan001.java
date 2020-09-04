import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int x;
		int a, b, c, d;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("ax+b = cx +d에서 a, b, c, d순서로 입력하세요 : ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		
		x = (d-b)/(a-c);
		
		System.out.printf("x의 값은 %d입니다.", x);
				

	}

}
