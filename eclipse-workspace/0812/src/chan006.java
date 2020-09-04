import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		char ten[];
		char twel[];
		
		ten = new char[] {'갑', '을', '병', '정', '무', '기', '경', '신', '임', '계'};
		twel = new char[] {'자', '축', '인', '묘', '진', '사', '오', '미', '신', '유', '술', '해'};
		
		int fir = 6;
		int sec = 8;
		
		int input;
		int follow = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("몇 년을 기준으로 찾고 싶나요 : ");
		input = s.nextInt();
		
		for(follow = 1; follow<=input; follow++) {
			fir++;
			sec++;
			if(fir==10) {
				fir=0;
			}
			if(sec==12) {
				sec=0;
			}
		}
		
		System.out.printf("%s%s년이다", ten[fir], twel[sec]);
		
	}

}
