import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int first;
		int second;
		int ans = 0;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		first = s.nextInt();
		
		System.out.print("두 번째 정수 : ");
		second = s.nextInt();
		
		if(first > second)
			 ans = first - second;
		else if(second > first)
			 ans = second - first;
		else
			System.out.print("같은 값입니다.");
	
		
		if(0>first*second)
			System.out.print("다른 부호입니다.");
			//같은부호
			
		if(0<first*second)
			System.out.print("같은 부호입니다.");
			//다른 부호
			
		System.out.printf("두 값의 차는 %d이다", ans);
		
			
					

	}

}
