import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int min=0;
		int mindisplay = 0;
		int day=0; 
		int hourdisplay=0;
		int hour=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("분(min)을 입력하세요 : ");
		min = s.nextInt();
		
		hour = min/60;
		day = hour/24;
		
		mindisplay = min-(hour*60);
		hourdisplay = hour-(day*24);
		System.out.printf("%d일, %d시간, %d분" ,  day, hourdisplay, mindisplay);
		

	}

}
