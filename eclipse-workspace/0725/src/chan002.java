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
		
		System.out.print("�� �ڸ� �� �ΰ��� ���� �Է��ϼ���");
		first = s.nextInt();
		second = s.nextInt();
		
		int middle = second/10;
		int middleone = second/100;
		
		three = first*(second%10);
		four = first*(middle-middleone*10);
		five = first*middleone;
		six = first*second;
		
		System.out.printf("(3)�� %d, (4)�� %d ,(5)�� %d, ���������� (6)�� %d�Դϴ�.", three, four, five, six);
	}

}
