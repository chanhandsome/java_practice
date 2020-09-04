import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		int num[];
		int hap = 0;
		int min = 9999;
		boolean nope = false;
		Scanner s = new Scanner(System.in);
		
		num = new int[7];
		
		System.out.println("7개의 자연수를 입력하세요.");
		for(int i=0; i<7; i++)
		{
			System.out.printf("%d번째 : ",  i+1);
			num[i] = s.nextInt();
			
			
			if(num[i]%2==1)
			{
				nope = true;
				hap += num[i];
				if(num[i]<min)
				{min = num[i];}
			}
		}

			if(nope == true)
				{System.out.printf("합은 %d이며, 최소값은 %d입니다.",  hap, min);}
			else
				{System.out.print("-1");}
	}

}
