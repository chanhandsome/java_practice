import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int num[];
		int nummax=0;
		num = new int[9];
		int rank=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� 9���� �Է��ϼ��� : ");
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
		
		System.out.printf("�ִ��� %d�̰�, �� ���� %d��° ���̴�.", nummax, rank+1);
	}

}
