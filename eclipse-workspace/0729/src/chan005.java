import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int num, div;
		int i=0;
		
		int save[];
		
		int hap = 0;
		int mul = 1;
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		System.out.printf("%d의 약수는 ",  num);
		for(div=1; div<=num; div++)
		{
			if(num%div==0)
			{
				i++;
				System.out.printf("%d, ", div);
			}
		}
		
		save = new int[i+1];
		int j=0;
		
		for(div=1; div<=num; div++)
		{
			if(num%div==0)
			{
				save[j] = div;
				j++;
			}
		}
		
		for(int k=0; k<j; k++)
		{
			hap += save[k];
			mul *= save[k];
		}
		
		System.out.printf("\n약수의 개수는 %d개", j);
		System.out.printf("\n약수의 총합읜 %d", hap);
		System.out.printf("\n약수의 곱은 %d", mul);
	}

}
