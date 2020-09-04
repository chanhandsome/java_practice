
public class chan001 {

	public static void main(String[] args) {
		double later;
		double before;
		int i = 0;
		
		before = 100;
		later = before * (1.04);
		
		do
		{
			before = later;
			later = before * (1.04);
			i++;
		}while(later <= 150);
		
		System.out.printf("%d년 걸린다", i);
		

	}

}
