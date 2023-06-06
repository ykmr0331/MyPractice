package J230606_08_02_04;

import J230606_08_02_03.Bus;
import J230606_08_02_03.Vehicle;

//객체타입확인
public class Driver {
	public void drive(Vehicle vehicle) { //매개변수에 인터페이스 타입이 들어와야되는데
										//Bus객체와 Taxi객체는 둘다 인터페이스를 구현한 객체이기 때문에 들어올 수 있다.
		if(vehicle instanceof Bus) { //vehicle매개변수가 참조하는 객체가 Bus타입인지 조사
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
