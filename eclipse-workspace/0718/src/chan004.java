import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		String str;
		String word;
		int i=0;
		int length;
		int end = 1;
		int end2 = 0;
		
		Scanner s = new Scanner(System.in);
		
		
			System.out.print("영어 문장을 입력하세요");
		
		
	
	
		do{str = s.next();
		
		
		length = str.length();
		i++;
		System.out.printf("%d번째 단어의 글자 개수는 %d개 입니다.\n", i, length);
		
		}while(end==1);
		
		
		

}
}
