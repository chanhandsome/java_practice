import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = s.nextInt();
		
		System.out.printf("����� ��ƿ� ���� %d��, �ð��� %d�ð� �Դϴ�.", age*365, age*365*24);

	}

}
