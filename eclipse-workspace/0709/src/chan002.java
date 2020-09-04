import java.util.Scanner;

public class chan002 {

	public static void main(String[] args) {
		int i=1;
		int num;
		int outnum;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요~");
		num = s.nextInt();
		
		System.out.println("");
		
		for(i=1; i<=10; i++)
		{outnum = num*i;
		 System.out.printf("%d ", outnum);
		}

	}

}
