import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int random;
		char input;
		int count = 0;
		Scanner s = new Scanner(System.in);
		

		random = (int)((Math.random()*25) + 97);
		
		input = s.next().charAt(0);
		
			while((int)input!=random) {

				count++;
				if((int)input<97 | (int)input>122) {
					System.out.print("�ҹ��ڸ� �Է��ϼ��� : ");
					count--;
				}
				else if((int)input>random) {
					System.out.print("�׺��� ���� �����Դϴ� : ");
				}
				else if((int)input<random) {
					System.out.print("�׺��� ���� �����Դϴ� : ");
				}
				input = s.next().charAt(0);
			}
		
		
		
		
			System.out.printf("%d�� ���� ���߾����ϴ�", count+1);
	}

}
