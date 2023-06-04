package J230604_07_03_02;
//추상메소드 선언
public abstract class Animal { // 추상클래스
	public String kind; // Animal클래스의 멤버변수
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상메서드( 하위 클래스에서 이 메서드를 반드시 재정의해야 합니다. )
	
}
