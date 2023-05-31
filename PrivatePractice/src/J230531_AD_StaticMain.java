
public class J230531_AD_StaticMain {

	public static void main(String[] args) {
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡstatic member accessㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		
		/*
		 * 정적멤버접근
		 * Static.멤버변수이름
		 * -클래스이름.정적멤버이름
		 */
		J230531_AC_Static.static_field = 8888;// 클래스이름.static 치고 컨트롤 스페이스바 누르면 나옴  정적멤버다. 참조변수 필요없어
		System.out.println("Static.static_field");
		J230531_AC_Static.static_field = 9999;
		System.out.println("Static.static_field");
		J230531_AC_Static.static_method();// Static 클래스에 있는 정적메소드임
		
		
		
		
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡinstance member accessㅡㅡㅡㅡㅡㅡㅡ");
		
		J230531_AC_Static static1 = new J230531_AC_Static();
		System.out.println(">>> static1객체주소:" + static1); /// static1참조변수가 가진 객체 주소값이 나옴
		static1.instance_field=1111; //인스턴스 멤버 초기화
		System.out.println(static1.instance_field);// 초기화한 인스턴스멤버 출력
												//// static1 참조변수가 가진 객체 주소값이 나옴
		static1.instance_method();// Static클래스의 인스턴스메소드 호출(공통임)
		
		
		J230531_AC_Static static2 = new J230531_AC_Static();
		System.out.println(">>> static2객체주소: " + static2);// static2참조변수가 가진 객체 주소값이 나옴
		static2.instance_field = 2222;
		System.out.println(static2.instance_field);// 초기화한 인스턴스멤버 출력
													// static2 참조변수가 가진 객체 주소값이 나옴
		static2.instance_method();// Static클래스의 인스턴스메소드 호출(공통임)
	
		
		
		System.out.println("--------------객체 참조변수를 사용해서 static member access ------------------");
		System.out.println(static1.static_field);// 참조변수 static1이 가리키는 객체의 정적멤버필드를 출력
		System.out.println(static2.static_field);
		static1.static_method();
		static2.static_method();

		/*경고발생
		 * The static method static_method() from the type Static should be accessed in a static way
		 * 
		정적(static) 메서드를 정적 방식으로 접근하지 않았을 때 발생합니다.
		즉, 클래스 이름(정적메서드가 선언된)을 통해 정적 메서드를 호출해야 하는데, 
		객체를 통해 호출하거나 다른 방식으로 접근하려고 할 때 발생합니다.
		*/
		//Static.static_method(); 이렇게 접근해야함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
