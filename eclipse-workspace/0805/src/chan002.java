import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		String str;
		int check = 0;
		int num2;
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���. �� ���ڰ� N�ڸ� ������ �� 1~N�� ���� 1���� ������ Yes�� ��µǰ� �ƴϸ� No�� ��µ˴ϴ�. :");
		str = s.nextLine();
		
		for(int j=1; j<=str.length(); j++) {
			num2 = j;
			for(int k=0; k<=str.length()-1; k++) {
				if(num2+48==str.charAt(k)) {
					check++;
					num2 = 0;
				}
			}

	}
		if(check==str.length()) {
			System.out.print("Yes");
		}
		else {
			System.out.printf("No");
		}

}
}
