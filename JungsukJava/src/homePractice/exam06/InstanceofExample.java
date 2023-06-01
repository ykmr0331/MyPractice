package J230601_p351_sec02.exam06;

public class InstanceofExample {
	
	public static void method1(Parent parent) { // 조건문 달아서 되면 하도록
		if(parent instanceof Child) {// Child타입으로 변환이 가능한지 확인
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}

	}
	
	public static void method2(Parent parent) { 
		Child child = (Child) parent; // classCastExecption이 발생할 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String args[]) {
		Parent parentA = new Child(); // Child클래스 -> Parent클래스 -> 
		method1(parentA); // Child클래스 -> Parent클래스 ->Child클래스    이거는 가능
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB); // parentB는 원래부터 Parent클래스였기에 안된다.강제타입 변환이
		method2(parentB); // 에러나겠지 강제형변환 안되니까
	}
}

	