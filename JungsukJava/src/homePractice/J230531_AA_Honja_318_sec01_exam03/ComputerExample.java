package J230531_AA_Honja_318_sec01_exam03;
//메소드 재정의 테스트
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10; // 변수 선언
		
		Calculator calculator = new Calculator(); // 부모클래스의 객체 선언
		System.out.println("원면적: " + calculator.areaCircle(r));//부모클래스의 메소드에서는  정밀한 계산이 안됌(3.14159 때문)
		System.out.println();
		
		Computer computer = new Computer(); // 자식클래스의 객체 선언
		System.out.println("원면적 :" + computer.areaCircle(r)); // 자식클래스에서 메소드 재정의함 →정밀계산 가능
	}

}
