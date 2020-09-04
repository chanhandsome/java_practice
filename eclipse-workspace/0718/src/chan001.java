
public class chan001 {

	public static void main(String[] args) {
		int A[][];
		int i;
		int j;
		
		A = new int[][] {
						{12, 30, 82, 54}, {43, 51, 32, 47}, {30, 42, 41, 69}
						};
		
	
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=3; j++)
			{
				A[i][j] = A[i][j]*10 +5;

				System.out.printf("%d, ",  A[i][j]);
			}
		}
	
	
	}

	

}
