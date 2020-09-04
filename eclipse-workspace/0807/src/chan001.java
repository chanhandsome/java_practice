
public class chan001 {

	public static void main(String[] args) {
		int pig = 37;
		int duck = 0;
		int leg = 0;
		
		while(leg!=102) {
			leg = pig*4 + duck*2;
			pig--;
			duck++;
		}
		
		System.out.printf("%d, %d", pig, duck);
		
		
		

	}

}
