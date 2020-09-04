import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
	int input[][];
	char output[][];
	int col, row;
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("세로는 몇 줄로 입력하시겠습니까? :");
	row = s.nextInt();
	
	System.out.print("가로는 몇 줄로 입력하시겠습니까 : ");
	col = s.nextInt();
	
	input = new int[row][col];
	output = new char[row][col];
	for(int i=0; i<=row-1; i++) {
		for(int j=0; j<=col-1; j++) {
			System.out.printf("%d번 행의 %d번 열 : ",i+1, j+1);
			input[i][j] = s.nextInt();
			output[i][j] = (char)(input[i][j]+48);
		}
	}
	
	for(int k=0; k<=row-1; k++)
	{
		for(int l=0; l<=col-1; l++) 
		{
			if(l!=0&l!=col-1&k!=0&k!=row-1) {
				if(input[k][l]<input[k][l-1] & input[k][l]<input[k][l+1] & input[k][l]<input[k+1][l] & input[k][l]<input[k-1][l])
				{
					output[k][l] = '*';
				}
			}
			
			if(k==0) {
				if(l==0) {
					if(input[k][l]<input[k+1][l] & input[k][l]<input[k][l+1]) {
						output[0][0] = '*';
					}
				}
				else if(l==col-1) {
					if(input[k][l]<input[k][l-1] & input[k][l]<input[k+1][l]) {
						output[0][l] = '*';
					}
				}
				else if(l<col-1&l>0) {
					if(input[k][l]<input[k][l+1] & input[k][l]<input[k][l-1] & input[k][l]<input[k+1][l]) {
						output[k][l] = '*';
					}
				}
					
				
			}	
		
			if(k==row-1) {
				if(l==0) {
					if(input[k][l]<input[k-1][l] & input[k][l]<input[k][l+1]) {
						output[k][l] = '*';
					}
				}
				else if(l==col-1) {
					if(input[k][l]<input[k][l-1] & input[k][l]<input[k-1][l]) {
						output[k][l] = '*';
					}
				}
				else {
					if(input[k][l]<input[k][l-1]&input[k][l]<input[k-1][l]&input[k][l]<input[k][l+1]) {
						output[k][l] = '*';
					}
				}
			}
			if(l==col-1) {
				if(k==0) {
					if(input[k][l]<input[k+1][l] & input[k][l]<input[k][l-1]) {
						output[k][l] = '*';
					}
				}
				else if(k==col-1) {
					if(input[k][l]<input[k][l-1] & input[k][l]<input[k-1][l]) {
						output[k][l] = '*';
					}
				}
				else {
					if(input[k][l]<input[k-1][l]&input[k][l]<input[k+1][l]&input[k][l]<input[k][l-1]) {
						output[k][l] = '*';
					}
				}
				
			}
				if(l==0) {
					if(k==0) {
						if(input[k][l]<input[k+1][l] & input[k][l]<input[k][l+1]) {
							output[k][l] = '*';
						}
					}
					else if(k==col-1) {
						if(input[k][l]<input[k-1][l] & input[k][l]<input[k][l+1]) {
							output[k][l] = '*';
						}
					}
					else {
						if(input[k][l]<input[k-1][l]&input[k][l]<input[k+1][l]&input[k][l]<input[k][l+1]) {
							output[k][l] = '*';
						}
					}
			}
		}
	}
	
	
	for(int i=0; i<=row-1; i++) {
		for(int j=0; j<=col-1; j++) {
				System.out.printf("%c",  output[i][j]);
		}
		System.out.println("");
	}
	
	
	

}
}