import java.util.Scanner;

public class chan010 {

	public static void main(String[] args) {
		int year;
		String animal[];
		
		animal = new String[12];
		animal[0] = "토끼";
		animal[1] = "용";
		animal[2] = "뱀";
		animal[3] = "말";
		animal[4] = "양";
		animal[5] = "원숭이";
		animal[6] = "닭";
		animal[7] = "개";
		animal[8] = "돼지";
		animal[9] = "쥐";
		animal[10] = "소";
		animal[11] = "호랑이";
		Scanner s = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요");
		year = s.nextInt();
		
		
		
		System.out.printf("%s의 해입니다.",  animal[(year+12)%12 +5]);
		

	}

}
