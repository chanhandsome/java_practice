import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		
		float weight, tall;
		double BMI;
		char sex;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("����(M/F, �빮�ڷ� �ϼ���~): \n������(kg): \nŰ(cm):");
		sex = s.next().charAt(0);
		weight = s.nextFloat();
		tall = s.nextFloat();
		
		
		BMI = weight/(tall*tall*0.0001);
		
		if((int)sex == 77)
			if(BMI<20)
				System.out.printf("BMI = %.1f, ���� ��ü��", BMI);
			else if(20<BMI&&BMI<25)
				System.out.printf("BMI = %.1f, ���� ǥ��ü��", BMI);
			else
				System.out.printf("BMI = %.1f, ���� ��ü��", BMI);
		
				
		else if((int)sex == 70)
			if(BMI<18.5)
				System.out.printf("BMI = %.1f, ���� ��ü��", BMI);
			else if(18.5<=BMI&&BMI<25)
				System.out.printf("BMI = %.1f, ���� ǥ��ü��", BMI);
			else
				System.out.printf("BMI = %.1f, ���� ��ü��",  BMI);
		
		else
			System.out.printf("���Ϳ��������", args);

	}

}
//������ 75kg, Ű 170(1.7m) : 75 / (1.7) = 26

//�����Գ�����(Ű����)