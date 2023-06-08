
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "ANDROID");
		AcademyMember m1 = st1;
		
		AcademyMember m2 = new AcademyStudent(2, "LEE", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "JUM", "OFFICE");
		
		AcademyMember m4 = new AcademyGangsa(4, "박상사", "보안");
		AcademyMember m5 = new AcademyGangsa(5, "정상사", "빅데이타");
		
		AcademyMember m6 = new AcademyStaff(6, "박원장","원장");
		AcademyMember m7 = new AcademyStaff(7, "나대리", "교무" );
		
		/***AcademyMember에 정의되지 않은 메소드호출 불가능
	    String ban = m1.getBan(); 
	    	//안된다. AcademyMember에는 이런 메서드가 없기 때문에.. 이게 형변환 했을 때 단점이다.(자식->부모)*******/
		/***AcademyMember에 정의된 메소드 중 재정의된 메소드 호출 가능	**
		 	-AcademyMember타입에 정의된 print메서드를 호출하면
		 	-AcademyMember의 자식타입객체의 재정의된 print()메소드가 호출된다.
		 * */
		
		m1.print();  //m1타입은 AcademyMember지만 참조는 AcademyStudent객체를 참조한다.
		
		System.out.println("------------AcademyMember들 전체 출력------------");
		m1.print();//m1,2,3타입은 AcademyMember지만 참조는 AcademyStudent객체를 참조한다.
		m2.print();
		m3.print();
		m4.print();//m4,5타입은 AcademyMember지만 참조는 AcademyGangsa객체를 참조한다.
		m5.print();
		m6.print();//m6,7타입은 AcademyMember지만 참조는 AcademyStaff객체를 참조한다.
		m7.print();
	
	
	}

}
