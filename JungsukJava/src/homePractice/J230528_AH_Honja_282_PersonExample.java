package homePractice;

public class J230528_AH_Honja_282_PersonExample {




	public static void main(String[] args) {
		J230528_AG_Honja_281_Person p1 = new J230528_AG_Honja_281_Person("123456-1234567", "홍길동");
		// Person객체 선언 , 클래스에서 생성자 매개변수 2개로 주민등록번호와 이름을 넣었으므로 여기서 대입
		
		System.out.println(p1.nation); //p1 참조변수가 가지고있는 주소를 가진 객체의 멤버필드 nation을 출력
		System.out.println(p1.ssn);
		System.out.println(p1.name);

		//p1.nation = "usa";  // nation멤버필드는 애초에 final로 "korea"로 선언되었기 때문에 변경 불가
		//o1.ssn = "654321-7654321"   //ssn은 final필드고 클래스에서 선언만하고 초기화되지는 않았지만 
									  //객체를 생성할 때 매개변수로 초기화 했기 때문에  변경 불가   
		p1.name = "홍삼원";
		
	}

}
