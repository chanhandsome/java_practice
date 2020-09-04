import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int shit;
		int max = 0;
		int min;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("변기가 몇개인가요 : ");
		shit = s.nextInt();
		
		
		min = (shit-1)/3+1;
		if(shit%2==1)
		{
			max = shit/2 + 1;
		}
		else if(shit%2==0)
		{
			max = shit/2;
		}
		
		System.out.printf("마음 편한 변기의 최대 개수는 %d, 최소 개수는 %d입니다.",  max, min);
	}

}

/* 최소의 변기 개수는 1-1-1-2-2-2-3-3-3-4-4-4-5-5-5-6-6-6-7-7-7....순서로 증가하는것을 확인했다.
     따라서 3, 6, 9, 12, 15개의 순서로 1이 증가하여 공식을 구했다.*/