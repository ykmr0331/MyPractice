package J230606_08_02_01;

public class Car {
	Tire frontLeftTire = new HankookTire(); // Car 클래스에 인터페이스 타입필드선언과 초기 구현객체대입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {//인터페이스에서 설명된 roll()메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
}


