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
		
		System.out.printf("%d�� ����� ",  num);
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
		
		System.out.printf("\n����� ������ %d��", j);
		System.out.printf("\n����� ������ %d", hap);
		System.out.printf("\n����� ���� %d", mul);
	}

}
