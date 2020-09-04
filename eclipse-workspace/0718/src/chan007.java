import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		float inchi;
		double cenchi;
		float pyeng;
		double meter;
		char choise;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("수행할 프로그램을 선택하세요\na.인치를 센치미터로 환산하기\nb.평을 평방미터로 환산하기\nq.프로그램 종료하기");
		choise = s.next().charAt(0);
		
		if(choise=='a')
		{
			System.out.print("인치를 센치미터로 환산합니다. 인치를 입력하세요 : ");
			inchi = s.nextFloat();
			cenchi = inchi*2.5399;
			System.out.printf("%f인치는 %f센치미터 입니다",  inchi, cenchi);
		}
		
		if(choise=='b')
		{
			System.out.print("평을 평방미터로 환산합니다. 평을 입력하세요 : ");
			pyeng = s.nextFloat();
			meter = pyeng*3.3058;
			System.out.printf("%f평은 %f평방미터 입니다",  pyeng, meter);
		}
		
		if(choise=='q')
		{
			System.out.print("프로그램을 종료합니다.");
		}
				
		

	}

}
