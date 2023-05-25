
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main block start");
		MemberMethod mm1 = new MemberMethod();
		mm1.member1 =123;
		System.out.println("main stmt1");
		/*
		 * 멤버메쏘드 실행(호출)
		 * - 형식: 참조변수.메소드이름();
		 * - main실행흐름을 mm1주소에 있는 객체의 method1 이라는 이름의 메소드(실행코드블록)로 보낸다.
		 */
		
		mm1.method1(); // 이렇게 호출할 때 실행됌
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		mm1.method2();
		System.out.println("main stmt4");
		mm1.method3(3); //여기는 매개변수가 들어가야 된다. 이유는 method3()를 선언할 때 안에 매개변수 int count를 넣었기 때문
		System.out.println("main stmt5");
		mm1.method3(5);
		System.out.println("main stmt6");
		mm1.method4("안녕하세요 !!", 3);
		System.out.println("main stmt7");
		mm1.method4("오전수업 끝 식사 맛있게 하세요!!", 1);
		System.out.println("main block end");
		
		return; 
		/*
		 * <<  return  >>
		 * -모든 메소드 블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환해야한다.
		 * -실행흐름을 호출한 곳으로 반환하는 문장이 return문이다.
		 * -return문을 만나면 실행흐름이 호출한 곳으로 반환된다.
		 * -return 타입이 void인 경우에는 생략이 가능하다.
		 * -return문이 생략된 경우에는 컴파일러가 자동으로 return문을 삽입하여 준다.
		 */
	}
	


}
