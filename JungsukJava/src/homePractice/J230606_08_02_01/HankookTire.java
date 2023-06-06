package J230606_08_02_01;
//구현페이스
public class HankookTire implements Tire{	
	@Override
	public void roll() { // Tire인터페이스 구현
		System.out.println("한국 타이어가 굴러갑니다."); 
	}
}
