import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int max = 0;
		int min = 100;
		
		int in[];
		in = new int[3];
		int ans;
		
		int middle = 0;
		
		Scanner s = new Scanner(System.in);
		
		in[0] = s.nextInt();
		in[1] = s.nextInt();
		in[2] = s.nextInt();
		
		for(int i=0; i<=2; i++)
		{
			if(max<=in[i])
			{		max = in[i];		}
			if(min>=in[i])
			{		min = in[i];		}	
		}
		
		for(int k=0; k<=2; k++) 
		{
			if(min!=in[k] & max!=in[k])
			{		middle = in[k]; 	}
		}
		
		if(max-middle==middle-min)
		{
			if(max + max-middle <=100)
			{
				System.out.printf("%d\n",  max+max-middle);
			}
			
			if(min - (middle-min) >=0)
			{
				System.out.printf("%d\n",  min-(middle-min));
			}
		}
		
		else
		{
			ans = (max + min) - middle;
			System.out.printf("%d\n", ans);
		}

	}

}
