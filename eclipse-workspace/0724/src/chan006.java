import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int days;
		int coin = 0;
		int day;
		int i=0;
		int l=1;
		int k=0;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ĥ°�� ��ȭ�� ���� ���ұ��? : ");
		day = s.nextInt();
		
		for(days=1; days<=day; days++)
		{
			i++;
			coin += l;
			
			if(l==i)
			{
				i=0;
				l++;
			}
			
		}
		
		System.out.printf("�� ��ȭ�� ���� %d�� �Դϴ�.",  coin);
	}

}
