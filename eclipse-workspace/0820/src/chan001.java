import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int in[];
		in = new int[4];
		int out[];
		out = new int[4];
		
		int people = 0;
		int maxpeople = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<=3; i++) {
			System.out.printf("%d������ ź��� �Է� : ", i+1);
			in[i] = s.nextInt();
			System.out.printf("%d������ ������� �Է� : ", i+1);
			out[i] = s.nextInt();
		}
		
		for(int i=0; i<=3; i++) {
			people -= out[i];
			people += in[i];
			if(maxpeople<=people) {
				maxpeople = people;
			}
		}
		
		System.out.printf("�ִ� ��� ���� %d" , maxpeople);
		

	}

}
