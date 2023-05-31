package J230531_AA_Honja_318_sec01_exam03;
//부모 클래스임
public class Calculator {
	
	double areaCircle(double r) {   // 메소드 생성(반지름 r을 매개변수로 두었다.)
		System.out.println("Calculator객체의 areaCircle() 실행");
		return 3.14159 * r * r; // 정밀한 계산을 위해서 3.14159를 자식클래스에서 수정할거야
	
	}
}
