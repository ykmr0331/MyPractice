package J230530_AL_Honja_sec08.exam02;
//부모클래스임
public class People {
	
	public String name; // 멤버필드 public이라 접근제한없다.
	public String ssn; // 마찬가지, 참고로 주민번호임
	
	
	//이건 People의 생성자고 매개변수 2개가짐
	public People (String name, String ssn) {
		this.name = name; // 외부에서 데이터 받아서 멤버필드초기화
		this.ssn = ssn;
	}
}
