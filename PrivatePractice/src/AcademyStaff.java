public class AcademyStaff extends AcademyMember{

	public String depart; // 부서
	
	
	
	//생성자
	public AcademyStaff() {

	}

	public AcademyStaff(int no, String name, String depart) {
	
		this.no = no;
		this.name = name;
		this.depart = depart;
	}
//print메소드	
	
	public void staffPrint() {
		this.print();
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
