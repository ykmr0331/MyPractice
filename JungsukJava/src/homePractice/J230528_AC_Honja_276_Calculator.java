//정적멤버 사용
package homePractice;

public class J230528_AC_Honja_276_Calculator {
	


	
static double pi =3.14159; //static 키워드는 클래스의 멤버를 객체별로 생성하지 않고, 클래스에서 공유하는 멤버로 선언하는 데 사용된다
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}