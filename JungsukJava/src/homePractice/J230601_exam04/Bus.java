package J230601_p346_sec02.exam04;
// 자식클래스
public class Bus extends Vehicle {
	@Override
	public void run() { // 메서드 재정의 vehicle클래스에 있던 메서드임
		System.out.println("버스가 달립니다.");
	}
}
