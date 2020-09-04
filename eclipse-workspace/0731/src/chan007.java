
public class chan007 {

	public static void main(String[] args) {
		int number = 9;
		int num;
		int hap;
        int hapnum;
		
		       for(int i=10; i<=100000; i++)
		        {
		    	    number++;
		    	  	num = number;
		  			int rev=0;
		  			int haprev = 0;
		    	   
		    	   while(num!=0)
		    	   {
			            rev = rev * 10 + num % 10;
			            num /= 10;
		    	   }

		           hap = number + rev;
		           hapnum = hap;
			            
			       while(hapnum!=0)
			       {
				        haprev = haprev * 10 + hapnum % 10;
				        hapnum /= 10;   
			       }
				        
			       if(haprev==hap) 
				   {
					    	   System.out.printf("%d\n",  number);
				   }
			       
			       
		        }
			      
			    




		}
		    	   

	}


