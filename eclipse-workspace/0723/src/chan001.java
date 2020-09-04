import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int struc;
		int i;
		int l=0;
		int k=0;
		int point = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇각형의 점의 수를 출력할까요? : ");
		struc = s.nextInt();
		
		for(i=0; i<=struc-3; i++)
		{
			l += i;
			k += l;
			point += k;
		}
		
		System.out.printf("%d각형의 대각선끼리 교차하는 점의 수는 %d개 입니다",  struc, point);

	}

}
