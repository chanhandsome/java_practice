import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		float xy[][];
		float distanceforx;
		float distancefory;
		float distancedouble;
		double distance;
		
		Scanner s = new Scanner(System.in);

		xy = new float[2][2];
		
		System.out.print("점1 : ");
		xy[0][0] = s.nextFloat();
		xy[0][1] = s.nextFloat();
		
		System.out.printf("\n점2 : ");
		xy[1][0] = s.nextFloat();
		xy[1][1] = s.nextFloat();
		

		distanceforx = (xy[1][0]-xy[0][0]);
		distancefory = (xy[1][1]-xy[0][1]);
		distancedouble = (distanceforx*distanceforx) + (distancefory*distancefory);
		
		distance = Math.sqrt(distancedouble);
		
		System.out.printf("두 점 사이의 거리 : %.2f", distance);
	}

}
