import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int before[];
		int ans[];
		
		int floor;
		Scanner s = new Scanner(System.in);
		
		floor = s.nextInt();
		
		if(floor == 1) {
			System.out.print("1");
		}
		
		if(floor==2) {
			System.out.printf("  1\n 1 1");
		}

		before = new int[floor+1];
		
		if(floor>=3) {
		for(int j=0; j<floor; j++) {
			ans = new int[j+1];
				for(int i=1; i<=j; i++) {
					before[0] = 1;
					before[j] = 1;
					ans[i] = before[i-1] + before[i];
					
					ans[0] = 1;
					ans[j] = 1;
					
					for(int k=1; k<=i; k++) {
					System.out.printf(" %d ",  ans[k]);
					}
					System.out.println("");
					before[i] = ans[i];
					
				
				
				}
			
		}
		}
	}

}
