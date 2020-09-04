
public class chan003 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=0; i<10; i++)
		{
			j=0;
			for(j=0; j<10; j++)
			{
				if(i*j + i + j ==71)
				{
					System.out.printf("i : %d, j : %d\n", i, j);					
				}
			
			}
		}

	}

}
