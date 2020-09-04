
public class chan003 {

	public static void main(String[] args) {
	
		int i = 65;
		int j;
		int k = 0;
		int l;
		for(j=0; j<=24; j++)
		{
			k++;			
			for(l=0; l<=k; l++)
			{
				System.out.printf("%c",  (char)i);
				i++;
			}
			i = 65;
			System.out.println("");
		}
}
}
