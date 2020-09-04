import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int num;
		int i;
		int hap = 0;
		int set[];
		
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		set = new int[i];
		
		
		
		for(int j=0; j<=i-1; j++)
		{
			for(num=1; num<=j+1; num++)
			{
				set[j] += num;
			}
			hap += set[j];
		}
		
		System.out.printf("%dÀÔ´Ï´Ù",  hap);
		

	}

}
