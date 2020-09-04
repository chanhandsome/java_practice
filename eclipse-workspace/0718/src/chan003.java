import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		String word;
		int i;
		char ch;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		word=s.nextLine();
		
	    for(i=word.length()-1; i>=0; i--){ 

	    	       ch = word.charAt(i); 

	    	       System.out.print(ch); 



	}

}
}