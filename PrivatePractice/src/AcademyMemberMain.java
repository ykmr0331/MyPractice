
public class AcademyMemberMain {

	public static void main(String[] args) {
		/**************존재하지 않은 객체 생성********************
		AcademyMember academyMember = new AcademyMember(0, "누구게");
		academyMember.print();
		**********************************************************/
		
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "SIM", "JAVA");
		AcademyStudent st3 = new AcademyStudent(3, "LIM", "OFFICE");
		
		AcademyGangsa gs1 = new AcademyGangsa(4, "BOGUS", "JAVA");
		AcademyGangsa gs2 = new AcademyGangsa(5, "JAMES", "OFFICE");
	
		AcademyStaff sf1 = new AcademyStaff(6, "LEE", "MARKETING");
		AcademyStaff sf2 = new AcademyStaff(7, "PARK", "ACCOUNTING");
		
		System.out.println("------------Student----------");
		/*******호출되면 안되는 메소드가 호출이된다....
		st1.print();
		****/
		st1.studentPrint();
		st2.studentPrint();
		st3.studentPrint();
		System.out.println("------------Gangsa----------");
		gs1.GangsaPrint();
		gs2.GangsaPrint();
		System.out.println("------------staff----------");
		sf1.staffPrint();
		sf2.staffPrint();
	
	
	
	
	}

}
