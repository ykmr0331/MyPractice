package chap01;

public class J230520_F_StringConcatExample {

	public static void main(String[] args) {
		int value = 10 + 2 + 8; //int형 변수 value 선언 및 데이터 대입
		System.out.println("value = " + value); //문자열 연결 연산자를 사용해 변수 value 출력

		//문자열 결합 연산
		
		String str1 = 10 + 2 + "8"; //숫자랑 문자열을 더하면 그대로 붙기 때문에 128이 출력될것
		System.out.println("str1 :" + str1);
		
		String str2 = 10 + "2" + 8; //10 + "2" ="102"이고 "102" + 8 ="1028"이 된다.
		System.out.println("str2 :" + str2);
		
		String str3 = "10" + 2 + 8; //"10" + 2 ="102"이고 "102" + 8 ="1028"이 된다.
		System.out.println("str3 :" + str3);
		
		String str4 = "10" + (2 + 8);// 이건 "10" + 10이 되니까 "1010"이 된다.
		System.out.println("str4 :" + str4);
	}

}
