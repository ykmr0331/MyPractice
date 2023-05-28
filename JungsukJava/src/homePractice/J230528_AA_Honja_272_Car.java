package homePractice;

public class J230528_AA_Honja_272_Car {
	
	
	//필드
	String model;
	int speed;
	
	
	//생성자
	J230528_AA_Honja_272_Car(String model) {
		this.model = model;
	}
	
	//메소드
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i =10; i<50; i +=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
			
		}
	}
}
