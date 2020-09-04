import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		float xy[][];
		double angle;
		double y;
		double linear;
		int i = 0;
		boolean fact;
		
		
		Scanner s = new Scanner(System.in);
		
		xy = new float[2][2];
		System.out.print("두 개의 좌표를 입력하세요");
		
		System.out.printf("\n점1(x1, y1):");
		xy[0][0] = s.nextFloat();
		xy[0][1] = s.nextFloat();
		
		System.out.printf("\n점2(x2, y2):");
		xy[1][0] = s.nextFloat();
		xy[1][1] = s.nextFloat();
		
		//angle = y2-y1/x2-x1
		angle = (xy[1][1]-xy[0][1])/(xy[1][0]-xy[0][0]);
		y = xy[0][1] - angle*xy[0][0];
		
		
		for(i=0; i>2; i++)
		{
		linear = angle*xy[i][0] + y;
		

	}

}
}