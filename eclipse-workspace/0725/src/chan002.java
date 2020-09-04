import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int first;
		int second;
		
		int three;
		int four;
		int five;
		int six;
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("세 자리 수 두개를 각각 입력하세요");
		first = s.nextInt();
		second = s.nextInt();
		
		int middle = second/10;
		int middleone = second/100;
		
		three = first*(second%10);
		four = first*(middle-middleone*10);
		five = first*middleone;
		six = first*second;
		
		System.out.printf("(3)은 %d, (4)는 %d ,(5)는 %d, 마지막으로 (6)은 %d입니다.", three, four, five, six);
	}

}
