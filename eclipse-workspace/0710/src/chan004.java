import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		
		age = s.nextInt();
		
		System.out.printf("�������� 5�� �Ŀ� %d��, 10�� �Ŀ��� %d���Դϴ�.", age+5, age+10);

	}

}
