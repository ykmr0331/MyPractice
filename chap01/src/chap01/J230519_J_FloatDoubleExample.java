package chap01;

public class J230519_J_FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14; 에러나는 이유는 3.14뒤에 f를 붙이지 않았기 때문이다. 실수형리터럴의 기본형은 double이다.
		float var2 = 3.14f;
		double var3 = 3.14; 
		
		//정밀도 테스트
		float var4 = 0.123456789123456789f;
		double var5 = 0.123456789123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); // ???? float형은 소수점 7번째자리까지 출력됨
		System.out.println("var5: " + var5); // ???? double형은 소수점 15번째 자리까지 출력됨

		//e사용하기
		double var6 = 3e6;  //???? 3* (10^6)
		float var7 = 3e6F;  //???? 3* (10^6)
		double var8 = 2e-3; //???? 2 * (10 ^(-3))
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
	}

}
