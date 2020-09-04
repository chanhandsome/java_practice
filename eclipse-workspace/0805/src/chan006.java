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
		System.out.print("통나무의 개수를 입력하세요 : ");
		input = s.nextInt();
		
			while(hap<input) {
				l=0;
				k++;
				for(int j=1; j<=k; j++) {
					l++;
				}
				hap += l;
			}
			System.out.printf("최하단의 통나무 수의 최소값은 %d 입니다.",  l);
			
			while(input>l) {
				input -= l;
				l--;
			}
			System.out.printf("\n최상단에 있는 통나무의 수는 %d 개 입니다.", input);
		
	}
	}
