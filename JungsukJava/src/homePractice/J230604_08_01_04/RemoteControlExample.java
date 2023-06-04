package J230604_08_01_04;
//인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc; // 인터페이스인 RemoteControl의 참조변수 선언
		rc = new Television(); // 인터페이스 타입의 참조 변수 rc를 Television 클래스의 구현 객체로 초기화
							   //rc 변수가 Television 객체를 참조
								//rc 변수를 통해 Television 클래스의 메서드를 호출하거나 속성에 접근할 수 있음
		rc = new Audio();

	}

}
