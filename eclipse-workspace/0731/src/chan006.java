import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		
		System.out.print("별 몇개로 할까요? : ");
		number = s.nextInt();
		String star="";
		String space="";
		
		for(int k=1; k<=number; k++) {
			star += "*";
			space += " ";
		}
		
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,star,star,star,space,space,space,space,space,star,star,star,space,space,space,star,space,space,space,space,space,star,space,star,star,star,star,star,space,star,space,space,space,space,space,star,star,star,star,star,space,star,star,star,star,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,space,space,space,star,space,space,space,star,space,space,space,star,space,space,star,space,space,space,space,space,star,space,star,space,space,space,space,space,star,space,space,space,space,space,star,space,space,space,space,space,space,space,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,space,space,space,space,star,space,star,space,space,space,space,space,star,space,space,star,space,space,space,star,space,space,star,space,space,space,space,space,star,space,space,space,space,space,star,space,space,space,space,space,space,space,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,space,space,space,space,star,space,star,space,space,space,space,space,star,space,space,star,space,space,space,star,space,space,star,star,star,star,star,space,star,space,space,space,space,space,star,star,star,star,star,space,space,space,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,space,space,space,space,star,space,star,space,space,space,space,space,star,space,space,star,space,space,space,star,space,space,star,space,space,space,space,space,star,space,space,space,space,space,star,space,space,space,space,space,space,space,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,space,space,space,star,space,space,space,star,space,space,space,star,space,space,space,space,star,space,star,space,space,space,star,space,space,space,space,space,star,space,space,space,space,space,star,space,space,space,space,space,space,space,star);
		}
		for(int i=1; i<=number; i++) {
			System.out.printf("%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s%s\n", 
					star,star,star,star,space,space,space,space,space,star,star,star,space,space,space,space,space,space,star,space,space,space,space,star,star,star,star,star,space,star,star,star,star,star,space,star,star,star,star,star,space,space,space,star);
		}

	}

}
