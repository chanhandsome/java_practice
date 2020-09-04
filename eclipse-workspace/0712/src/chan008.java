import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
			int ISBN[];
			int input;
			int i = 0;
			int j = 0;
			int k = 0;
			int hap = 0;
			
			ISBN = new int[13];
			
			Scanner s = new Scanner(System.in);
			
			for(i=0; i<=12; i++)
			{
				input = s.nextInt();
				ISBN[i] = input;
				if(i%2==0)
					hap += ISBN[i];
				
				if(i%2==1)
					hap+= ISBN[i]*3;
			}
			
			
			if(hap%10==0) {
				System.out.print("유효한 ISBN번호가 맞습니다.");
			}
			
			else
			{
				System.out.print("아닙니당.");
			}
	}

}
