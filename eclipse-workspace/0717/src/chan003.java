import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int a, b, c;
		float x2, x1;
		int D;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("2���������� ��� a, b, c�� �Է��ϼ���");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		
		
		if(a==0)
		{
			if(b!=0)
			{
				x1 = -(c/b);
				System.out.printf("%f",  x1);
			}
			else
			{
				System.out.print("b�� 0�̸� �ȵ˴ϴ�");
			}
		}
		
		if(a!=0)
		{
//			 
			  D=b*b-4*a*c;//�Ǻ���
			  
			  if(D<0)
			   System.out.printf("���̾���");
			  else if(D==0)
			   System.out.printf("�߱�=%1f\n",-b/(2.0*a));
			  else 
			   System.out.printf("�� �Ǳ�=%1f,%1f\n",-b+Math.sqrt(D)/(2.0*a),(-b-Math.sqrt(D))/(2.0*a));
			   
			  
			 }
			


		
		

	}

}
