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
		
		
		System.out.print("학생 수를 입력하세요 : ");
		students = s.nextInt();
		each = new char[students][5];
		
		for(i=0; i<=students-1; i++)
		{
			System.out.print("번호:");
			num = s.next().charAt(0);
			System.out.print("이름:");
			name = s.next().charAt(0);
			System.out.print("국어:");
			kor = s.nextInt();
			System.out.print("영어:");
			eng = s.nextInt();
			System.out.print("수학:");
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