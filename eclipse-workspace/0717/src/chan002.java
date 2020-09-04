
public class chan002 {

	public static void main(String[] args) {
		char eng[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int i = 0;
		int j = 0;
		int k = 0;
		
		System.out.printf("%s",  eng);
		for(i=0; i<26; i++)
		{
			k=i;
			for(j=0; j<26; j++)
				{
					if(k==26)
					{
						k=0;
					}
					System.out.printf("%c", eng[k]);
					k++;
				}
			System.out.println("");
		}
				
		
	}

}
