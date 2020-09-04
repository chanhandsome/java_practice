import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		str = s.nextLine();
		
		System.out.printf("문자열의 길이는 %d 입니다",  str.length());
		
	}

}
