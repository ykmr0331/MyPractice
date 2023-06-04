package J230604_07_03_01;
//추상클래스
public abstract  class Phone { // 추상클래스 선언 class 앞에 abstract를 붙인다
								/*참고로 추상클래스는 new 연산자를 이용해서 객체를 만들지 못하고
								  상속을 통해서 자식클래스만 만들 수 있다.*/
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {//외부에서 매개변수 받아서 멤버필드 owner에 대입
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
