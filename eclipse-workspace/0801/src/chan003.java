
public class chan003 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, g;
		a=0;
		b=a+1;
		c=a+2;
		d=a+3;
		e=a+4;
		f=a+5;
		g=a+6;
		
		while(a*a + b*b + c*c + d*d != e*e + f*f +g*g) {
			a++;
			b=a+1;
			c=a+2;
			d=a+3;
			e=a+4;
			f=a+5;
			g=a+6;
		}
		
		System.out.printf("%d, %d, %d, %d, %d, %d, %d",  a, b, c, d, e, f, g);

	}

}
