import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		int a, b, c;
		float x2, x1;
		int D;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("2차방정식의 계수 a, b, c를 입력하세요");
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
				System.out.print("b가 0이면 안됩니다");
			}
		}
		
		if(a!=0)
		{
//			 
			  D=b*b-4*a*c;//판별식
			  
			  if(D<0)
			   System.out.printf("근이없음");
			  else if(D==0)
			   System.out.printf("중근=%1f\n",-b/(2.0*a));
			  else 
			   System.out.printf("두 실근=%1f,%1f\n",-b+Math.sqrt(D)/(2.0*a),(-b-Math.sqrt(D))/(2.0*a));
			   
			  
			 }
			


		
		

	}

}
