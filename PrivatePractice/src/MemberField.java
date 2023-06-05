
public class MemberField {
	/*
	 * 1-1. 인스턴스 멤버필드는 객체생성 시 기본값으로 자동초기화
	 */
	public int member1;// 기본값 0
	public double member2;// 기본값 0.0
	public char member3;// 기본값 0 '/u0000' 
						//\u0000은 유니코드에서 null에 해당하는 문자
	public boolean member4; //기본값 false
	public String member5;// 기본값 null
	
	/*
	 * 2-1.인스턴스 멤버필드는 선언시 초기값으로 초기화할 수 있다.
	 */
	
	public int member11 = 999;
	public double member22 = 3.1415;
	public char member33 = '힣';
	public boolean member44 = true;
	public String member55 ="금요일";
	
	/*
	 * 3-1.생성자 초기화
	 */
	public MemberField() {
		
	}
	
	public MemberField(int member1, double member2, char member3, boolean member4, String member5, int member11,
			double member22, char member33, boolean member44, String member55) {
		
		
		super(); 
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member11 = member11;
		this.member22 = member22;
		this.member33 = member33;
		this.member44 = member44;
		this.member55 = member55;
	}


	
	
}
