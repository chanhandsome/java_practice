import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		float race;
		float waste;
		double rate;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("������Ÿ�(km, args) : ");
		race = s.nextFloat();
		
		System.out.printf(")\n�ѿ���Ҹ�(L) : ");
		waste = s.nextFloat();
		
		rate = race/waste;
		
		System.out.printf("��� ������ ����� %.4f �Դϴ�.", rate);
		
	}

}
