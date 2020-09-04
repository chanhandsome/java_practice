import java.util.Scanner;

public class chan007 {

	public static void main(String[] args) {
		int score[];
		score = new int[5];
		int max =0;
		int min =9999;
		float ever;
		int g=0;
		int hap = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("5명의 심사위원의 점수 입력 : ");
		score[0] = s.nextInt();
		score[1] = s.nextInt();
		score[2] = s.nextInt();
		score[3] = s.nextInt();
		score[4] = s.nextInt();
		
		for(int i=0; i>=5; i++)
		{
			if(score[i]>=max)
			{
				max = score[i];
			}
			if(score[i]<=min)
			{
				min = score[i];
			}
		}
		for(int j=0; j<5; j++)
		{
			if(score[j]==max)
			{
				score[j] = -19304;
			}
			if(score[j]==min)
			{
				score[j] = 190424;
			}
		}
		System.out.print("유효 점수 : ");
		for(int k=0; k<5; k++)
		{
			if(score[k]!=-19304 | score[k]!=190424)
			{
				System.out.printf("%d",  score[k]);
				g++;
				hap += score[k];
			}
		}
		ever = hap/g;
		System.out.printf("평균 : %f", ever);
		

	}

}
