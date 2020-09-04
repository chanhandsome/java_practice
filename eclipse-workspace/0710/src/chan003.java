import java.io.FileInputStream;
import java.io.FileOutputStream;

public class chan003 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\82109\\Desktop\\new\\name");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\82109\\Desktop\\new\\nimo");
					
				int ch;
			
				while((ch = fis.read()) != -1)
					fos.write((byte) ch);
				
				System.out.println("복사 완료");
				fis.close();
				fos.close();
				
				
	}

}
