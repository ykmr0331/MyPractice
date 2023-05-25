
public class J230525_AV_Honja_p260 {

}

class Calculator {
	int plus(int x, int y) { // 메소드 plus에 들어가는 매개변수 int x,y 있다. 정확히 어떻게 설명해야되나?
								// ??? 두 개의 정수 매개변수 x와 y를 받아들이고, 그들의 합을 반환합니다.
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과:" + result);
	}

	void println(String message) {
		System.out.println(message);
	}
}
