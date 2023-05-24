//return문
package homePractice;

public class J230524_AT_Honja_p256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Car {
	//필드
	
	int gas;
	
	//생성자
	
	//메소드
	
	void setGas(int gas) {
		this.gas = gas; //this. 객체 내부에서 해당 객체를 가리킬 때 사용함.
						// ??일반적으로 멤버필드와 메서드의 이름이 같을 때  멤버필드를 가리키기 위해 사용
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() { // ?? return 값이 없는 메소드지만 gas값이 0이라면 return문을 사용해서 강제종료되도록 설정
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
				
			} else {
				System.out.println("멈춥니다..(gas잔량: " + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}