//정적메소드 선언 시 주의할 점
package homePractice;

public class J230528_AE_Honja_278_Car {

	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String args[]) {
		J230528_AE_Honja_278_Car myCar = new J230528_AE_Honja_278_Car();
		myCar.speed = 60;
		myCar.run();
	}

}