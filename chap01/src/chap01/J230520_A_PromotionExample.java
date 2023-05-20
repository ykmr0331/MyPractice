package chap01;



public class J230520_A_PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10; // byte 변수선언과 데이터 대입
		int intValue = byteValue; //변수 byteValue의 값을 변수 intValue에 대입
		System.out.println("intValue: " + intValue); //intValue의 값을 문자열연결연산자를 이용해서 출력
		
		char charValue = '가'; // char 변수선언과 데이터 대입
		intValue = charValue; // 변수 charValue의 값을 변수 intValue에 대입
		System.out.println("가의 유니코드: " + intValue); //intValue의 값을 문자열연결연산자를 이용해서 출력
		
		intValue = 50; //intValue의 리터럴 값을 새로 대입
		long longValue = intValue; //intValue의 리터럴값을 변수 longValue에 대입
		System.out.println("longValue:" + longValue);// 문자열연결연산자를 이용해서 출력
		
		longValue = 100; //longValue의 리터럴 값을 새로 대입
		float floatValue = longValue;//longValue의 리터럴 값을 변수 floatValue에 대입
		System.out.println("floatValue = " + floatValue); // 문자열연결연산자를 이용해서 floatValue의 값을 출력
		
		floatValue = 100.5F; //floatValue의 리터럴 값을 새로 대입
		double doubleValue = floatValue; // 변수 floatValue의 리터럴 값을 변수 doubleValue에 대입
		System.out.println("doubleValue: " + doubleValue);// 문자열연결연산자를 이용해서 doubleValue의 값을 출력

	}

}
