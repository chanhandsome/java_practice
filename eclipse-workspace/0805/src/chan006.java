import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int floor[];
		int i = 1;
		int here;
		int save = 0;
		int input;
		int k=0;
		int l=0;
		int hap = 0;
		int low;
		Scanner s = new Scanner(System.in);
		System.out.print("�볪���� ������ �Է��ϼ��� : ");
		input = s.nextInt();
		
			while(hap<input) {
				l=0;
				k++;
				for(int j=1; j<=k; j++) {
					l++;
				}
				hap += l;
			}
			System.out.printf("���ϴ��� �볪�� ���� �ּҰ��� %d �Դϴ�.",  l);
			
			while(input>l) {
				input -= l;
				l--;
			}
			System.out.printf("\n�ֻ�ܿ� �ִ� �볪���� ���� %d �� �Դϴ�.", input);
		
	}
	}
