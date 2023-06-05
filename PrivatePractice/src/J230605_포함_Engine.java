
public class Engine {
	private String type;//엔진 타입	
	private int cc; // 엔진 배기량
	
	
//생성자
	public Engine() {
		
	}
	
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
//메소드
	
	public void print() {
		System.out.println(this.type + "\t" + this.cc);
	}
	
	//getter setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	

	
}

