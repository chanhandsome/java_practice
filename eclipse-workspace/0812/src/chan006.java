import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		char ten[];
		char twel[];
		
		ten = new char[] {'��', '��', '��', '��', '��', '��', '��', '��', '��', '��'};
		twel = new char[] {'��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��'};
		
		int fir = 6;
		int sec = 8;
		
		int input;
		int follow = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� �������� ã�� �ͳ��� : ");
		input = s.nextInt();
		
		for(follow = 1; follow<=input; follow++) {
			fir++;
			sec++;
			if(fir==10) {
				fir=0;
			}
			if(sec==12) {
				sec=0;
			}
		}
		
		System.out.printf("%s%s���̴�", ten[fir], twel[sec]);
		
	}

}
