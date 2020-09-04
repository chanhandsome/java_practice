import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int num[];
		int nummax=0;
		num = new int[9];
		int rank=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 9개를 입력하세요 : ");
		for(int i=0; i<9; i++)
		{
			num[i] = s.nextInt();
		}
		
		for(int j=0; j<8; j++)
		{
			if(num[j+1] > num[j])
			{
				nummax = num[j+1];
				rank = j+1;
			}
		}
		
		System.out.printf("최댓값은 %d이고, 이 값은 %d번째 수이다.", nummax, rank+1);
	}

}
