
public class chan002 {

	public static void main(String[] args) {
		double A[][];
		double B[][];
		int i, j;
		int l=0;
		int k=0;
		double C[][];
		
		A = new double[][] {{4.2, 4.3, 3.8}, {3.7, 1.5, 0.7}};
		B = new double[][] {{5.2, 2.1},{3.2, 1.4},{1.5, 3.6}};
		C = new double[2][3];

		for(i=0; i<=1; i++)
			{
				for(j=0; j<=2; j++)
				{
					
				
					
					C[i][j] = A[i][j]*B[k][l];	
					System.out.printf("%f ",  C[i][j]);
					l++;
	
					
					if(l==2)
					{
						l=0;
						k++;
					}
					
					
					
						
					
				}
				
			}

}
}