package chapter07;

import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		int base, code, tax;
		float elec, kwmoney ;
		double aftertax, taxpay;
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ڵ��ȣ�� �Է��ϼ���(1, 2, 3) : ");
		code = s.nextInt();
		
		System.out.println("�̹��� ���� ��뷮�� �Է��Ͻÿ� :");
		elec = s.nextFloat();
		
		switch(code) {
		case 1:
		{
			tax = 9;
			base = 1130;
			kwmoney = 127.8f;
			
			taxpay = 0.09 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("������ �ڵ��ȣ: %d��, �⺻���: %d��, kw�� ���: %f��, ���� : ��ü�ݾ��� %d \n",  code, base, kwmoney , tax);
			System.out.printf("��ü����� %f�� �Դϴ�.", aftertax);
		}
		case 2:
		{
			tax = 8;
			base = 660;
			kwmoney = 88.5f;
			
			taxpay = 0.08 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("����� �ڵ��ȣ: %d��, �⺻���: %d��, kw�� ���: %f��, ���� : ��ü�ݾ��� %d \n",  code, base, kwmoney , tax);
			System.out.printf("��ü����� %f�� �Դϴ�.", aftertax);
		}
		case 3:
		{
			tax = 5;
			base = 370;
			kwmoney = 52.0f;
			
			taxpay = 0.05 * (base +  elec * kwmoney);			
			aftertax = base + (elec * kwmoney) + taxpay;
			
			System.out.printf("������ �ڵ��ȣ: %d��, �⺻���: %d��, kw�� ���: %f��, ���� : ��ü�ݾ��� %d \n",  code, base, kwmoney , tax);
			System.out.printf("��ü����� %f�� �Դϴ�.", aftertax);
		}
		default:
			System.out.println("�׷��� �����ϴ�.");
		 
		
		}
		
		

	}

}
