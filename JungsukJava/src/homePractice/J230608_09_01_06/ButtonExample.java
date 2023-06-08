package J230608_09_01_06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();// 그 내부인터페이스 가지고있는 Button객체를 구현함
		btn.setOnClickListener(new CallListener());
		//중첩인터페이스를 구현한 객체를 매개변수로 받아서 setOnClickListener메서드를 구현
		/*참고로 setOnClickListener메서드는 인터페이스구현객체를 매개변수로 받아서 
		 * Button객체의 멤버필드(OnClickListener인터페이스 타입)에 대입*/
		btn.touch();
		/*Button객체의 메소드 touch()는 Button객체의 인터페이스타입인 멤버변수
		 * 의 메소드 onClick()을 호출한다. 잘 모르겠으면 코드보면이해함*/ 
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
