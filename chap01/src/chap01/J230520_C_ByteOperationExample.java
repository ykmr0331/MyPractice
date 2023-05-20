package chap01;

public class J230520_C_ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;// byte형 변수 result를 생성하고 리터럴데이터도 동시 대입
		System.out.println(result1); //변수 result1 출력
		
		byte x = 10; // byte형 변수 x의 생성과 리터럴 데이터 동시 생성
		byte y = 20;// byte형 변수 y의 생성과 리터럴 데이터 동시 생성
		int result2 = x + y; //byte형 변수 x와 y를 값을 더한 리터럴을 int형 변수 result2에 대입, 타입은 다르지만 int형이 값을 포함하기에 오류안남
		System.out.println(result2); //int형 변수result2를 출력
	}

}
