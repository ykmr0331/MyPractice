package J230530_AK_Honja_sec07.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		// DmbCellPhone클래스에서 매개변수 3개를 받는 생성자가 있다. 
		
		//CellPhone 클래스로부터 상속받은 필드 (CellPhone 클래스는 부모임)
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
	
		//DmbCellPhone 클래스의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn(); 
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone클래스의 메소드 호출(이것들은 상속받은게 아니다!!)
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	
	}

}
