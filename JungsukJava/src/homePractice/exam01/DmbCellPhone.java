package J230530_AK_Honja_sec07.exam01;

public class DmbCellPhone extends CellPhone { // CellPhone 클래스를 상속받은 자식클래스 DmbCellPhone
	//필드
	int channel;

	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//둘다 부모클래스(CellPhone)로부터 상속받은 필드
		this.model = model; 
		this.color = color;
		
		this.channel = channel; // 얘는 상속받은애 아님
	}

	 	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
