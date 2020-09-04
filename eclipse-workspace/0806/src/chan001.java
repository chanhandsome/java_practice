
public class chan001 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=-1; i<=1000; i++) {
			sum += i;
			if(i>0) {
			if(i%10==0) {
				System.out.printf("%d\n",  sum);
			}
		}

	}

}
}