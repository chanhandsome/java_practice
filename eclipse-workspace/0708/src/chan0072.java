import java.util.Scanner;

public class chan0072 {

	public static void main(String[] args) {
		
		
		String word0[];
		
		int word[][];
		String imsi;
		
		int i = 0;
		int k = 0;
		int j = 0;
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.print("영단어를 3개 입력사세여");
		
		word0 = new String[3];
		{
		 word0[0] = s.nextLine();
		 word0[1] = s.nextLine();
		 word0[2] = s.nextLine();
		}
		
		//처음 word0에 3개 단어를 입력받는다.
		
		word = new int [3][word0[i].length()];
		//word[3][각 글자 길이] 저장한다.
		
		for(i=0; i<2; i++)
		{
			for(k=0; k<word0[i].length()-1; k++)
			{ 
				for(j=0; j<word0[i].length()-1-k; j++)
						{
			  
			  if(word0[i].charAt(j)>word0[i+1].charAt(j)) 
				{
					imsi = word0[i];
					word0[i] = word0[i+1];
					word0[i+1] = imsi;
				}
			  else if(word0[i].charAt(j)==word0[i+1].charAt(j)) 
			  {
					if(word0[i].charAt(j)>word0[i+1].charAt(j)) 
				{
					imsi = word0[i];
					word0[i] = word0[i+1];
					word0[i+1] = imsi;
				}
			
			  }
		
							}
}
		}
		System.out.printf("%s, %s, %s\n", word0[0], word0[1], word0[2]);	
	}
		
}
