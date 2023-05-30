	/* OOP 의 클래스 설계 방법 
	 *   1. 캡슐화
	 *   2. 상속성
	 *   3. 다형성(오버로딩,오바라이딩,객체형변환)
	 */

	
	/*
	 * 1. 캡슐화 [encapsulation]
	 *    -
	 *     외부클래스(객체)에서 멤버변수에 접근을 막고
	 *      멤버 메쏘드에만 접근할수있도록 클래스를 설계하는방법
	 *      
	 *    - 구현 : 멤버변수 의 접근제한자를 private 
	 *    		   멤버메소드의 접근제한자는 public 으로한다. 
	 *             public ==> 어떤 외부클래스에서든지 접근가능
	 *             private==> 어떤 외부클래스에서든지 접근불가능
	 */
public class J230530_Encapsulation {	//네개의  멤버변수 모두 private접근제한 설정됌
	private int memberField1;
	private boolean memberField2;
	private char memberField3;
	private double memberField4;
	
	///ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	// 멤버변수에 직접 접근하면 의존성이 너무 넢어진다. 하나 바꾸면 다 바꿔여되는 경우 발생, 
	// 즉 나중에 유지보수확장성이 떨어진다. 	
	//그래서 메서드를 통해서 사용하라는거임.
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	//setter 메소드(private인 멤버필드를 접근 못하므로 메소드를 통해서 접근해 멤버필드 수정)
	public void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
		
	}




	public void setMemberField2(boolean memberField2) {
		this.memberField2 = memberField2;
	}





	public void setMemberField3(char memberField3) {
		this.memberField3 = memberField3;
	}




	public void setMemberField4(double memberField4) {
		this.memberField4 = memberField4;
	}

	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	//getter 메소드(메소드를 통해 멤버필드 반환)
	public int getMemberField1() {
		return memberField1;// this.memberField1 으로 써도 됌
		
	}
	
	public boolean getMemberField2() {
		return memberField2;// this.memberField1 으로 써도 됌
		
	}
	
	public char getMemberField3() {
		return memberField3;// this.memberField1 으로 써도 됌
		
	}
	
	public double getMemberField4() {
		return memberField4;// this.memberField1 으로 써도 됌
		
	}
	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	public void print() {
		System.out.print(
				this.memberField1 + "\t" +
				this.memberField2 + "\t" +
				this.memberField3 + "\t" +
				this.memberField4);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
  