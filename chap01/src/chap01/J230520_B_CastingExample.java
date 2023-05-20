package chap01;

public class J230520_B_CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;   //int형 변수 intValue를 생성하고 데이터를 동시에 대입
		char charValue = (char) intValue;  //변수 intValue를 문자형으로 형변환해서 그 리터럴 값을 문자형변수 charValue에 대입 
		System.out.println(charValue); //변수 charValue를 출력
		
		long longValue = 500; //long형 변수 longValue를 생성하고 데이터를 동시에 대입
		intValue = (int) longValue; //longValue를 int형으로 형변환 한다음 그 리터럴 값을 변수 intValue에 대입
		System.out.println(intValue);//변수 intValue를 출력
		
		double doubleValue = 3.14;  //double형 변수 doubleValue를 생성하고 데이터를 동시에 대입 
		intValue = (int) doubleValue; // doubleValue를 int형으로 형변환 한다음 그 리터럴 값을 변수 intValue에 대입
		System.out.println(intValue); //변수 intValue를 출력

	}

}
