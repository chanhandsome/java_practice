
public class chan002 {

	public static void main(String[] args) {
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		
		
		int res;
		int temp;
		
		for(A=0; A<=10; A++)
		{
		 for(B=0; B<=10; B++)
		 {
		  for(C=0; C<=10; C++)
		  {
		    for(D=0; D<=10; D++)
		    {
		    	res = (A * 100 + B * 10 + C) + (C * 100 + A * 10 + C);
		    	temp = B * 100 + D * 10 + D;
		    	if (res == temp)
		    	{ System.out.printf("A = %d,  B = %d, C = %d, D = %d \n", A,B,C,D);}
		     }
		      
		     
		    }
		}
		
	 }	
}
}


