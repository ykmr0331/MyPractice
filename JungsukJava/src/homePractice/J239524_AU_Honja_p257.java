//return문 2
package homePractice;

public class J239524_AU_Honja_p257 {

	public static void main(String[] args) {
		Car myCar = new Car(); //Car클래스의 참조변수 myCar를 생성해서 Car객체를 생성

		
		myCar.setGas(5); // Car의 setGas() 메소드 호출 // 멤버필드의 gas값을 5로 저장
		
		boolean gasState = myCar.isLeftGas(); // Car의 메소드(boolean메소드) isLeftGas()를 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); 
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	
	}

}
