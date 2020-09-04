import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt();
		
		System.out.printf("당신이 살아온 날은 %d일, 시간은 %d시간 입니다.", age*365, age*365*24);

	}

}
