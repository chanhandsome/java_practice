import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int shit;
		int max = 0;
		int min;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���Ⱑ ��ΰ��� : ");
		shit = s.nextInt();
		
		
		min = (shit-1)/3+1;
		if(shit%2==1)
		{
			max = shit/2 + 1;
		}
		else if(shit%2==0)
		{
			max = shit/2;
		}
		
		System.out.printf("���� ���� ������ �ִ� ������ %d, �ּ� ������ %d�Դϴ�.",  max, min);
	}

}

/* �ּ��� ���� ������ 1-1-1-2-2-2-3-3-3-4-4-4-5-5-5-6-6-6-7-7-7....������ �����ϴ°��� Ȯ���ߴ�.
     ���� 3, 6, 9, 12, 15���� ������ 1�� �����Ͽ� ������ ���ߴ�.*/