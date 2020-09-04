import java.util.Scanner;

public class chan0051 {

	public static void main(String[] args) {
		int days[];
		int today;
		int todaynum;
		int hap = 0;
		
		Scanner s = new Scanner(System.in);
		
		today = s.nextInt();
		todaynum = s.nextInt();
		
		days = new int[today+1];
		days[0] = 0;
		days[1] = 0;
		
		
		while(todaynum != hap) {
			days[1]++;
			for(int j=1; j<=days[1] & hap!=todaynum; j++) {
				days[0] = j;
				for(int k=1; k<today; k++)
				{
					hap = days[k] + days[k-1];
					days[k+1] = hap;
				}
			}
		}
		
		System.out.printf("%d, %d",  days[0], days[1]);
		

	}

}
