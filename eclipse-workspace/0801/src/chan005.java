import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int fir = 0;
		int sec = 0;
		int fromthree[];
		int now;
		int nownum;
		int day;
		int result = 0;
		
		Scanner s = new Scanner(System.in);
		
		now = s.nextInt();
		nownum = s.nextInt();
		
		fromthree = new int[now];
		while(nownum!=result) {
		for(int i=3; i<=now; i++) {
			
			if(nownum==result) {
				break;}
			sec++;
			
			for(int j=1; j<=sec; j++) {
				fir = j;			
				
				fromthree[0] = fir + sec;
				fromthree[1] = sec + fromthree[0];
				fromthree[i-1] = fromthree[i-2] + fromthree[i-3];
				result = fromthree[i-3];
				if(nownum==result) {
					break;
				}
			}
			if(nownum==result) {
				break;
		}
		}

	}
		System.out.printf("%d, %d\n", fir, sec);

}
}