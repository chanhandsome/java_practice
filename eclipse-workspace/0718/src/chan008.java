import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		float stick;
		float move;
		int eachsale;
		double B;
		double C;
		float pay;
		
		int num=0;
		
		boolean BREAK=false;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.print("���� ����� �Է��ϼ��� : ");
		
		stick = s.nextFloat();
		System.out.print("���� ����� �Է��ϼ��� : ");
		move = s.nextFloat();
		System.out.print("�� ���귮�� �Է��ϼ��� : ");
		eachsale = s.nextInt();
	
		
		System.out.print("�Ǹ��� ������ ������ �Է��ϼ��� : ");
		pay = s.nextFloat();
		
		if(move>pay)
			System.out.printf("���� ����� �Ǹ� ���Ǻ��� ��Ҽ� �����ϴ�.\n");
		
		}while(move>pay);
			
		do{	
			C = pay * (eachsale+num);		
			B = move * (eachsale+num);
				if(C>=(B+stick))
					BREAK = true;
				else if(C<B+stick)
					{
					 BREAK = false;
					 num++;
					}
		}while(BREAK==false);
	
	
		if(num==0)
			System.out.print("���� �б����� �Ѿ����ϴ�.");
		else if(num>=0)
			{
			 System.out.print("���� �������� ���� ���߽��ϴ�.");
			 System.out.printf("������ ������ %d�� �ø��� ���� �б����� ���� �� �ֽ��ϴ�.", num);
			}
	}

}
