import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {

		int split = 0;
		int n, k;
		
		int can = 0;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		int per = n;
		
		while(per!=0) {
			can++;
			per--;
			split++;
			
			if(split==k) {
				per++;
				split-=k;
			}
		}
		
			System.out.printf("%d",  can);
	}

}
