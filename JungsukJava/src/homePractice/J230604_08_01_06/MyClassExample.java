package J230604_08_01_06;

import J230604_08_01_04.Audio;
import J230604_08_01_04.Television;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)--------------");
		
		MyClass myClass1 = new MyClass();
		/*일단 MyClass클래스는 멤버필드로 RemoteControl인터페이스를 구현한 Television객체가 있고 
		이 객체(Television 객체)의 주소는  RemoteControl인터페이스 타입인 참조변수 rc 안에 저장되어있다.*/
		
		myClass1.rc.turnOn(); // "Tv를 켭니다."  이건 Television.turnOn(); 을 의미한다.
		myClass1.rc.setVolume(5);//이건 Television.setVolume(); 을 의미한다.
		
		System.out.println("2)--------------");		
		
		MyClass myClass2 = new MyClass(new Audio()); // new Audio()의 타입은  RemoteControl인터페이스의 참조타입이다.
													 //Audio객체도 RemoteControl인터페이스를 구현한 객체이므로 가능
		
		System.out.println("3)--------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA(); // MyClass클래스의 methodA()메소드는  RemoteControl인터페이스를 구현한Audio객체를 생성하고 
							//Audio객체의 메서드를 2개 반환한다.
		
		System.out.println("4)--------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
