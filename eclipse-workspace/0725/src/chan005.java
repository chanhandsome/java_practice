import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		int i = 1;
		
		while(num!=1)
		{
			if(num%2==0){
				num /= 2;
				System.out.printf("%d번째는 %d\n", i, num);
				i++;
			}
			
			else if(num%2==1) {
				num = num*3 + 1;
				System.out.printf("%d번째는 %d\n", i, num);
				i++;
			}
		}
		

	}

}
