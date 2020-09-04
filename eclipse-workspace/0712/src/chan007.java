import java.io.IOException;

public class chan007 {

	public static void main(String[] args) throws IOException {
		int present;
		char input;
		
		do
		{
			input = 121;
			
			if((int)input == 121)
			{	
				present = (int)(Math.random()*100)+1;	
				System.out.printf("%d  \ncountinue? (y/n)", present);	
			}
			input = 120;
			input = (char)System.in.read();
		}while((int)input!=110);

}
}