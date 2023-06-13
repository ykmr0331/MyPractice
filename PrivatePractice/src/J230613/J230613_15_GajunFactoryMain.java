
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("-----------가전제품공장-----------");
		GajunTV tv1 = new GajunTV(); 
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();
		
		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		
		GajunSmartPhone sp1 = new GajunSmartPhone();
		GajunSmartPhone sp2 = new GajunSmartPhone();
		GajunSmartPhone sp3 = new GajunSmartPhone();
		
		GajunOnOff gajun1 = tv1;
		GajunOnOff[] gajunArray =new GajunOnOff[8];
		// 인터페이스도 배열객체는 만들 수 있다.(물론 인터페이스는 객체 못만듦)
		//안에 들어갈 구현객체는 onOff와 Volume인터페이스 둘다 구현한다.
		gajunArray[0]= tv1; 
		gajunArray[1]= tv2;
		gajunArray[2]= tv3;
		gajunArray[3]= audio1;
		gajunArray[4]= audio2;
		gajunArray[5]= sp1; 
		gajunArray[6]= sp2;
		gajunArray[7]= sp3;
		
		System.out.println("-----------가전제품검사소-----------");		
		
		/*
		 * 난 절대로 자식클래스타입을 사용안할래요
		 * 난 부모타입[GajunOnOff, GajunVolume]만 사용할래요
		 * 그래야 가전제품 검사 프로그램을 한번 만들어서 변경없이 계속사용할 수 있으니까요 
		 * 
		 */
		GajunOnOff[] receiveGajunArray = gajunArray; // 위에서 구현객체5개 가진 배열을 검사소(OnOff검사하는)에 들어갈 배열로 정리한거
		for (int i = 0; i < receiveGajunArray.length; i++) {
			System.out.println("------------검사시작------------");
			receiveGajunArray[i].on();
			GajunVolume tempGajun = (GajunVolume)receiveGajunArray[i]; // onOff타입을 volume타입으로 형변환해야함
			tempGajun.up();//volume타입으로 형변환해서 up과 down만 호출 가능
			tempGajun.down();
			
			receiveGajunArray[i].off(); // 위에서 형변환했지만 receiveGajunArray는 onOff타입임.
			System.out.println("------------검사끝 출고------------");
		}
		
		

		
		
	}

}
