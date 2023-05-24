
public class J230524_04_MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("--main start--");
		/*
		 * MemberField 사용자정의타입(클래스) 객체의 주소값을 저장할 참조변수선언
		 */
		MemberField mf1;
		
		/*
		 *MemberField클래스(틀)로 객체를 생성한 후에 객체의 주소값이 참조변수mf1에 대입(#100)된다.
		 */
		mf1 = new MemberField(); 
		
		
		/*
		  mf1(#100)주소에 있는 객체의 integer타입의 멤버필드(멤버변수)memberField1 에 77값을 대입
		  mf1(#100)주소에 있는 객체의 double타입의  멤버필드(멤버변수)memberField2 에 3.2값을 대입
		  mf1(#100)주소에 있는 객체의 boolean타입의 멤버필드(멤버변수)memberField3 에 true값을 대입
		  mf1(#100)주소에 있는 객체의 char타입의    멤버필드(멤버변수)memberField4 에 'A'값을 대입
		  mf1(#100)주소에 있는 객체의 String타입의  멤버필드(멤버변수)memberField5 에 "김수한무"값을 대입
		 
		 -객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100을 사용해서 멤버필드에 데이터 대입
		 -객체의 멤버필드의 접근방법:
		 	-참조(주소)변수.멤버필드이름 = 값; 
		 	-mf1.memberFIeld1 = 77;
		 */
		
		mf1.memberField1 = 1234;
		mf1.memberField2 = 3.2;
		mf1.memberField3 = true;
		mf1.memberField4 = 'A';
		mf1.memberField5 = "김수한무";

		
		
		MemberField mf2 = new MemberField();
		
		mf2.memberField1 = 5678;
		mf2.memberField2 = 9.8;
		mf2.memberField3 = false;
		mf2.memberField4 = '가';
		mf2.memberField5 = "제임스딘";
		
		
		/*
		 mf1 객체의 int 타입 		멤버필드 memberField1의 값을 출력
		 mf1 객체의 double 타입 	멤버필드 memberField2의 값을 출력
		 mf1 객체의 boolean 타입 	멤버필드 memberField3의 값을 출력
		 mf1 객체의 char 타입		멤버필드 memberField4의 값을 출력
		 mf1 객체의 String타입		멤버필드 memberField5의 값을 출력
		 
		 -객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100를 사용해서 멤버필드의 값을 출력
		 -객체의 멤버필드 접근방법
		 1. System.out.print(mf1.memberField1);
		 2. int tempMember1 = mf1;	
		 */
		System.out.println("mf1의 주소값: "+mf1); //@~~나오는데 해시코드라는거임 나중에 ㄱㄱ
		System.out.print(mf1.memberField1 + " " +mf1.memberField2 + " "+ mf1.memberField3 + " " +mf1.memberField4 + " "+mf1.memberField5 + " ");

		
		int tempMember1 = mf1.memberField1;
		
		System.out.println(tempMember1);
		System.out.print(mf2.memberField1 + " " +mf2.memberField2 + " "+ mf2.memberField3 + " " +mf2.memberField4 + " "+mf2.memberField5 + " ");
		
	}

}
