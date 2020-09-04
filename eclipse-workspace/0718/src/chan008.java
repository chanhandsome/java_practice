import java.util.Scanner;

public class chan008 {

	public static void main(String[] args) {
		float stick;
		float move;
		int eachsale;
		double B;
		double C;
		float pay;
		
		int num=0;
		
		boolean BREAK=false;
		
		Scanner s = new Scanner(System.in);
		
		do{
		System.out.print("고정 비용을 입력하세요 : ");
		
		stick = s.nextFloat();
		System.out.print("가변 비용을 입력하세요 : ");
		move = s.nextFloat();
		System.out.print("총 생산량을 입력하세요 : ");
		eachsale = s.nextInt();
	
		
		System.out.print("판매할 물건의 가격을 입력하세요 : ");
		pay = s.nextFloat();
		
		if(move>pay)
			System.out.printf("가변 비용은 판매 물건보다 비쌀수 없습니다.\n");
		
		}while(move>pay);
			
		do{	
			C = pay * (eachsale+num);		
			B = move * (eachsale+num);
				if(C>=(B+stick))
					BREAK = true;
				else if(C<B+stick)
					{
					 BREAK = false;
					 num++;
					}
		}while(BREAK==false);
	
	
		if(num==0)
			System.out.print("손익 분기점을 넘었습니다.");
		else if(num>=0)
			{
			 System.out.print("손익 분익점을 넘지 못했습니다.");
			 System.out.printf("물건의 개수를 %d개 늘리면 손익 분기점을 넘을 수 있습니다.", num);
			}
	}

}
