import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int students;
		char each[][];
		float everko;
		float evereng;
		float evermath;
		float ever;
		int rank;
		
		char num;
		char name;
		int kor;
		int eng;
		int math;
		
		int i;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		students = s.nextInt();
		each = new char[students][5];
		
		for(i=0; i<=students-1; i++)
		{
			System.out.print("��ȣ:");
			num = s.next().charAt(0);
			System.out.print("�̸�:");
			name = s.next().charAt(0);
			System.out.print("����:");
			kor = s.nextInt();
			System.out.print("����:");
			eng = s.nextInt();
			System.out.print("����:");
			math = s.nextInt();
			
			each[i][0] = num;
			each[i][1] = name;
			each[i][2] = (char) kor;
			each[i][3] = (char) eng;
			each[i][4] = (char) math;
			
			for(int j=0; j<=4; j++)
			{System.out.printf("%c",  each[i][j]);}
		}

}
}