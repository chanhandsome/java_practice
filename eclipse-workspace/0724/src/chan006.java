import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int days;
		int coin = 0;
		int day;
		int i=0;
		int l=1;
		int k=0;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("며칠째의 금화의 수를 구할까요? : ");
		day = s.nextInt();
		
		for(days=1; days<=day; days++)
		{
			i++;
			coin += l;
			
			if(l==i)
			{
				i=0;
				l++;
			}
			
		}
		
		System.out.printf("총 금화의 수는 %d개 입니다.",  coin);
	}

}
