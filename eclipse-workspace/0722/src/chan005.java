
public class chan005 {

	public static void main(String[] args) {
		int pay = 500;
		int i;
		int allpay = 0;
		for(i=1; i<=30; i++)
		{
			pay += 500;
			allpay += pay;
		}
		
		System.out.printf("�� �ӱ��� ���� %d�� �Դϴ�",  allpay);

	}

}
