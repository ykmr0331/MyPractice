package J230604_07_03_02;
//추상 메소드 재정의
public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	//여기서 추상메서드를 재정의해서 오류가 안생김
	// The type Dog must implement the inherited abstract method Animal.sound()
	// Animal 추상 클래스로부터 상속받은 추상 메서드 sound()를 구현하지 않아서 발생
}
