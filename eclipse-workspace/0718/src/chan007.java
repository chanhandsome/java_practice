import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		float inchi;
		double cenchi;
		float pyeng;
		double meter;
		char choise;
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("������ ���α׷��� �����ϼ���\na.��ġ�� ��ġ���ͷ� ȯ���ϱ�\nb.���� �����ͷ� ȯ���ϱ�\nq.���α׷� �����ϱ�");
		choise = s.next().charAt(0);
		
		if(choise=='a')
		{
			System.out.print("��ġ�� ��ġ���ͷ� ȯ���մϴ�. ��ġ�� �Է��ϼ��� : ");
			inchi = s.nextFloat();
			cenchi = inchi*2.5399;
			System.out.printf("%f��ġ�� %f��ġ���� �Դϴ�",  inchi, cenchi);
		}
		
		if(choise=='b')
		{
			System.out.print("���� �����ͷ� ȯ���մϴ�. ���� �Է��ϼ��� : ");
			pyeng = s.nextFloat();
			meter = pyeng*3.3058;
			System.out.printf("%f���� %f������ �Դϴ�",  pyeng, meter);
		}
		
		if(choise=='q')
		{
			System.out.print("���α׷��� �����մϴ�.");
		}
				
		

	}

}
