import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int input;
		int count = 1;
		int number;
		
		Scanner s = new Scanner(System.in);
		number = (int)(Math.random()*200)+1;
		
		System.out.print("1부터 200까지의 숫자를 하나 입력하세요 : ");
		do{input = s.nextInt();
	
				if(input>number)
				{
					System.out.print("더 작습니다");
					count++;
				}
				else if(input<number)
				{
					System.out.print("더 큽니다.");
					count++;
				}
				else if(input==number)
				{
					System.out.printf("맞추었습니다. %d번 만에 맞추었습니다.", count);
					break;
				}
				
		}while((int)input!=number)	;

	

}
		
}
