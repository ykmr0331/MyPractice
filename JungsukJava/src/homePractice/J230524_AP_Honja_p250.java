//메서드 선언
package homePractice;

public class J230524_AP_Honja_p250 {

	public static void main(String[] args) {
		

	}

}

class Calculator {
	
	//메소드
	void powerOn() { //return값이 없으므로 메소드 이름 앖에 void를 붙인다. 리턴타입으로 void라는 것이다.
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) { //x와 y를 더한 값을 반환한다.
		int result = x + y;
		return result;			/* powerOn() 메소드 같은경우는 return값이 없으므로 
		return문을 안쓰지만 여기는 더한 값이 나와야하기 때문에 쓴다.*/
	}
	
	double divide(int x, int y) { //x에서 y를 나눈 값을 반환한다.
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
}