import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		


		char bloodtype;		
		String name;
		float tall;
		float weight;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("혈액형: ");
		bloodtype = s.next().charAt(0);
		
		System.out.printf("\n이름: \n");
		name = s.next();
		
		System.out.printf("\n키  : ");
		tall = s.nextFloat();
				
		System.out.printf("\n체  중: ");
		weight = s.nextFloat();
		
				
		System.out.printf("%s 씨의 키는 %f cm, 체중은 %f kg, 혈액형은 %c형 이군요!", name, tall, weight, bloodtype);
	}

}

