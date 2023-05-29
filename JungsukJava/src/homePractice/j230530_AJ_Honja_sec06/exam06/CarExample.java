package j230530_AJ_Honja_sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		
		myCar.setSpeed(-50); // setSpeed()는 매개변수로 외부로부터 speed값을 받아와서 음수이면 0으로 리턴하는 메서드다.
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) { //myCar.isStop()는 return값으로 stop을 리턴한다. 근데 멤버필드 stop은 초기화가 안되어 있으므로 기본값 false다.
			myCar.setStop(true);  // stop 값을 true로 설정하면 speed를 0으로 설정하는 메소드를 호출함
									//그리고 멤버변수 stop이 true가 되고 멤버변수 speed는 0으로 설정하는 메소드임
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
