package j230530_AF_Honja_sec06.exam04.package1;

public class Aa {

	//필드
	Aa a1 = new Aa(true);
	Aa a2 = new Aa(1);
	Aa a3 = new Aa("문자열");
	
	//생성자
	public Aa(boolean b) {} // public 접근 제한
	Aa(int b) {}				//default 접근 제한. 같은 패키지 내에서 사용 가능
	private Aa(String s) {}	// private 접근 제한. 클래스 안에서만 사용 가능
	
}
