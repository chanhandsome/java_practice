import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		String input;
		int bit[];
		int num[];
		int save = 0;
		int reverse[];
		int reversenum = 0;
		int count = 0;
		bit = new int[20];
		reverse = new int[20];
		Scanner s = new Scanner(System.in);

		input = s.nextLine();
		num = new int[input.length()+1];
		
		
		for(int i=0; i<(int)(input.length()); i++) 
		{
			
				if((int)(input.charAt(i))>=48 & (input.charAt(i)<=57)) 
				{
					num[i] = (int)(input.charAt(i))-48;
				}
				if((int)(input.charAt(i))>=65 & (int)(input.charAt(i))<=70)
				{
					num[i] = (int)(input.charAt(i)-55);
				}
		System.out.printf("%d",  num[i]);
						
		}
		
		save += num[0];
		
		for(int i=1; i<(int)(input.length()); i++) 
		{	
			save += num[i];
		}
		
		for(int i=0; save>0; i++) {
			bit[i] = save%2;
			save /= 2;
			count++;
		}
		
		
		for(int i=0; i<=count; i++) {
			if(bit[i]==0) {
				reverse[i] = 1;
			}
			if(bit[i]==1) {
				reverse[i] = 0;
			}
		}
		
		reversenum += reverse[0];
		
		for(int i=1; i<=count; i++) {
			reversenum += (2^i)*reverse[i];
		}
		
		System.out.printf("\n%x",  reversenum);
		
		
	}
}