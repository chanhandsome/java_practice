import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int choise;
		float ver, hor, half;
		double area;
		String device;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("������ �����ϼ���(1:��, 2:�簢��, 3:�ﰢ��)");
		choise = s.nextInt();
		
		switch(choise) {
		case(1):
			device = "��";
			System.out.printf("%s�� ������ ����: ", device);
			half = s.nextFloat();
			area = half * half * 3.14;
			System.out.printf("%s�� ������ %f�Դϴ�", device, area);
		break;
			
		case(2):
			device = "�簢��";
			System.out.printf("%s�� ���� ����: ", device);
			hor = s.nextFloat();
			System.out.printf("%s�� ���� ����: ", device);
			ver = s.nextFloat();
			
			area = hor*ver;
			
			System.out.printf("%s�� ������ %f�Դϴ�.",  device, area);
		break;
		
		case(3):
			device = "�ﰢ��";
			System.out.printf("%s�� ���� ����: ", device);
			hor = s.nextFloat();
			System.out.printf("%s�� ���� ����: ", device);
			ver = s.nextFloat();
			
			area = hor*ver*0.5;
			
			System.out.printf("%s�� ������ %f�Դϴ�.",  device, area);
		break;
		
			
		}
	}

}
