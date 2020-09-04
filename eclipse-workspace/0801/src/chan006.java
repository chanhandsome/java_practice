import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		int c;
		int plus = 0;
		
		str = s.nextLine();
		c = s.nextInt();
		
		if(str.length()%c!=0) {
			int namozi = str.length()%c;
			plus = c - namozi;
		}

		for(int l=0; l<=plus; l++) {

			str = str+"x";
		}
		
		for(int j=0; j<=c; j++) {
			for(int i=0; i<=str.length()/c-1; i++) {
			System.out.printf("%c", str.charAt(i*c+j));
			}}
		

	}

}
