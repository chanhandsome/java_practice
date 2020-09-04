import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int floor;
		int tri[][];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("층 수를 입력하세요 : ");
		floor = s.nextInt();
		
		tri = new int[floor+1][floor+1];
		

		tri[1][1] = 1;
		tri[2][1] = 1;
		tri[2][2] = 1;
		
		
		for(int k=3; k<=floor; k++) {

			tri[k][1] = 1;
			tri[k][k] = 1;
			for(int j=2; j<k; j++) {
				tri[k][j] = tri[k-1][j] + tri[k-1][j-1];
			}

	}
		
		for(int i=1; i<=floor; i++)
		{				
				for(int b=0; b<=floor-i+1; b++)
			{
				System.out.print(" ");
			}
				for(int n=0; n<i; n++) 
			{	

				System.out.printf(" %d ",  tri[i][n+1]);	
			}
			System.out.println("");
		}

}
}

