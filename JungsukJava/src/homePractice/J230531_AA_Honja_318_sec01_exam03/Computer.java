package J230531_AA_Honja_318_sec01_exam03;

//Calculator를 상속받은 자식클래스 Computer
public class Computer extends Calculator {
	
	@Override 
	//이 주석은 하위 클래스에서 상위 클래스의 메소드를 재정의(override)할 의도로 사용됩니다!!!!!!!!!!!!!!!!!!!!
	//@Override 주석을 사용함으로써 컴파일러는 메소드가 실제로 상위 클래스의 메소드를 재정의하는지를 확인합니다
	//만약 상위 클래스에 동일한 이름과 매개변수 목록을 가진 메소드가 없거나, 
	//상위 클래스의 메소드가 public이나 protected로 표시되어 있지 않은 경우, 컴파일러는 오류를 발생시킵니다.
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
