import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int mother[];
		int son;
		int realmother = 1;
		int i = 0;
		int l = 1;
		double one;
		
		int div[];
		int divhap = 0;
		
		int changeson=1;
		int changemom;
		
		int low;
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("분모와 분자를 입력하세요 : ");
		realmother = s.nextInt();
		son = s.nextInt();
		
		mother = new int[10];
		one = son/realmother;

		div = new int[realmother];
		
		//처음 분모의 약수를 모두 div[]에 저장한다.
		for(int j=0; j<=realmother; j++)
		{
			if(realmother%j==0)
			{
				div[l-1] = realmother;
				l++;
				divhap += div[l-1];
			}
		}
		
		int hap = divhap - son;
		//분모 약수들에서 분자 만드는 방법?
		while(low>=0)
		{
			for(int k=0; k<=l; k++)
			{ 
				for(int m=k+1; m<=l; m++)
				{
					
				}
				
			}
				}
				
		
		
	//if(처음 구한 분모 약수들의 합중 분자와 같은게 없을 때)
		do {
				i++;
				changeson = son*i;
					if(changeson+1 == realmother)
					{
						changemom = realmother*i;
					}
			}while(changeson+1 == realmother);
		
		for(int d=0; d<=realmother; d++)
		{
			if(changemom%d==0)
			{
				div[l-1] = changemom;
				l++;
				divhap += div[l-1];
			}
		}

	}

}
