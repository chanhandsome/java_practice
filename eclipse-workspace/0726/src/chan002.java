import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		String name[];
		String person[];
		float time[];
		int num;
		
		float timeall = 0;
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		name = new String[num];
		person = new String[num];
		time = new float[num];
		
		for(int i=0; i<num; i++)
		{
			System.out.printf("�뷡 %d�� ����, ����, ����ð�(��)", i+1);
			name[i] = s.nextLine();
			person[i] = s.nextLine();
			time[i] = s.nextFloat();
			timeall += time[i];
		}
		
		for(int j=0; j<num; j++)
		{
			System.out.printf("�뷡 %d ==> %s %s %.1f��", j+1, person[j], name[j], time[j]);
		}
		
		System.out.printf("�� ����ð� : %d��",  timeall);
		

	}

}
