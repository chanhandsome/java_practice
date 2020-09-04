import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) throws Exception{

		String word;
		int i;
		int readed;
		char guess;
		
		byte[] bt = new byte[1024];
		int plus = 0;
		int tries = 1;
		
		char expected;
		
		Scanner s = new Scanner(System.in);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\82109\\Desktop\\new\\words.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\82109\\Desktop\\new\\forhangman.txt");
		
		
		
		while((readed = fis.read()) != -1){
			bt[plus] = (byte) readed;
			plus++;
		}
		
		System.out.printf("%s", readed);
		
		System.out.print("문제 단어 : ");
		for(i = 0; i<=plus; i++)
		{
			System.out.print("_");
		}
		
		do {
			
			System.out.printf("\nguess %d",  tries);		
			guess = s.next().charAt(0);
					
			
			for(i=0; i<=plus; i++)
			{
				if((int)guess == bt[i]);
				{
					System.out.printf("%c", guess);
					bt[i] = (byte)guess;
				} 
				 System.out.print("_");}
			
			
		tries++;
		
			}while(tries!=10);
		
		System.out.print("햄맨 죽었습니다");

}

}