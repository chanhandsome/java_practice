import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int p1, p2;
		int o1, o2;
		
		int b1 = 0;
		int b2 = 0;
		int s1 = 0;
		int s2 = 0;
		
		int count = 0;
		
		float L1;
		float L2;
		
		int l1, l2;
		int j1, j2;
		Scanner s = new Scanner(System.in);
		p1 = s.nextInt();
		p2 = s.nextInt();
		o1 = s.nextInt();
		o2 = s.nextInt();
		
		l1 = (p1-o1)*(p1-o1);
		l2 = (p2-o2)*(p2-o2);
		
		if(p1>=o1) {
			b1 = p1;
			s1 = o1;
		}
		else if(p1<o1) {
			b1 = o1;
			s1 = p1;
		}
		
		if(p2>=o2) {
			b2 = p2;
			s2 = o2;
		}
		else if(p2<o2) {
			b2 = o2;
			s2 = p2;
		}
		
		L1 = l1/l2;
		
		
		
		
		for(int i=s1+1; i<b1; i++) {
			for(int j=s2+1; j<b2; j++) {
				
				j1 = i*i;
				j2 = j*j;
				L2 = j1/j2;
				if(L1==L2) {
					count++;
				}
			}
		}
		
		System.out.printf("%d",  count);
		
		
		

	}

}
