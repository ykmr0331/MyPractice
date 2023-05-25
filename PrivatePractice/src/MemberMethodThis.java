
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */

	int memberField1 = 0;
	char memberField2 = 0;
	double memberField3 = 0;
	/*
	 * 매개변수를 받아서 memberField1의 값을 대입하는 메소드
	 */


	
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
		/*
		 * this: -self참조변수 -void setMemberField1()메소드가 실행될 때 호출 주체객체의 주소값을 가진 변수 -this는
		 * 대부분 생략이 가능하다.
		 * -setMemberField1()메소드를 멤버로 가진 객체 주소
		 */

	}
	
	void setMemberField2(char memberField2) {
		this.memberField2 = memberField2;


	}
	
	
	void setMemberField3(double memberField3) {
		this.memberField3 = memberField3;
		
	}
	/*
	 *  1.객체의 멤버필드에 데이타를 대입
	 */
	
	void setMemberField(int memberField1,char memberField2,double memberField3) {
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
	}
	/*
	 * 2. 객체의 멤버필드의 내용을 출력하는 메소드
	 */
	
	void print() {
		System.out.println(this.memberField1 + "\t" +this.memberField2 + "\t" + +memberField3);
	 //여기서는 로컬변수와 겹치지 않아서 this. 생략가능
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
