import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int choise;
		float ver, hor, half;
		double area;
		String device;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("도형을 선택하세요(1:원, 2:사각형, 3:삼각형)");
		choise = s.nextInt();
		
		switch(choise) {
		case(1):
			device = "원";
			System.out.printf("%s의 반지름 길이: ", device);
			half = s.nextFloat();
			area = half * half * 3.14;
			System.out.printf("%s의 면적은 %f입니다", device, area);
		break;
			
		case(2):
			device = "사각형";
			System.out.printf("%s의 가로 길이: ", device);
			hor = s.nextFloat();
			System.out.printf("%s의 세로 길이: ", device);
			ver = s.nextFloat();
			
			area = hor*ver;
			
			System.out.printf("%s의 면적은 %f입니다.",  device, area);
		break;
		
		case(3):
			device = "삼각형";
			System.out.printf("%s의 가로 길이: ", device);
			hor = s.nextFloat();
			System.out.printf("%s의 세로 길이: ", device);
			ver = s.nextFloat();
			
			area = hor*ver*0.5;
			
			System.out.printf("%s의 면적은 %f입니다.",  device, area);
		break;
		
			
		}
	}

}
