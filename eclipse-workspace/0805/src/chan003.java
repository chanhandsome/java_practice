
public class chan003 {

	public static void main(String[] args) {
		int rannum[][];
		int check[];
		check = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};;
		int i, j, k;
		
		rannum = new int[10][10];
		for(i=0; i<=9; i++) {
			for(j=0; j<=9; j++) {
				rannum[i][j]=(int)(Math.random()*10);
			}
		}
		

		for(k=0; k<=9; k++) {
		for(i=0; i<=9; i++) {
			for(j=0; j<=9; j++) {
				if(k==rannum[i][j]) {
					check[k]++;
				}
			}
		}

	}
		
		for(int m=0; m<=9; m++) {
			System.out.printf("%d�� %d�� ���Խ��ϴ�\n", m, check[m]);
		}

}
}
