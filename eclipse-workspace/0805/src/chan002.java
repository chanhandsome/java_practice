import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		String str;
		int check = 0;
		int num2;
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자열을 입력하세요. 이 숫자가 N자리 숫자일 때 1~N이 각각 1번씩 나오면 Yes가 출력되고 아니면 No가 출력됩니다. :");
		str = s.nextLine();
		
		for(int j=1; j<=str.length(); j++) {
			num2 = j;
			for(int k=0; k<=str.length()-1; k++) {
				if(num2+48==str.charAt(k)) {
					check++;
					num2 = 0;
				}
			}

	}
		if(check==str.length()) {
			System.out.print("Yes");
		}
		else {
			System.out.printf("No");
		}

}
}
