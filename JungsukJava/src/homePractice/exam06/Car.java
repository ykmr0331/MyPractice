package J230531_AD_Honja_323_sec01.exam06;
//재정의할 수 없는 final 메소드
public class Car {
	
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드( 자식클래스에서 재정의 불가)
	public final void stop() {
		System.out.println("차를 멈춤");
		speed =0;
	}
}
