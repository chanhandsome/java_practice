package chapter01;

import java.util.Scanner;

public class first 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		float silsu;
		int    jarisu;
		Scanner s = new Scanner(System.in);
				
		while(true)
		{
		System.out.println("�Ǽ��� �Է��ϼ��� : ");		
		silsu = s.nextFloat();
		
		System.out.println("���ϴ� �ڸ����� �Է��ϼ���(1~3������ �����մϴ�. �ٸ� ���� �Է½� �Ǽ��� �ʱ�ȭ�մϴ�) : ");
		jarisu = s.nextInt();
		

			switch(jarisu)
				{
				case 1: 
					System.out.printf("�Էµ� ���� �� %.1f �Դϴ�. \n" , silsu);
					break;
				case 2: 
					System.out.printf("�Էµ� ���� �� %.2f �Դϴ�. \n" , silsu);
					break;
				case 3: 
					System.out.printf("�Էµ� ���� �� %.3f �Դϴ�. \n" , silsu);
					break;
				default:
				}
			
			
		 }
	}

}
