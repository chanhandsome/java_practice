import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		double $ = 1178.6;
		int input;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 달러를 입력하세요 : ");
		input = s.nextInt();
		
		System.out.printf("%f원 입니다",  input*$);
		

	}

}
