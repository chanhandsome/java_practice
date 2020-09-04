
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
			
			System.out.printf("만족하는 5자리 숫자는 %d입니다.",  num);

	}

}
