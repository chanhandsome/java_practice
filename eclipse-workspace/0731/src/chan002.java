
public class chan002 {

	public static void main(String[] args) {
		int num = 10000;
		int front = num + 100000;
		int back = num*10 + 1;
		
			while(back!=front*3) {
				num++;
				front = num + 100000;
				back = num*10 + 1;
			}
			
			System.out.printf("�����ϴ� 5�ڸ� ���ڴ� %d�Դϴ�.",  num);

	}

}
