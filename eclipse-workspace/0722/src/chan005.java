
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
		
		System.out.printf("총 임금의 합은 %d원 입니다",  allpay);

	}

}
