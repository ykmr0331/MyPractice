
public class MemberMethodThisMain {

	public static void main(String[] args) {
		MemberMethodThis mmt1 = new MemberMethodThis();
		mmt1.setMemberField1(77777);
		mmt1.setMemberField2('꿈');
		mmt1.setMemberField3(3.141592);

		mmt1.setMemberField(77777, '꿈',3.141592);
		mmt1.print();
		
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		
		mmt2.setMemberField(88888, '깸', 1.141596);
		mmt2.print();
	}

}
