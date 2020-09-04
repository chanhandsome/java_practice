
public class chan002 {

	public static void main(String[] args) {
		int a, b, c, d, e;
		a=0;
		b = a+1;
		c = b+1;
		d = c+1;
		e = d+1;
		
		while(a*a + b*b + c*c != d*d + e*e) {
			a++;
			b = a+1;
			c = b+1;
			d = c+1;
			e = d+1;
		}
		
		System.out.printf("%d, %d, %d, %d, %d",  a, b, c, d, e);

	}

}
