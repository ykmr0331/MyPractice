
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		MemberField memberField = new MemberField();
		System.out.println(" 1-1. 인스턴스 멤버필드는 객체생성 시 기본값으로 자동초기화");
		System.out.println(memberField.member1);
		System.out.println(memberField.member2);
		System.out.println(memberField.member3);
		System.out.println(memberField.member4);
		System.out.println(memberField.member5);
		
		System.out.println("2-1.인스턴스 멤버필드는 선언시 초기값으로 초기화할 수 있다.");
		System.out.println(memberField.member11);
		System.out.println(memberField.member22);
		System.out.println(memberField.member33);
		System.out.println(memberField.member44);
		System.out.println(memberField.member55);
		
		System.out.println("3-1생성자 초기화");
		MemberField memberField2 = new MemberField(1, 1.1, '김', false, "문자열1", 2, 2.2, '경', true, "문자열2");
		System.out.println(memberField.member1);
		System.out.println(memberField.member2);
		System.out.println(memberField.member3);
		System.out.println(memberField.member4);
		System.out.println(memberField.member5);
		System.out.println(memberField.member11);
		System.out.println(memberField.member22);
		System.out.println(memberField.member33);
		System.out.println(memberField.member44);
		System.out.println(memberField.member55);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
