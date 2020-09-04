import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int num[];

		int i, j, k;
		int div3, div2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 n을 입력하세요 : ");
		i = s.nextInt();
		num = new int[i+1];
		num[0] = 1;
		num[1] = 2;
		num[2] = 4;
		
		for(k=3; k<=i; k++)
			{
				num[k] = num[k-1]+num[k-2]+num[k-3];
			}
		
		System.out.printf("N의 공식의 최대 개수는 %d개 입니다.",  num[i-1]);
		
		

	}

}
