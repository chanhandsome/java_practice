import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		String num;
		Scanner s = new Scanner(System.in);
		int binary[];
		int hap = 0;
		
		num = s.nextLine();
		binary = new int[num.length()+1];
		for(int i=0; i<num.length(); i++) {
			binary[i] = (2^i)*(int)num.charAt(i+1);
			hap += binary[i];
		}
		
		
		System.out.printf("%o",  hap);

	}

}
