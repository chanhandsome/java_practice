import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int used;
		int issue;
		int factor;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� �� �ο�Ǿ����� �ֿ� ��Ұ� ������ �����ÿ� : ");
		issue = s.nextInt();
		factor = s.nextInt();
		
		
		used = factor*(issue-1);
		
		System.out.printf("�ּ� %d�� �ο�Ǿ����ϴ�", used+1);

	}

}

