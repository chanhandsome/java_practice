import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		int i = 0;
		int j;
		String input;
		int lengthmax = 0;
		String wordmax = "as";
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("����ܾ� �Է� : ");
	do
	{
			input = s.nextLine();
			
		
		if(lengthmax<input.length())
		{
			wordmax = input;
			lengthmax = input.length();
		}
		
	
	}while(input.length()!=0);	
		
		
		System.out.printf("���� �� �ܾ�: %s", wordmax);
		System.out.printf("�ܾ� ���� : %d",  lengthmax);
		
		

	}

}
