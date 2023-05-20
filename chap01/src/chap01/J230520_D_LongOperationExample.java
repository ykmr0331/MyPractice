package chap01;

public class J230520_D_LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10; // byte형 변수 value1을 선언과 동시에 데이터 대입
		int value2 = 100;// int형 변수 value2를 선언과 동시에 데이터 대입
		long value3 = 1000L;// long형 변수 value3를 선언과 동시에 데이터 대입, 정수형 타입의 기본은 int이기에 long형 리터럴은 뒤에 L붙여야
		long result = value1 + value2 + value3; //변수 3개 더해서 long형 변수 result에 대입
		System.out.println(result); //변수 result 출력

	}

}
