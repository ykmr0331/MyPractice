//Getter와 Setter메소드 선언

package j230530_AJ_Honja_sec06.exam06;
 
public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	//메소드
	//get이나 is가 private멤버변수 값을 반환하기 위한 메서드고
	//set 메서드는 멤버필드 값을 가공한 후 가공하기 위한 메서드다.
	
	
	
	
	
	public int getSpeed() { // 멤버필드 speed는 접근제한이 private이므로  getSpeed()메소드를 이용해서 멤버변수 speed값 반환
		return speed;
	}
	
	
	public void setSpeed(int speed) { // 매개변수 speed값을 외부에서 받아오면 음수일 경우에는 0으로 반환하도록한다.
									  //이유는 속도가 0보다 낮을수는 없기 때문이다.
		if(speed < 0) {
			this.speed = 0;
			return;
		}else { 
			this.speed = speed;
		}
	}
	
	public boolean isStop() { // 멤버필드stop은 접근제한이 private이므로 isStop()메소드를 이용해서 멤버변수 stop값 반환
		return stop;
	}
	
	public void setStop(boolean stop) { // 매개변수 stop을 외부에서 받아오고, 그 값을 멤버필드에 대입
		this.stop = stop;
		this.speed = 0;
	}
	
}
