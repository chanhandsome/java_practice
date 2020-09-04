import java.io.FileInputStream;

public class chan002 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fits = new FileInputStream("C:\\Users\\82109\\Desktop\\new\\name.txt");

		int ch;
		
		while((ch = fits.read()) != -1);
		
		System.out.print((char)ch);
		
		fits.close();

	}

}
