package chap01;

public class J230520_E_OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10; // byte형 변수 byteValue1을 생성하고 리터럴데이터 동시 대입
		byte byteValue2 = 20; // byte형 변수 byteValue2을 생성하고 리터럴데이터 동시 대입
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;// int형은 byte형의 범위를 포함하므로 가능함
		System.out.println(intValue1); //intValue1변수를 출력
		
		char charValue1 = 'A'; //char형 charValue1을 선언 및 데이터 대입
		char charValue2 = 1;   //char형 charValue2을 선언 및 데이터 대입
		//char charValue3 = charValue1 + charValue2; // char형 변수를 더하면 정수형 기본데이터인 int형으로 변환돼서안되는거임
		int intValue2 = charValue1 + charValue2;//이건 되겠지 
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("유니코드 =" + intValue2);//charValue1과 charValue2를 더하면 65 + 1이기에 
													//?? 문자를 숫자로 변환할 때 'A'는 65로 된다.
		System.out.println("출력문자 =" + (char)intValue2);
		
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x/ y;
		System.out.println(result);
	}

}
