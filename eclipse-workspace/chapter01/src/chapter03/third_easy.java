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
	System.out.printf("Ű�� �����Ը� �Է��ϼ��� : ");
	ki = su.nextFloat();
	mom = su.nextFloat();
	i++; 
	k++;
	}	while((ki >=0);
		
	everki = ki/i;
	evermom = mom/k;
	System.out.printf("��� Ű�� .2%f, ��� �����Դ� .2%f �Դϴ�", everki, evermom);
	
 }	
		
		

}
