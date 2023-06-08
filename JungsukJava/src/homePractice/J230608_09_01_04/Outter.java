package J230608_09_01_04;
//로컬클래스: 생성자 또는 메서드 내부에서만 사용가능한 클래스
public class Outter {
	//자바7이전
	public void method1(final int arg) {
		final int localVariable = 1;//로컬변수(메서드 내에서만 사용가능)
		//arg = 100; 			//매개변수
		//localVariable = 100; //로컬변수
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	//자바 8이후 final키워드 없이 선언된 매개변수나 로컬변수를 사용해도 컴파일 에러가 발생하지 않는다. 
	//final선언을 하지 않아도 값이 수정될 수 없도록 final의 특성을 부여한다.
	public void method2( int arg) {
		 int localVariable = 1;//로컬변수(메서드 내에서만 사용가능)
		//arg = 100; 			//매개변수
		//localVariable = 100; //로컬변수
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
}
