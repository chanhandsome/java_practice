import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int n;
		int r;
		double rec;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �������� �ٰ����� ���� ������ �Է��ϼ��� : ");
		r = s.nextInt();
		n = s.nextInt();
		
		//double cot = 1/Math.tan(3.14/n);
		double t = 1/Math.tan(3.14/n);
		rec = t*r/2;
		
		System.out.printf("%f",  rec);

	}

}
