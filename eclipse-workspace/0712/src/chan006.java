import java.util.Scanner;

public class chan006 {

	public static void main(String[] args) {
		int number;
		int count = 0;
		int hap = 0;
		int plus=0;
		int minus=0;
		float ever;
		int max = -9999;
		int min = 9999;
		int sel[];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�о���� ������ ���� : ");
		number = s.nextInt();
		
		sel = new int[number];
		
		for(count = 0; count<=number-1; count++)
		{
	     System.out.print("������ �Է��ϼ��� : ");
		 sel[count] = s.nextInt();
		 
		 if(min>sel[count])
		 {
			 min=sel[count];
		 }
		 
		 if(max<sel[count])
		 {
			 max=sel[count];
		 }
		 
		 if(0<sel[count])
		 {
			 plus++;
		 }
		 
		 else if(0>sel[count])
		 {
			 minus++;
		 }
		 
		 hap += sel[count];
		 
		 
		}
		
		ever = hap/number;
		
		System.out.printf("���� : %d, ��� : %f, ����� ���� : %d, ������ ���� : %d, �ּҰ� : %d, �ִ밪 : %d",  hap, ever, plus, minus, min, max);
		
		
		
	}
		

	}

