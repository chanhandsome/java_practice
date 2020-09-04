import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		String input;
		String nine = "99bottles of Beer on the Wall";
		String H = "Hello World!";
		
		Scanner s = new Scanner(System.in);
		
		input = s.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='q' | input.charAt(i)=='Q') {
				System.out.printf("%s\n",  input);}
			else if(input.charAt(i)=='h'|input.charAt(i)=='H') {
				System.out.printf("%s\n",  H);}
			else if(input.charAt(i)=='9') {
				System.out.printf("%s\n",  nine);}
			else {
				System.out.printf("해당하지 않는 문자입니다\n");
			}
		}

	}

}
