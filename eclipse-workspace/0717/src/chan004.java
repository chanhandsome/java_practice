import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int input;
		int count = 1;
		int number;
		
		Scanner s = new Scanner(System.in);
		number = (int)(Math.random()*200)+1;
		
		System.out.print("1���� 200������ ���ڸ� �ϳ� �Է��ϼ��� : ");
		do{input = s.nextInt();
	
				if(input>number)
				{
					System.out.print("�� �۽��ϴ�");
					count++;
				}
				else if(input<number)
				{
					System.out.print("�� Ů�ϴ�.");
					count++;
				}
				else if(input==number)
				{
					System.out.printf("���߾����ϴ�. %d�� ���� ���߾����ϴ�.", count);
					break;
				}
				
		}while((int)input!=number)	;

	

}
		
}
