import java.util.Scanner;

public class chan009 {

	public static void main(String[] args) {
		char input;
		int count = 1;
		int number;
		
		Scanner s = new Scanner(System.in);
		number = (int)(Math.random()*121)+97;
		
		System.out.print("a부터 z까지의 문자를 하나 입력하세요 : ");
		do{input = s.next().charAt(0);
		
		if((int)input>=97 & (int)input<= 122 & number>=97 & number<=122)
		{
			if((int)input>number)
				{
					System.out.print("그보다 앞에 있는 문자입니다.");
					count++;
				}
				if((int)input<number)
				{
					System.out.print("그보다 뒤에 있는 문자입니다.");
					count++;
				}
				else if((int)input==number)
				{
					System.out.printf("맞추었습니다. %d번 만에 맞추었습니다.", count);
					break;
				}
		}		
		else
			System.out.print("소문자를 입력하세요");
		}while((int)input!=number)	;

	

}
		
}
