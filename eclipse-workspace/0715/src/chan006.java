import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int first;
		int second;
		int ans = 0;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		first = s.nextInt();
		
		System.out.print("�� ��° ���� : ");
		second = s.nextInt();
		
		if(first > second)
			 ans = first - second;
		else if(second > first)
			 ans = second - first;
		else
			System.out.print("���� ���Դϴ�.");
	
		
		if(0>first*second)
			System.out.print("�ٸ� ��ȣ�Դϴ�.");
			//������ȣ
			
		if(0<first*second)
			System.out.print("���� ��ȣ�Դϴ�.");
			//�ٸ� ��ȣ
			
		System.out.printf("�� ���� ���� %d�̴�", ans);
		
			
					

	}

}
