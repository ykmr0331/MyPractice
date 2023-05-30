
public class J230530_EncapsulationMain {

	public static void main(String[] args) {
		J230530_Encapsulation encapsulation=
				new J230530_Encapsulation();
		
		/*
		 * encapsulation 객체멤버필드에 데이터대입
		 */
		
		/*
		encapsulation.memberField1=123;
		encapsulation.memberField2=true;
		encapsulation.memberField3='김';
		encapsulation.memberField4=1.3421;
		*/
		
		
		encapsulation.setMemberField1(123);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(1.3421);
		// 멤버변수는 private접근제한이라서 public메소드인 setMemberField1()으로 멤버필드 접근 후 수정
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		/*
		 * encapsulation  객체멤버필드 데이터 출력
		 */
		
		encapsulation.getMemberField1();
		encapsulation.getMemberField2();
		encapsulation.getMemberField3();
		encapsulation.getMemberField4();
		
		
		/*
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		 */
		
		int tempMemberField1 = encapsulation.getMemberField1(); 
		// 멤버필드를 반환하는 메소드를 출력
		System.out.println(tempMemberField1);
		
		System.out.println(encapsulation.getMemberField2());
		
		System.out.println(encapsulation.getMemberField3());
		
		System.out.println(encapsulation.getMemberField4());
	
		
		/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡencapsulation 객체출력ㅡㅡㅡㅡㅡㅡㅡㅡ*/
		
		encapsulation.print();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}