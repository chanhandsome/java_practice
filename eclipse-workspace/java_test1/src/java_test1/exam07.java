package java_test1;

public class exam07 {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.color = "����";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color = "�Ķ�";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "�ʷ�";
		myCar3.speed = 0;
		
		myCar1.upSpeed(50);
		System.out.println("�ڵ����� ���� " + myCar1.getColor()
		+ "�̸�, �ӵ���" + myCar1.getspeed() +"km�Դϴ�.");

		
		myCar2.upSpeed(50);
		System.out.println("�ڵ����� ���� " + myCar2.getColor()
		+ "�̸�, �ӵ���" 
		+ myCar2.getspeed() +"km�Դϴ�.");
		
		
		myCar3.upSpeed(50);
		System.out.println("�ڵ����� ���� " + myCar3.getColor()
		+ "�̸�, �ӵ���" + myCar3.getspeed() +"km�Դϴ�.");
	}

}
