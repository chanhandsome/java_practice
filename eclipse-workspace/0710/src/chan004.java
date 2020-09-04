import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		age = s.nextInt();
		
		System.out.printf("여러분은 5년 후에 %d살, 10년 후에는 %d살입니다.", age+5, age+10);

	}

}
