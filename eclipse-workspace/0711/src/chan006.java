import java.io.FileOutputStream;
import java.util.Scanner;

public class chan006 {
	
	public static void main(String[] args) throws Exception{
		
		String name;
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("�ۼ��� ���ϸ� : ");
		name = s.next();
		
		System.out.println("(�ܾ �Ʒ��� �Է��ϼ���)");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\82109\\Desktop\\new\\"+name+".txt");

		
		int ch;
		
		while((ch = System.in.read()) != 32)
			
			fos.write((byte) ch);
		
		fos.close();
		
	}

}
