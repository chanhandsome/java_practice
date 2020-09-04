import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int struc[];
		struc = new int[5];

		int i;
		boolean ask=false;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 다섯개를 입력하세용 : ");
		for(i=0; i<=4; i++)
		{
			struc[i] = s.nextInt();
		}
		
		for(i=4; i>=1; i--)
		{
			if(struc[i] != struc[i-1]+1)
				ask = false;
			else
				ask = true;
		}
		
		for(i=1; i<=4; i++)
		{
			if(struc[i] != struc[i-1]+1)
				ask = false;
			else
				ask = true;
		}
		
		if(ask == true)
			System.out.print("다섯 숫자는 연속숫자입니다.");
		
		else
			System.out.print("다섯 숫자는 연속이 아닙니다.");
		
	}

}
