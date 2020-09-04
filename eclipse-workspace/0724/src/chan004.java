import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int student;
		int math[];
		double all;
		int hap = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("반의 인원수를 입력하세요 : ");
		student = s.nextInt();
		
		math = new int[student];
		
		System.out.println("각 학생의 수학 점수를 입력하세요.");
		for(int i=0; i<=student-1; i++)
		{
			System.out.printf("%d번 학생 : ",  i+1);
			math[i] = s.nextInt();
			hap += ((math[i]-student)^2);
		}
			all = hap/student;
			System.out.printf("이 반의 수학점수의 분산은 %f입니다.",  all);
	}

}
