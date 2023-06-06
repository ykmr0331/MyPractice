package J230606_08_02_03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 인터페이스 구현클래스를 인터페이스의 참조변수에 대입 
											//즉 구현객체를 인터페이스 타입으로 자동 타입 변환
		vehicle.run();
		//vehicle.checkFare(); Vehicle인터페이스에는 checkFare()메소드가 없기 때문에 안됌
		
		Bus bus = (Bus)vehicle; // 강제 타입변환 Bus클래스타입에서 Vehicle인터페이스 타입으로 자동변환되었던것을 다시 Bus클래스타입으로
		
		bus.run();
		bus.checkFare();
	}

}
