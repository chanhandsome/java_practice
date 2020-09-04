import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int m, n;
		int i = 0;
		int TorF = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("m과 n을 입력하세요 : ");
		m = s.nextInt();
		n = s.nextInt();
		
		do {
		if(m>n)
			TorF = 1;
		
		if(m<n)
			TorF = 2;
		
		
		switch(TorF) {
		case 1:
		{
			i = n;
			n++;
			break;
		}
		
		case 2:
		{
			i = m;
			m++;
			break;
		}
		
		
		}System.out.printf("%d ", i);
		}while(m!=n);
		System.out.printf("%d ", i+1);
	}

}
