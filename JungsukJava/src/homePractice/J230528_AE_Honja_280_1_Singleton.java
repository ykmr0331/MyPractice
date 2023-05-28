//싱글톤: 어떤 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 객체입니다
package homePractice;

public class J230528_AE_Honja_280_1_Singleton {

	private static J230528_AE_Honja_280_1_Singleton singleton = new J230528_AE_Honja_280_1_Singleton();
	// ?? Singleton 클래스의 단일 인스턴스를 생성합니다. 이 변수는 private으로 선언되었기 때문에 외부에서 직접 접근할 수
	// 없습니다.

	private J230528_AE_Honja_280_1_Singleton() {} // ?? 생성자를 private으로 선언하여 외부에서의 객체 생성을 막습니다

	static J230528_AE_Honja_280_1_Singleton getInstance() { // ?? 싱글톤 객체를 반환하는 정적 메서드입니다. 이 메서드를 통해 싱글톤 객체에 접근할 수 있습니다.
		return singleton;
	}

}