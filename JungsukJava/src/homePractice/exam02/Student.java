package J230530_AL_Honja_sec08.exam02;

public class Student extends People{
	
	public int studentNo; // 멤버필드
	
	public Student(String name, String ssn, int studentNo) {
		
		// 부모클래스의 생성자(아까 매개변수 2개 포함한거)호출
		super(name, ssn); 

		// 이건 부모클래스에는 없고 Student클래스에만 있는 멤버필드
		this.studentNo = studentNo; 
		
	}
}
