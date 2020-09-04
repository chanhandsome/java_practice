import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int N;
		int pentagon = 1;
		int area;
		int plus = 3;
		 Scanner s = new Scanner(System.in);
		 
		 N = s.nextInt();
		 
		 for(int i=1; i<=N; i++) {
			 area = plus*i + 1;
			 pentagon += area;
		 }
		 
		 System.out.printf("%d",  pentagon);

	}

}
