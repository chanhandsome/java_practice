import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int struc[];
		struc = new int[5];

		int i;
		boolean ask=false;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ټ����� �Է��ϼ��� : ");
		for(i=0; i<=4; i++)
		{
			struc[i] = s.nextInt();
		}
		
		for(i=4; i>=1; i--)
		{
			if(struc[i] != struc[i-1]+1)
				ask = false;
			else
				ask = true;
		}
		
		for(i=1; i<=4; i++)
		{
			if(struc[i] != struc[i-1]+1)
				ask = false;
			else
				ask = true;
		}
		
		if(ask == true)
			System.out.print("�ټ� ���ڴ� ���Ӽ����Դϴ�.");
		
		else
			System.out.print("�ټ� ���ڴ� ������ �ƴմϴ�.");
		
	}

}
