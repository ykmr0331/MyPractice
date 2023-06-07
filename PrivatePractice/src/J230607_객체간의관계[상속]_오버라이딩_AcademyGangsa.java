public class AcademyGangsa extends AcademyMember{

	public String subject;//과목

//생성자	
	public AcademyGangsa() {
		super();// 만약에 AcademyMember클래스에 기본생성자가 없어지면 AcademyGangsa클래스에 기본생성자 자체를 만들 수 없다.
	}

	public AcademyGangsa(int no, String name, String subject) {
		super(no, name); // AcademyMember에 있는 매개변수 2개 갖는 생성자 그거임
		//this.no = no; // 상속받은거
		//this.name= name;// 상속받은거
		this.subject = subject;
	}
	
//print메서드
		
	public void print() {
		super.print();
		System.out.println(this.subject);
	}
	
	
//getter setter


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}

