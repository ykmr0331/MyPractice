package chap01;

public class J230519_F_LongExample {

	public static void main(String[] args) {
		 long var1 = 10;// 변수 선언 데이터 대입 동시
		 long var2 = 20L;
//		 long var3 = 10000000000;  ??에러나는데 이유는  10000000000은 int형식의 정수 리터럴인데 int값을 초과하므로 오류 발생
		 long var4 = 10000000000L;
		 System.out.println(var1);
		 System.out.println(var2);
		 System.out.println(var4);
	}

}
