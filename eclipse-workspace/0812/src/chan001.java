import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int random;
		char input;
		int count = 0;
		Scanner s = new Scanner(System.in);
		

		random = (int)((Math.random()*25) + 97);
		
		input = s.next().charAt(0);
		
			while((int)input!=random) {

				count++;
				if((int)input<97 | (int)input>122) {
					System.out.print("소문자를 입력하세요 : ");
					count--;
				}
				else if((int)input>random) {
					System.out.print("그보다 앞의 숫자입니다 : ");
				}
				else if((int)input<random) {
					System.out.print("그보다 뒤의 숫자입니다 : ");
				}
				input = s.next().charAt(0);
			}
		
		
		
		
			System.out.printf("%d번 만에 맞추었습니다", count+1);
	}

}
