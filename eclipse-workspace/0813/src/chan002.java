import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int point1, point2;
		int range;
		int input1, input2;
		int p1[], p2[], p3[], p4[];
		p1 = new int[1];
		p2 = new int[1];
		p3 = new int[1];
		p4 = new int[1];
		int check[];
		check = new int[1];
		
		boolean end = false;
		
		int a=0;
		
		Scanner s = new Scanner(System.in);
		
		point1 = s.nextInt();
		point2 = s.nextInt();
		
		range = s.nextInt();
		
		input1 = s.nextInt();
		input2 = s.nextInt();
		
		p1[0] = point1 - range;
		p1[1] = point2;
		
		p2[0] = point1;
		p2[1] = point2 + range;
		
		p3[0] = point1 + range;
		p3[1] = point2;
		
		p4[0] = point1;
		p4[1] = point2 - range;
		
		check[0] = p1[0];
		check[1] = p1[1];
		

		
		
	}

}
