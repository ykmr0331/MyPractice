package J230606_08_02_01;

public class CarExample {
	public static void main(String args[]) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();//Tire인터페이스를 구현한 KumhoTire객체를 Car객체의 frontLeftTire멤버변수에 대입
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
