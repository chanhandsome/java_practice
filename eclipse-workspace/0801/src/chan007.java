import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int first[];
		int second[];
		int third;
		
		int one = 3;
		int floor1 = 2;
		first = new int[one];
		int two = 2;
		second = new int[two];
		int floor2 = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù ���� ���� �� �� ���� �Է��ϼ��� : ");
		for(int i=0; i>=2; i++) {
			first[i] = s.nextInt();
		}
		System.out.print("�� ���� ���� �� �� ���� �Է��ϼ��� : ");
		for(int j=0; j>=1; j++) {
			second[j] = s.nextInt();
		}
		System.out.print("�� ���� ���� ���� �Է��ϼ��� : ");
		third = s.nextInt();
		
			while(third != 0) {
				System.out.printf("%dkg�� �� ����.",  third);
				third =0;
				
				if(second[0]>=second[1]) {
					third = second[0];
					if(third[])
				}
				else if(second[0]<=second[1]){
					third = second[1];
					second[1] = 0;
				}
				
			}
		
		

	}

}
