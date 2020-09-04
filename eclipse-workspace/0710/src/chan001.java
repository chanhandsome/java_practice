import java.io.FileWriter;
import java.util.Scanner;

public class chan001 {
	public static void main(String[] args) throws Exception{
			Scanner s = new Scanner(System.in);
			
			String name;
			
			System.out.print("작성할 파일명:");
			//name = s.next();
			FileWriter fw = new FileWriter("C:\\Users\\82109\\Desktop\\new\\name.txt");
			
			String str;
			
			while(!(str=s.nextLine()).contentEquals(""));
			fw.write(str + "\r\n");
			
			fw.close();
			
		}

	}

