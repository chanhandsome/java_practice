import java.util.Scanner;

public class chan003 {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		int alphabet[];
		alphabet = new int[26];
		
		str = s.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			switch((int)(str.charAt(i))) {
			case 65:
				alphabet[0]++;
				break;
			case 66:
				alphabet[1]++;
				break;
			case 67:
				alphabet[2]++;
				break;
			case 68:
				alphabet[3]++;
				break;
			case 69:
				alphabet[4]++;
				break;
			case 70:
				alphabet[5]++;
				break;
			case 71:
				alphabet[6]++;
				break;
			case 72:
				alphabet[7]++;
				break;
			case 73:
				alphabet[8]++;
				break;
			case 74:
				alphabet[9]++;
				break;
			case 75:
				alphabet[10]++;
				break;
			case 76:
				alphabet[11]++;
				break;
			case 77:
				alphabet[12]++;
				break;
			case 78:
				alphabet[13]++;
				break;
			case 79:
				alphabet[14]++;
				break;
			case 80:
				alphabet[15]++;
				break;
			case 81:
				alphabet[16]++;
				break;
			case 82:
				alphabet[17]++;
				break;
			case 83:
				alphabet[18]++;
				break;
			case 84:
				alphabet[19]++;
				break;
			case 85:
				alphabet[20]++;
				break;
			case 86:
				alphabet[21]++;
				break;
			case 87:
				alphabet[22]++;
				break;
			case 88:
				alphabet[23]++;
				break;
			case 89:
				alphabet[24]++;
				break;
			case 90:
				alphabet[25]++;
				break;
				
				
			}
		}
		
		for(int i=0; i<=25; i++) {
			System.out.printf("%c",  (char)(i+65));
			for(int j=1; j<=alphabet[i]; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}

	}

}
