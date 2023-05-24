//생성자에서 필드 초기화
public class J230524_AJ_Honja_p236 {

	{

	}

}

class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자
	Korean(String n, String s) {
		//생성자의 매개변수 n과 s는 객체를 생성할 때 @@필수적@@으로 전달해야 하는 멤버 필드의 값을 입력받기 위한 것입니다.

		
		name = n; /* 이걸 입력한 이유는 Korean클래스에 있는 초기화된 멤버필드의 값을 적용하기 위해서다
				 	생성자의 매개변수 n의 값을 name 필드에 할당하는 코드입니다. 이렇게 함으로써 name 필드는 객체 생성 시 전달받은 이름으로 초기화됩니다.
				 	이걸 안적으면 나중에 객체를 만들고 생성자에 매개변수를 넣어도 멤버변수의 초기값으로 나온다.
				 */
		ssn = s;

	}

}