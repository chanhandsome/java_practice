import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int speed;
		int hour, minute, second;
		
		double mile;
		double mong;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ü�(km/h) : ");
		speed = s.nextInt();
		
		System.out.print("�����ð�(��, �� , ��) : ");
		hour = s.nextInt();
		minute = s.nextInt();
		second = s.nextInt();
		
		
		mile = second*speed + minute*speed*60 + hour*speed*3600;
		mong = mile/3600;
		
		System.out.printf("�޸� �Ÿ��� %.1f�Դϴ�", mong);

	}

}
