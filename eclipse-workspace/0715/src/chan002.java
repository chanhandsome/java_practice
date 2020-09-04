import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int speed;
		int hour, minute, second;
		
		double mile;
		double mong;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("시속(km/h) : ");
		speed = s.nextInt();
		
		System.out.print("운전시간(시, 분 , 초) : ");
		hour = s.nextInt();
		minute = s.nextInt();
		second = s.nextInt();
		
		
		mile = second*speed + minute*speed*60 + hour*speed*3600;
		mong = mile/3600;
		
		System.out.printf("달린 거리는 %.1f입니다", mong);

	}

}
