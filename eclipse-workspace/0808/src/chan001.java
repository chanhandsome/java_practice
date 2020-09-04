import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		String str = "";
		String strmax = "";
		int max = 0;
		Scanner s = new Scanner(System.in);
		
		 do{
		str = s.nextLine();
		if(str.length()>=max) {
			strmax = str;
			max = str.length();
		}
		}while(str.length()!=0);
		
		System.out.printf("가장 긴 단어 : %s\n단어 길이 : %d",  strmax, max);
		

	}

}
