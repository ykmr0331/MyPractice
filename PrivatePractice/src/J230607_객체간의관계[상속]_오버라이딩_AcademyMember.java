
public class AcademyMember extends Object{

	private int no;
	private String name;

//생성자
	public AcademyMember() {
		super();
	}
	
	public AcademyMember(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	
//getter setter	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

// 메서드
	public void print() {
		System.out.print(this.no +" \t" + this.name + "\t");
	}


}