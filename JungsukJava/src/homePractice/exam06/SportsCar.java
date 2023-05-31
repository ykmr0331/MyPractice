package J230531_AD_Honja_323_sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override	
//	public void stop() { System.out.println("스포츠카를 멈춤"); speed =0; }
	// 부모클래스인 Car클래스에서 stop()메서드는 final메서드로 정의했기 때문에 자식클래스에서 메소드 재정의 불가
} 
