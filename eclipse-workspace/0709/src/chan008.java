import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		String word;
		Scanner s = new Scanner(System.in);
		int i;
		
		System.out.print("단어를 입력하세요 : ");
		word = s.next();
		
		
		System.out.printf("\n%s",  word);
		System.out.printf("\n%d", word.length());
		System.out.printf("\n%s\n",  word = word.toUpperCase());
		for(i = word.length()-1; i>=0; i--)
		{
			System.out.printf("%c", word.charAt(i));
		}
		
	}

}
