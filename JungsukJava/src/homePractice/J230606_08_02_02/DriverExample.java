package J230606_08_02_02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver클래스는 Vehicle인터페이스를 매개변수로 받는 run()메서드를 가지고 있는 클래스임
		Bus bus = new Bus();// 둘다 Vehicle인터페이스를 구현한 객체임
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 자동타입변환 Vehicle vehicle = bus;
		driver.drive(taxi);// 자동타입변환 Vehicle vehicle = taxi;
	}

}
