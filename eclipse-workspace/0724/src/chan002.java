import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int C = 0;
		Scanner s = new Scanner(System.in);
		
		do{System.out.print("�� ���� ���̸� �Է��ϼ��� ���� �� ���� �������� �Է��ϼ��� : ");
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		if(C>A+B)
		{
			System.out.println("�ﰢ���� �ƴմϴ�.");
		}
		}while(C>A+B);
			
			
		if((C^2)==(A^2 + B^2))
		{
			System.out.print("�ﰢ���� �����ﰢ���Դϴ�.");
		}
		
		if((C^2)>(A^2 + B^2))
		{
			System.out.print("�ﰢ���� �а��ﰢ���Դϴ�.");
		}
		
		if((C^2)<(A^2 + B^2))
		{
			System.out.print("�ﰢ���� �����ﰢ���Դϴ�.");
		}

	}

}
