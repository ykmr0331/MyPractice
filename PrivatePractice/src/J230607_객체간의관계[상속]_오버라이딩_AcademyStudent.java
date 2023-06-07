public class AcademyStudent extends AcademyMember {
	public String ban; //학생 속한 반

	
	//생성자
	public AcademyStudent() {
		super();// 만약에 AcademyMember클래스에 기본생성자가 없어지면 AcademyStudent클래스에 기본생성자 자체를 만들 수 없다.
	}
	
	public AcademyStudent(int no , String name, String ban) {		
		super(no, name); // AcademyMember에 있는 매개변수 2개 갖는 생성자 그거임
		//this.no = no; // 상속받은거
		//this.name= name;// 상속받은거
		this.ban = ban;
	}
	
	//studentPrint 메서드
	public void print() {
		super.print();//부모의 print메소드 내용이 100줄이 된다고 생각해보면 이게 나음
		System.out.println(this.ban);
	}
	
	
	//getter setter
	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}



	

	
}
