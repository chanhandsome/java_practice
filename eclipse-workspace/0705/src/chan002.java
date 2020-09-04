import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		

		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오");
		
		number = sc.nextInt();
		System.out.printf("08진수: %o\n" , number);

		System.out.printf("10진수: %d\n",  number);
	
		System.out.printf("16진수: %x\n",  number);
	}
		
	

}
