import java.util.Scanner;

public class chan009 {

	public static void main(String[] args) {
		char input;
		int count = 1;
		int number;
		
		Scanner s = new Scanner(System.in);
		number = (int)(Math.random()*121)+97;
		
		System.out.print("a���� z������ ���ڸ� �ϳ� �Է��ϼ��� : ");
		do{input = s.next().charAt(0);
		
		if((int)input>=97 & (int)input<= 122 & number>=97 & number<=122)
		{
			if((int)input>number)
				{
					System.out.print("�׺��� �տ� �ִ� �����Դϴ�.");
					count++;
				}
				if((int)input<number)
				{
					System.out.print("�׺��� �ڿ� �ִ� �����Դϴ�.");
					count++;
				}
				else if((int)input==number)
				{
					System.out.printf("���߾����ϴ�. %d�� ���� ���߾����ϴ�.", count);
					break;
				}
		}		
		else
			System.out.print("�ҹ��ڸ� �Է��ϼ���");
		}while((int)input!=number)	;

	

}
		
}
