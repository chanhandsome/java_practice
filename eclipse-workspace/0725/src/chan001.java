import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int used;
		int issue;
		int factor;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 개의 논문 인용되었으며 주요 요소가 얼마인지 적으시오 : ");
		issue = s.nextInt();
		factor = s.nextInt();
		
		
		used = factor*(issue-1);
		
		System.out.printf("최소 %d번 인용되었습니다", used+1);

	}

}

