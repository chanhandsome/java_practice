import java.util.Scanner;

public class chan005 {

	public static void main(String[] args) {
		double data[];
		int i=1;
		char flag;
		int k=3;;
		double ans=0;
		
		Scanner s = new Scanner(System.in);
		
				System.out.print("������ �Է��ϼ��� : ");

			data = new double[i+1];
			data[i-1]=s.nextDouble();
			flag = s.next().charAt(0);
			data[i]=s.nextDouble();
			
			if((int)flag==43)
			{ans = data[i-1]+data[i];}
			
			if((int)flag==42)
			{ans = data[i-1]*data[i];}
			
			if((int)flag==45)
			{ans = data[i-1]-data[i];}
			
			if((int)flag==47)
			{ans = data[i-1]/data[i];}
			
			System.out.print("���밪�� ���ұ��?(1.yes, 2.no): ");
			k=s.nextInt();
			
			if(k==1)
			{
				ans = Math.abs(ans);
				System.out.printf("%f",  ans);
			}
			
			if(k==2)
			{
				System.out.printf("%f",  ans);
			}

	}

}
