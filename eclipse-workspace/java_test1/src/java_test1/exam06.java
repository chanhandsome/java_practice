package java_test1;

public class exam06 {
	static int var = 100;

	public static void main(String[] args) {
		float num1 = 100, num2 = 3;
		float answer = (num1/num2);
	//----------------------------------------------------------------------------------	
		try 
		{
			System.out.println(answer);
		}
		
		catch (java.lang.ArithmeticException e) 
		{
			System.out.println("��꿡 ������ �ֽ��ϴ�");
		}
	//-------------------------------------------------	---------------------------------------
	}

}
