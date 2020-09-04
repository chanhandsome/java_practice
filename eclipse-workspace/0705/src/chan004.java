import java.util.Scanner;

public class chan004 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		boolean satisfy1;
		boolean satisfy2;
		boolean satisfy3;
		boolean satisfy4;
		
		System.out.println("Á¤¼ö : ");
		num = s.nextInt();
		
		if(num>-10)
					{if(num<10)					satisfy1 = true;
					else						satisfy1 = false;}
		else		satisfy1 = false;
		
		
		if(num>=5)
			satisfy2 = true;
		else
			satisfy2 = false;
		
		
		if(num<=-5)
			satisfy3 = true;
		else
			satisfy3 = false;
		
		
		if(num>=0)
			{	if(num<40)
					satisfy4 = true;
				else
					satisfy4 = false;}
		else
			satisfy4 = false;
		
		System.out.printf("-10<x<10 : 	%s\n", satisfy1);
		System.out.printf("5>=x : 	%s\n", satisfy2);
		System.out.printf("x<=-5 : 	%s\n", satisfy3);
		System.out.printf("0<=x<40 : 	%s\n", satisfy4);
	}
}
		
		
		
		
