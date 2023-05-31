package J230531_AB_Honja_320_sec01.exam04;
//super변수
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane(); // 자식클래스의 객체선언
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // 자식클래스의 상수필드(상수필드는 대문자로)
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		

	}

}
