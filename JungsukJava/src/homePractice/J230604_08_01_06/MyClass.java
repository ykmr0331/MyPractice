package J230604_08_01_06;

import J230604_08_01_04.Audio;
import J230604_08_01_04.RemoteControl;
import J230604_08_01_04.Television;

public class MyClass {
	// 필드
	RemoteControl rc = new Television(); // RemoteControl 인터페이스의 참조변수에 RemoteControl인터페이스를 구현한 Television객체가 들어간다.
									//RemoteControl 인터페이스의 참조변수에 Television 클래스의 객체가 들어간다"로 설명하는 것이 더 정확
	// 생성자
	MyClass() {
	}

	MyClass(RemoteControl rc) { //RemoteControl 인터페이스를 구현한 객체의 참조변수나 인터페이스의 참조변수가 매개변수로 들어온다.
   //더 정확하게는 "RemoteControl 인터페이스를 구현한 객체나 RemoteControl 인터페이스를 구현한 클래스의 참조변수가 매개변수로 들어온다"
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	// 메소드
	void methodA() {
		RemoteControl rc = new Audio(); // RemoteControl 인터페이스의 참조변수에 RemoteControl인터페이스를 구현한 Audio객체가 들어간다
		//rc 변수는 Audio 클래스의 객체를 참조하고 있지만, 변수의 타입은 RemoteControl 인터페이스입니다. 
		rc.turnOn(); // rc는 Audio객체의 참조변수이므로 Audio클래스의 메서드를 사용
		rc.setVolume(5);

	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);

	}

}
