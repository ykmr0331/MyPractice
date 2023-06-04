package J230604_07_03_01;
//실행 클래스
public class PhoneExample {
	public static void main(String[] args) {
		/*Phone phone = new Phone();  안되는 이유는 Phone클래스는 추상클래스이기 때문에 
		 * Phone의 생성자를 호출해서 객체를 생성할 수 없다.*/

		SmartPhone smartPhone = new SmartPhone("홍길동");
		/*정의되어있는 SmartPhone의 생성자
		 * 
		public SmartPhone(String owner) { 
			super(owner);
		}
		 */
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		//  이 세 메소드는 SmartPhone클래스가 추상클래스인 Phone으로부터 상속받은 메서드를 사용한것
	}

}
