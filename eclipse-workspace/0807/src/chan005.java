import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
	int input;
	int count = 0;
	int check = 0;
	Scanner s = new Scanner(System.in);
	
	input = s.nextInt();
		for(int i=1; i<=input; i++) 
		{
			check = i;
				while(check!=0) 
				{
				
					if(check % 10==4)
					{
						check = 0;
						count++;
					}
					check /= 10;
				
				}
		
		}
		
		System.out.printf("%d:%d",  input, input-count);
	}
}