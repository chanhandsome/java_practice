import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		


		char bloodtype;		
		String name;
		float tall;
		float weight;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("������: ");
		bloodtype = s.next().charAt(0);
		
		System.out.printf("\n�̸�: \n");
		name = s.next();
		
		System.out.printf("\nŰ  : ");
		tall = s.nextFloat();
				
		System.out.printf("\nü  ��: ");
		weight = s.nextFloat();
		
				
		System.out.printf("%s ���� Ű�� %f cm, ü���� %f kg, �������� %c�� �̱���!", name, tall, weight, bloodtype);
	}

}

