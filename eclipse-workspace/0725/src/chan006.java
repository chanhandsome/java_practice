import java.util.Scanner;

public class chan006 {
	
	public static void main(String[] args) {
		int num;
		int num2;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� 2���� �Է��ϼ��� : ");
		
		num = s.nextInt();
		int orinum = num;
		num2 = s.nextInt();
		int orinum2 = num2;
		
		int i = 1;
		int j = 1;
		
		while(num!=1)
		{
			if(num%2==0){
				num /= 2;
				i++;
			}
			
			else if(num%2==1) {
				num = num*3 + 1;
				i++;
			}
		}
		
		while(num2!=1)
		{
			if(num2%2==0){
				num2 /= 2;
				j++;
			}
			
			else if(num%2==1) {
				num2 = num2*3 + 1;
				j++;
			}
		}
		
		if(j>i)
		{System.out.printf("%d�� %d�� ������ �� ���̰� �ִ��̴�.",  orinum2, j);}
		if(j==i)
		{System.out.printf("���� ���̸� ������ �� ���̴� %d�̴�.",  j);}
		if(j<i)
		{System.out.printf("%d�� %d�� ������ �� ���̰� �ִ��̴�.",  orinum, i);}
		

	}

}
		
		
