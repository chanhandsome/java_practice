import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int count = 0;
		int a, b, c, d, e;
		int step1 = 0;
		int step2 = 0;
		
		int doA = 1;
		int doB = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Nikky�� ������ ���� �� ���ΰ� : ");
		a = s.nextInt();
		System.out.print("Nikky�� ������ ���� �� ���ΰ� : ");
		b = s.nextInt();
		System.out.print("Byron�� ������ ���� �� ���ΰ� : ");
		c = s.nextInt();
		System.out.print("Byron�� ������ ���� �� ���ΰ� : ");
		d = s.nextInt();
		System.out.print("�� step�� ����� ���� ������ : ");
		e = s.nextInt();
		
		for(int i=0; i<=e; i++) {
			count++;
			step1 += doA;
			if(count > a) {
				doA = -1;
			}
			if(count > a+b) {
				doA = 1;
				count = 0;
			}
			
			
		}
		
		count = 0;
		
		for(int i=0; i<=e; i++) {
			count++;
			step2 += doB;
			if(count > c) {
				doB = -1;
			}
			if(count > c+d) {
				doB = 1;
				count = 0;
			}
		}
		
		if(step1 > step2) {
			System.out.print("Nikky");
		}
		
		if(step1 == step2) {
			System.out.print("Tied");
		}
		
		if(step1 < step2) {
			System.out.print("Byron");
		}
	}

}
