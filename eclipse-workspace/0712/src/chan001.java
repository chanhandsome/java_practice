
public class chan001 {

	public static void main(String[] args) {
		int i = 1;
		int result = 0;
		int hap = 0;
		
		do {
			result = (2*i)^2;
			hap += result;
			
			i++;
			
		}while(hap<5000);
		
		System.out.printf("���� ���� i�� %d�̰� �׶��� ���� %d�Դϴ�.", 2*i, hap);
		
		

	}

}
