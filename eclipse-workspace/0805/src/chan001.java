import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int SPLeft;
		float SPF;
		Scanner s = new Scanner(System.in);
		
		System.out.print("남은 고구마의 개수는 몇 개인가요 : ");
				SPLeft = s.nextInt();
				SPF = (float) (SPLeft*1.5*1.5*1.5);
		
		System.out.printf("%.1f가 처음 어머니꼐서 가져오신 고구마의 개수입니다.",  SPF);

	}

}
