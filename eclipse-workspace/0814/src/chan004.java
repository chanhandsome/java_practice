import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int A, B;
		int count, save;
		int num;
		int clap = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� : ");
		A = s.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		B = s.nextInt();
		
		
		for(count=A; count<=B; count++) {
			num = count;
			save = count;
			if(num%3==0) {
				clap++;
			}
			else {
				while(save!=0) 
				{
				if(save%10==3|save%10==6|save%10==9) 
				{
					clap++;
					save = 0;
				}
					save/=10;
				}
			}
		
		}
		
		System.out.printf("�ڼ��� ġ�� Ƚ����%dȸ �Դϴ�.", clap);

	}

}
