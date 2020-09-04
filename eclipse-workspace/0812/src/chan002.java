
public class chan002 {

	public static void main(String[] args) {
		int A[];
		int B[];
		
		int kyo[];
		
		kyo = new int[10];
		
		int m=0;
		int n=0;
		
		
		A = new int[] {2, 3, 7, 10, 11, 18, 20, 21};
		B = new int[] {3, 6, 10, 14, 17};
		
		int imsi[];
		imsi = new int[] {2, 3, 7, 10, 11, 18, 20, 21};
		
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=4; j++) {
				if(A[i]==B[j]) {
					kyo[m] = A[i];
					m++;
				}
			}
		}
		for(int j=0; j<=4; j++) {
			for(int i=0; i<=m; i++) {
				if(B[j]==kyo[i]) {
					B[j] = 0;
				}
			}
		}
		
		for(int i=0; i<=7; i++) {
			for(int j=0; j<=n; j++) {
				if(A[i]==kyo[j]) {
					imsi[i] = 0;
				}
			}
		}
		
		System.out.printf("교집합은 : ");
		for(int i=0; i<=m; i++) {
			if(kyo[i]!=0) {
			System.out.printf("%d ",  kyo[i]);}
		}
		
		System.out.printf("\n합집합은 : ");
		for(int i=0; i<=7; i++) {
			System.out.printf("%d ",  A[i]);
		}
		for(int i=0; i<=4; i++) {
			if(B[i]!=0) {System.out.printf("%d ",  B[i]);}
		}
		System.out.printf("\n차집합은 : ");
		for(int i=0; i<=7; i++) {
			if(imsi[i]!=0) {
				System.out.printf("%d ", imsi[i]);
			}
		
	
		}

	}
}

