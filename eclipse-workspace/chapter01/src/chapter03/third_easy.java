package chapter03;

import java.util.Scanner;

public class third_easy {

	public static void main(String[] args) 
 {

	float ki, mom;
	float everki, evermom;
	int i = 0, k = 0;

	
	Scanner su = new Scanner(System.in);
	
	
	do
	{
	System.out.printf("키랑 몸무게를 입력하세여 : ");
	ki = su.nextFloat();
	mom = su.nextFloat();
	i++; 
	k++;
	}	while((ki >=0);
		
	everki = ki/i;
	evermom = mom/k;
	System.out.printf("평균 키는 .2%f, 평균 몸무게는 .2%f 입니다", everki, evermom);
	
 }	
		
		

}
