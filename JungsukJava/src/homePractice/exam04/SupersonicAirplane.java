package J230531_AB_Honja_320_sec01.exam04;
//super변수
public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; //접근제한 없고 정적멤버필드()  그리고 상수필드임
	public static final int SUPERSONIC = 2;	//  멤버필드에 static 붙으면 해당 필드는 클래스 수준의 필드가 됩니다. 
										    //이는 해당 필드가 클래스의 모든 인스턴스에 대해 공유되는 필드임을 의미합니다.
											//즉 다른 참조변수를 가진 SupersonicAirplane객체에서도 적용된다는 것
	
	public int flyMode = NORMAL; // 이건 그냥 일반 멤버필드, 인스턴스마다 개별적으로 유지되는 값
	
	@Override 
	//이 주석은 하위 클래스에서 상위 클래스의 메소드를 재정의(override)할 의도로 사용됩니다!!!!!!!!!!!!!!!!!!!!
	//@Override 주석을 사용함으로써 컴파일러는 메소드가 실제로 상위 클래스의 메소드를 재정의하는지를 확인합니다
	//만약 상위 클래스에 동일한 이름과 매개변수 목록을 가진 메소드가 없거나, 
	//상위 클래스의 메소드가 public이나 protected로 표시되어 있지 않은 경우, 컴파일러는 오류를 발생시킵니다.
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	
	
	
	
}
