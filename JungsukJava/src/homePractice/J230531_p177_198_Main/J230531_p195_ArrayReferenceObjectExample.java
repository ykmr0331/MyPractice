package J230531_p177_198_Main;
//객체를 참조하는 배열
public class J230531_p195_ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray =new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java"); // String객체를 new 연산자로 생성하면 무조건 새로운 String객체가 생성된다.
		
		System.out.println( strArray[0] ==strArray[1]); // true
		System.out.println( strArray[0] ==strArray[2]); // true
		System.out.println( strArray[0].equals(strArray[2])); // true
		
		
		//중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//strArray[0]가 strArray[2]는 서로 다른 객체를 참조한다.
		//strArray[0]은 문자열 "Java"를 참조하는 단순한 문자열 값이 배열의 멤버로 할당된 것입니다.
		//strArray[2]는 new 연산자를 사용하여 새로운 String 객체를 생성하고, 이 객체를 배열의 멤버로 할당한 것입니다.
	}

}
