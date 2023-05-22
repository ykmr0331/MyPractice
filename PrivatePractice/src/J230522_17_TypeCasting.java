
/*
	형변환--> 숫자형데이타간에만 가능
	    - 형식 :  (데이타타입)변수 or 리터럴;
	    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
		     byte-->short-->int-->long-->float-->double
	    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
		     double-->float-->long-->int-->short-->byte     
   */

public class J230522_17_TypeCasting {

	public static void main(String[] args) {

		/*
		 * 자동형변환
		 */
		System.out.println("---------자동형변환---------------");
		int i1 = 56;
		long l1 = i1; // 우항(int형)이 더 크기가 작으므로 형변환이가능하다.
		double d1 = l1;//long보다 double이 더 크다(실수형이라)
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);
		System.out.println("----------------------------------------");

		/*
		 * 강제 형변환
		 */
		double avgd = 89.34; //변수 avgd는 더블타입이다!!!
//		int avgi =avgd; // Type mismatch: cannot convert from double to int 이런 에러나옴
		int avgi = (int) avgd; //변수 avgi는 integer타입이다!!!
		System.out.println();
		System.out.println("double avg:" + avgd);// double형이라 소수점까지 출력됌
		System.out.println("int avg:" + avgi); // inter형이라 정수만 출력됌

		char cc = '힣';
		System.out.println("char c:" + cc); // 힣 나옴
		int ci = cc; // 문자형 변수 cc('힣')는 해당 문자의 유니코드 값을 가지고 있으며, 이 값을 정수형 변수 ci(55203)에 할당할 수 있습니다.
		System.out.println("int c:" + ci); // '힣'을 int로 형변환하면 55203나옴. 유니코드얘기임
		char cc2 = (char) ci;
		System.out.println("char cc2:" + cc2);
		System.out.println("int--> char:" + (char) 44230);

		/*
		 * 연산시 형변환 - 연산항들 중 가장 큰 타입으로 모든 항이 자동형변환된다.
		 */
		int ii = 100;
		long ll = 234334;
		double dd = 3.14159;
		
		double result = ii + ll + dd; 
		System.out.println("double result:" +result);
	
		
		double dresult1 = 1.0/2;
		System.out.println("dresult1: " + dresult1);
		double dresult2 = (double)1/2;
		System.out.println("dresult1: " + dresult2);
	
	}
}
