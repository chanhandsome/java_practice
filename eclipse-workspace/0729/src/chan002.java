import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c;
		int s1 = 0;
		int s2 = 0;
		
		boolean tri = false;
		
		Scanner s  = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세여 : ");
		
		c = s.nextInt();
		
		for(a=1; a<c; a++)
		{
			for(b=1; b<c; b++)
			{
				if(a*a+b*b == c*c)
				{ 
					tri = true;
					s1 = a;
					s2 = b;									
				}
				
			}
		}
		
		if(tri == true)
		{System.out.printf("%d, %d", s1, s2);}
		
		else
		{System.out.print("impossible.");}
	}
}