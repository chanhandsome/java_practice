import java.io.FileOutputStream;
import java.util.Scanner;

public class chan006 {
	
	public static void main(String[] args) throws Exception{
		
		String name;
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("작성할 파일명 : ");
		name = s.next();
		
		System.out.println("(단어를 아래에 입력하세요)");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\82109\\Desktop\\new\\"+name+".txt");

		
		int ch;
		
		while((ch = System.in.read()) != 32)
			
			fos.write((byte) ch);
		
		fos.close();
		
	}

}
