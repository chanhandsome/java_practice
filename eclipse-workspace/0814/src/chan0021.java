import java.util.Scanner;

public class chan0021 {

	public static void main(String[] args) {
		int inputX, inputY;
		int saveX = 0;
		int saveY = 0;
		int imsi;
		int ans = 0;
		
		int save;
		Scanner s= new Scanner(System.in);
		
		inputX = s.nextInt();
		inputY = s.nextInt();
		
		while(inputX!=0) {
			imsi = inputX%10;
			saveX += imsi;
			saveX *= 10;
			inputX /= 10;						
		}
		saveX/=10;
		
		while(inputY!=0) {
			imsi = inputY%10;
			saveY += imsi;
			saveY *= 10;
			inputY /= 10;						
		}
		saveY/=10;
		
		save = saveX + saveY;
		
		
		while(save != 0) {
			imsi = save%10;
			ans += imsi;
			ans *= 10;
			save /= 10;
		}
		ans /= 10;
		System.out.printf("%d",  ans);
		
		

	}

}
