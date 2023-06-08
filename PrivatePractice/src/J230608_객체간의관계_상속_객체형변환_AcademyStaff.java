public class AcademyStaff extends AcademyMember{

	public String depart; // 부서
	
	
	
	//생성자
	public AcademyStaff() {
		super();// 만약에 AcademyMember클래스에 기본생성자가 없어지면 AcademyStaff클래스에 기본생성자 자체를 만들 수 없다.
	}

	public AcademyStaff(int no, String name, String depart) {
		super(no, name); // AcademyMember에 있는 매개변수 2개 갖는 생성자 그거임
		//this.no = no; // 상속받은거
		//this.name= name;// 상속받은거
		this.depart = depart;
	}
//print메소드	
	@Override
	public void print() {
		super.print();
		System.out.println(this.depart);
	}
// getter setter
	

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}