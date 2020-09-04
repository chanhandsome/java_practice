import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		int count=0;
		int save = 0;
		int bun[];
		
		int compare = 0;
		
		num = s.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		
		bun = new int[count];
		
		for(int j=1; j<num; j++)
		{
			if(num%j==0) {
				bun[save] = j;
				save++;
			}
		}
		
		for(int k=0; k<=save; k++) {
			compare += bun[k];
			
		}
		
		if(compare==num) {
			System.out.printf("이 숫자는 완전수입니다.");
		}

	}

}
