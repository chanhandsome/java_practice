import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int student;
		int math[];
		double all;
		int hap = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ο����� �Է��ϼ��� : ");
		student = s.nextInt();
		
		math = new int[student];
		
		System.out.println("�� �л��� ���� ������ �Է��ϼ���.");
		for(int i=0; i<=student-1; i++)
		{
			System.out.printf("%d�� �л� : ",  i+1);
			math[i] = s.nextInt();
			hap += ((math[i]-student)^2);
		}
			all = hap/student;
			System.out.printf("�� ���� ���������� �л��� %f�Դϴ�.",  all);
	}

}
