import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int struc;
		int i;
		int l=0;
		int k=0;
		int point = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� ���� ���� ����ұ��? : ");
		struc = s.nextInt();
		
		for(i=0; i<=struc-3; i++)
		{
			l += i;
			k += l;
			point += k;
		}
		
		System.out.printf("%d������ �밢������ �����ϴ� ���� ���� %d�� �Դϴ�",  struc, point);

	}

}
