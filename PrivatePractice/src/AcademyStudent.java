public class AcademyStudent extends AcademyMember {
	public String ban; //학생 속한 반

	
	//생성자
	public AcademyStudent() {
		
	}
	
	public AcademyStudent(int no , String name, String ban) {		
		this.no = no; // 상속받은거
		this.name= name;// 상속받은거
		this.ban = ban;
	}
	//print 메서드
	public void studentPrint() {
		this.print();
		/*
		 * 	public void print() {
		System.out.print(this.no +" \t" + this.name + "\t");
	}
		 */
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
