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
		
		
		
		System.out.print("���ܾ 3�� �Է»缼��");
		
		word0 = new String[3];
		{
		 word0[0] = s.nextLine();
		 word0[1] = s.nextLine();
		 word0[2] = s.nextLine();
		}
		
		//ó�� word0�� 3�� �ܾ �Է¹޴´�.
		
		word = new int [3][word0[i].length()];
		//word[3][�� ���� ����] �����Ѵ�.
		
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
