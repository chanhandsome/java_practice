import java.util.Scanner;

public class chan010 {

	public static void main(String[] args) {
		int year;
		String animal[];
		
		animal = new String[12];
		animal[0] = "�䳢";
		animal[1] = "��";
		animal[2] = "��";
		animal[3] = "��";
		animal[4] = "��";
		animal[5] = "������";
		animal[6] = "��";
		animal[7] = "��";
		animal[8] = "����";
		animal[9] = "��";
		animal[10] = "��";
		animal[11] = "ȣ����";
		Scanner s = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���");
		year = s.nextInt();
		
		
		
		System.out.printf("%s�� ���Դϴ�.",  animal[(year+12)%12 +5]);
		

	}

}
