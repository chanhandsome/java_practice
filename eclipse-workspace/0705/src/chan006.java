import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		
		float weight, tall;
		double BMI;
		char sex;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("성별(M/F, 대문자로 하세요~): \n몸무게(kg): \n키(cm):");
		sex = s.next().charAt(0);
		weight = s.nextFloat();
		tall = s.nextFloat();
		
		
		BMI = weight/(tall*tall*0.0001);
		
		if((int)sex == 77)
			if(BMI<20)
				System.out.printf("BMI = %.1f, 남자 저체중", BMI);
			else if(20<BMI&&BMI<25)
				System.out.printf("BMI = %.1f, 남자 표준체중", BMI);
			else
				System.out.printf("BMI = %.1f, 남자 과체중", BMI);
		
				
		else if((int)sex == 70)
			if(BMI<18.5)
				System.out.printf("BMI = %.1f, 여자 저체중", BMI);
			else if(18.5<=BMI&&BMI<25)
				System.out.printf("BMI = %.1f, 여자 표준체중", BMI);
			else
				System.out.printf("BMI = %.1f, 여자 과체중",  BMI);
		
		else
			System.out.printf("난귀여워뀨루뀨뀨", args);

	}

}
//몸무게 75kg, 키 170(1.7m) : 75 / (1.7) = 26

//몸무게나누기(키제곱)