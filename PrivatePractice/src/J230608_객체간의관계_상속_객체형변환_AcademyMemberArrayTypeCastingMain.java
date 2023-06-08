
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members = { 
				new AcademyStudent(1, "KIM", "JAVA"), 
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "MIN", "ANDROID"), 
				new AcademyGangsa(4, "OIM", "JAVA"),
				new AcademyGangsa(5, "PIM", "ANDROID"), 
				new AcademyStaff(6, "QIM", "ACCOUNTING"),
				new AcademyStaff(7, "EIM", "MARKETING") 
				};
		System.out.println("---------AcademyMember 전체출력---------");
		/*  student에는 반, staff에는 부서, gangsa는 과목이 추가로 입력됌 
			(각각의 print()메소드때문에*/
	
		for (AcademyMember academyMember : members) {
			/*
			 * AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 print메쏘드호출
			 */
			academyMember.print();
		}
		
		System.out.println();
		for (int i = 0; i < members.length; i++) {
			/*
			 * AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 print메쏘드호출
			 */
			members[i].print();
		}
		System.out.println("------------instanceof------------");
		
		/*
		 * 연산자--> instanceof
		 *    - 형태    : 참조변수 instanceof 클래스이름
		 *    - 연산결과: true or false
		 *    - ex> boolean b = members[0] instanceof AcademyStudent;
		 */
		
		AcademyMember am = new AcademyStudent(90, "김학생", "정보처리");
			//am 참조변수는 AcademyStudent객체를 참조하고 있다. 단지 타입이 AcademyMember일 뿐이다.
		if(am instanceof AcademyStudent) {
			// instanceof 연산자는 객체의 원래 타입을 확인하기 위해 사용됩니다.
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan = tempStudent.getBan();
			System.out.println("학생반:" + tempBan);
		}
		
		System.out.println("------------AcademyMember배열에 있는 객체들 중에 AcademyStudent객체들만 출력------------");
		
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) { //members는 배열객체의 참조변수다.
				members[i].print(); // AcademyStudent클래스의 print()가 출력된다.
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				System.out.println("학생반:"+tempStudent.getBan());
				
			}else if(members[i] instanceof AcademyGangsa) {
				members[i].print();// AcademyGangsa클래스의 print()가 출력된다.
				AcademyGangsa tempGangsa=(AcademyGangsa)members[i];
				System.out.println("강사과목:"+tempGangsa.getSubject());
				
			}else if(members[i] instanceof AcademyStaff) {
				members[i].print();  // AcademyStaff클래스의 print()가 출력된다.
				AcademyStaff tempStaff=(AcademyStaff)members[i];
				System.out.println("스텝부서:"+tempStaff.getDepart());
			}
		}

	}

}