import java.util.Scanner;

public class chan {

	public static void main(String[] args) {
		String input;
		int num;
		
		int max[];
		int min[];
		
		int countsmall = 0;
		int countbig = 0;
		
		int j=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�ε�ȣ�� ������ �Է��ϼ��� : ");
		num = s.nextInt();
		
		char save[];
		save = new char[num];
		
		max = new int[num+1];
		min = new int[num+1];
		
		System.out.printf("�ε�ȣ�� %d�� �Է��ϼ���. �� ĭ ���� <, >�� �Է��Ͻø� �˴ϴ� : ", num);
		input = s.next();
		
		for(int i=0; i<num; i++) {
			save[i] = input.charAt(i);
		}
		
		int from[];
		from = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		while(save[j]=='<') {
			countsmall++;
			j++;
		}
		
		int imsi;
		
		for(int i=1; i<=j; i++) {
		max[0] = 9-countsmall;
		max[i] = max[i-1]+1;	
		}
						for(int k=0; k<=countsmall; k++) 
						{
				for(int l=0; l<=9; l++) 
				{									
				if(max[k]==from[l]) 
				{
				from[l] = -13;
				}
				}
						}
		
		int bigone;
		int smallone;
		
		
		for(int i=j+1; i<=num-j+1; i++) {
			if(save[i]=='<') {
				for(int k=0; k<=9; k++) {
					bigone=10;
					if(bigone==from[k]) {
						max[i] = bigone;
						bigone--;
						max[i] = -13;
					}
				}
			}
			if(save[i]=='>') {
				
				max[i] = max[i-1];
				int se = 0;
				while(max[i]!=from[se]) {
					se++;
				}
				max[i] = from[se];
				/*
				for(int k=0; k<=9; k++) {
					bigone = 10;
					if(bigone==from[k]) {
						max[i] = bigone;
						bigone--;
						max[i] = -13;*/
					}
				}
		
		
			//}
		//}
			
				for(int i=0; i<=num; i++) {
					System.out.printf("%d",  max[i]);
				}
		

	}

}
