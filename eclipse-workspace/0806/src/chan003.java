import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int num;
		int number[];
		int div = 0;
		boolean end = false;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� ���� �Է����� ����Ͻðڽ��ϱ�? : ");
		num = s.nextInt();
		
		number = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d���� ���ڸ� �Է��ϼ��� : ",  i+1);
			number[i] = s.nextInt();
			if(div<=number[i]) {
				div = number[i];
			}
		}
		
		
		for(int i=0; i<num; i++) {
			while(end == false) {
				if(number[i]%div!=0) {
					div--;
				}
				if(number[i]%div==0) {
					end = true;
				}
			}
			end = false;
		}
		
		System.out.printf("�ִ� ������� %d�Դϴ�.",  div);

	}

}
