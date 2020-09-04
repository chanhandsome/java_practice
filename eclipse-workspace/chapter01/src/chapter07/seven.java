package chapter07;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		int base, code, tax;
		float elec, kwmoney ;
		double aftertax, taxpay;
		Scanner s = new Scanner(System.in);
		
		System.out.println("코드번호를 입력하세요(1, 2, 3) : ");
		code = s.nextInt();
		
		System.out.println("이번달 전기 사용량을 입력하시오 :");
		elec = s.nextFloat();
		
		switch(code) {
		case 1:
		{
			tax = 9;
			base = 1130;
			kwmoney = 127.8f;
			
			taxpay = 0.09 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("가정용 코드번호: %d원, 기본요금: %d원, kw당 요금: %f원, 세금 : 전체금액의 %d \n",  code, base, kwmoney , tax);
			System.out.printf("전체요금은 %f원 입니다.", aftertax);
		}
		case 2:
		{
			tax = 8;
			base = 660;
			kwmoney = 88.5f;
			
			taxpay = 0.08 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("산업용 코드번호: %d원, 기본요금: %d원, kw당 요금: %f원, 세금 : 전체금액의 %d \n",  code, base, kwmoney , tax);
			System.out.printf("전체요금은 %f원 입니다.", aftertax);
		}
		case 3:
		{
			tax = 5;
			base = 370;
			kwmoney = 52.0f;
			
			taxpay = 0.05 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("교육용 코드번호: %d원, 기본요금: %d원, kw당 요금: %f원, 세금 : 전체금액의 %d \n",  code, base, kwmoney , tax);
			System.out.printf("전체요금은 %f원 입니다.", aftertax);
		}
		default:
			System.out.println("그런거 없습니다.");
		 
		
		}
		
		

	}

}
