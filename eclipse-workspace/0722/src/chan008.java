import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		int num[];

		int i, j, k;
		int div3, div2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� n�� �Է��ϼ��� : ");
		i = s.nextInt();
		num = new int[i+1];
		num[0] = 1;
		num[1] = 2;
		num[2] = 4;
		
		for(k=3; k<=i; k++)
			{
				num[k] = num[k-1]+num[k-2]+num[k-3];
			}
		
		System.out.printf("N�� ������ �ִ� ������ %d�� �Դϴ�.",  num[i-1]);
		
		

	}

}
