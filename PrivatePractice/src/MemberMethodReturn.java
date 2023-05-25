
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 * 	-멤버필드선언시 값을 대입할 수 있다.	 
	 */
	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;
	
	/*
	 * 멤버메소드는
	 */
	
	int method1() {
		System.out.println("\t --- method1() 실행 ---");
		int result =  1 + 2;
		System.out.println("\t --- method1() 실행종료 후 실행흐름반환 ---");
		
		/*
		 * return<<호출한 클래스(객체)에게 반환할 값(변수, 리터럴, 연산의 결과)>>
		 * -호출한 곳으로 실행흐름을 반환한다.(보통 메인메서드쪽)
		 * - 호출한 곳으로 데이터도 반환한다.
		 * - 반환할 데이타가 없는 경우에는(void) return문이 생략가능하다.
		 * - 반환할 데이타가 있는 경우(int,....)에는 return문이 반드시 써야함
		 */
		return result;  /* 실행흐름의 반환과 동시에 데이터도 반환하고 싶으면 
		반환하고 싶은 변수의 타입으로 바꾸야한다.*/ 
		
	}
	
	boolean method2() {
		System.out.println("\t ----boolean method2()실행-------------");
		boolean isMarried = false;
		System.out.println("\t ----boolean method2()실행 후 boolean데이터& 실행흐름반환-------------");
		return isMarried;
	}
	
	/*
	 * 두개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메소드
	 */
	
	int add(int a, int b) {
		System.out.println("---  int add(int a, int b)--- 실행");
		int result = a + b;
		System.out.println("---  int add(int a, int b)--- 실행");
		return result;
	}
	/*
	 * 이름을 매개변수로 입력받아서 인사말을 만들어서 문자열로 반환하는 메소드
	 */
	
	String hello(String name) {
		String msg = name + "님 안녕하세요!!";
		return msg;

	}
}
