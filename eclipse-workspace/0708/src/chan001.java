import java.util.Scanner;

public class chan001 {

	public static void main(String[] args) {
		char input;
		int number;
		char word1, word2;
		char speword;
		Scanner s = new Scanner(System.in);

		System.out.print("원하는 문자를 입력하세요");
		input = s.next().charAt(0);
		
		if((int)input == 33)
		{ System.out.print("구두점기호");}
		else if((int)input == 63)
		{ System.out.print("구두점기호");}
		else if( input >= 97 &&  input <= 122){
	        System.out.println((char)(input - 32));

	      } else if( input >=65 &&  input <=90){
	        System.out.println((char)(input + 32));}
	        
	        else if(input>=48) 
	        { switch((int)input)
	        	{ 
	        	case 48:
	        		System.out.println("zero");
	        		break;
	        		
	        	case 49:
	        		System.out.println("one");
	        		break;
	        		
	        	case 50:
	        		System.out.println("two");
	        		break;
	        		
	        	case 51:
	        		System.out.println("Three");
	        		break;
	        		
	        	case 52:
	        		System.out.println("four");
	        		break;
	        		
	        	case 53:
	        		System.out.println("five");
	        		break;
	        		
	        	case 54:
	        		System.out.println("six");
	        		break;
	        		
	        	case 55:
	        		System.out.println("seven");
	        		break;
	        		
	        	case 56:
	        		System.out.println("eight");
	        		break;
	        		
	        	case 57:
	        		System.out.println("nine");
	        		break;
	        	}
	        			


	      }else{
	    	  System.out.println("기타문자입니다.");
	       }

	    }

	}


