
public class chan009 {

	public static void main(String[] args) {
		int i;
		int number = 1;
		int j = 0;
		
		for(i=0; i<99; i++)
		{
			number++;
					
			if(number%3 != 0 & number%5 != 0 & number%7 != 0)
			{
				System.out.printf("%d, ",  number);
				j++;
			}
			
			if(j==10)
			{
				System.out.println("");
				j = 0;
			}
			
		}

	}

}
