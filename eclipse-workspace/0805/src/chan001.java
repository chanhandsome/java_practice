import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int SPLeft;
		float SPF;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� ������ ������ �� ���ΰ��� : ");
				SPLeft = s.nextInt();
				SPF = (float) (SPLeft*1.5*1.5*1.5);
		
		System.out.printf("%.1f�� ó�� ��Ӵϲ��� �������� ������ �����Դϴ�.",  SPF);

	}

}
