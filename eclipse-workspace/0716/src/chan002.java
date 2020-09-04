import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int location;
		int i;
		int number[];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Fibonacci수열의 몇 번째 값?");
		location = s.nextInt();
		number = new int[location];
		
		number[0] = 0;
		number[1] = 1;
	
		for(i=1; i<=location-2; i++)
		{
			number[i+1] = number[i] + number[i-1];
			
		}
		
		System.out.printf("%d",  number[location-1]);
		
	}

}
