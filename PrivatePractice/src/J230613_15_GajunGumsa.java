
public class GajunGumsa {
	
	private GajunOnOff[] gajuns; // 모든 가전제품은 OnOff를 구현하기 때문에 가능
								//클래스의 멤버변수인데 GajunOnOff인터페이스구현객체의 배열타입			


	public void setGajuns(GajunOnOff[] gajuns) {//매개변수는 배열타입이다.
		this.gajuns = gajuns; // 배열타입 매개변수를 GajunGumsa클래스의 멤버변수에 대입
	}
	
	public GajunOnOff[] getGajuns() {
		return gajuns; // 배열타입인 멤버변수를 리턴
	}
	
	public void gumsa() {
		if(gajuns != null) { 										// 멤버변수가 null이 아니면
			for (GajunOnOff gajunOnOff : gajuns) {
				gajunOnOff.on(); 									// 인터페이스 구현객체의 참조변수.메서드
				GajunVolume gajunVolume = (GajunVolume)gajunOnOff;	//OnOff에서 VOlume으로 타입 변경
				gajunVolume.up();//인터페이스를 구현한 gajunVolume객체의 재정의된 up메소드 호출 
				gajunVolume.down();
				gajunOnOff.off();
				System.out.println("---------검사끝 출고----------");
			}
		}else {
			System.out.println("가전제품 한개도 없다..");
		}
		/***************************************걍 만들어본거
		GajunGumsa gajunGumsa = new GajunGumsa(); // GajunGumsa의 새 객체 만듦
		//gajunGumsa.setGajuns(gajunArry);
		gajunGumsa.gumsa();
		**************************************/
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
