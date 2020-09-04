import java.util.Scanner;

public class chan001easy {

	public static void main(String[] args) {
		int brown, red;
		int i=3;
		
		int x, y;
		Scanner s = new Scanner(System.in);
		
		System.out.print("갈색 타일을 입력하세요 : ");
		brown = s.nextInt();
		System.out.print("빨간 타일을 입력하세요 : ");
		red = s.nextInt();
		
		do {
			x = (brown+red)/i;
			y = i;

			i++;
			
		}
		while((brown+red)/i - 2 != red/(i+2));
		
		System.out.printf("%d x %d",  x, y);

	}

}
