package J230606_08_02_04;


import J230606_08_02_03.Bus;
import J230606_08_02_03.Taxi;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi  = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
