import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int hap = 0;
		int hapmax = 0;
		
		int input = 1;
		int start = 99;
		int end = 0;
		int save[];
		int count = -1;
		int startsaver = 0;
		save = new int[99];
		
		Scanner s = new Scanner(System.in);
		while(input!=0) {
			input = s.nextInt();
			count++;
			save[count] = input;
			hap += save[count];
			if(start>=count)
			{
				start = count;
			}
			if(hapmax<=hap) {
				end = count;
				hapmax = hap;
				startsaver = start;
			}
			if(hap+save[count]<=0) {
				hap = 0;
				start = 99;
			}
		}
		System.out.print("최대 구간은 [ ");
		for(int i=startsaver; i<=end; i++) {
			if(save[i]!=0) {
			System.out.printf("%d ",  save[i]);
			}
		}
		System.out.print("]이며");
		System.out.printf("\n합은 %d",  hapmax);
	}

}
