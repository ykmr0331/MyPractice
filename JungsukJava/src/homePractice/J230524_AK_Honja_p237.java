//객체 생성 후 필드값 출력
public class J230524_AK_Honja_p237 {

	public static void main(String[] args) {
		Korean k1 =new Korean("박자바", "011225-1234567");
		/* 이전 파일에 Korean클래스에 있는 생성자에서 
		 생성자의 선언부 Korean(String n, String s)는
		 2개의 매개변수 n, s를 받는다 (멤버필드 name과 ssn이다)
		
		 즉,  첫 번째 자바 파일에는 매개변수를 받는 생성자만 정의되어 있기 때문에
		 Korean 클래스에 기본 생성자를 추가하거나, 아니면  위처럼 매개변수를 입력해
		*/
		
		System.out.println("k1.name : "+ k1.name);
		System.out.println("k1.ssn : "+ k1.ssn);

		Korean k2 =new Korean("김자바", "930525-0654321");
		
		System.out.println("k2.name : "+ k2.name);
		System.out.println("k2.ssn : "+ k2.ssn);

	}

}
