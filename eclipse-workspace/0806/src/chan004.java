import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int row, col;
		int num[][];
		Scanner s = new Scanner(System.in);
		
		System.out.print("행을 입력하세요 : ");
		row = s.nextInt();
		System.out.print("열을 입력하세요 : ");
		col = s.nextInt();
		
		num = new int[row][col];
		
			for(int i=0; i<row; i++) {
				num[i][0] = 1;
			}
			for(int j=0; j<col; j++) {
				num[0][j] = 1;
			}
		
		
		for(int i=1; i<row; i++) {
			for(int j=1; j<col; j++) {
				num[i][j] = num[i-1][j] + num[i][j-1];
				
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("%d ",  num[i][j]);
			}
			System.out.println("");
		}

	}

}
