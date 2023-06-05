/*
 * 객체간의 관계
 * Car has a no(int)
 * Car has a model(String)
 * Car has a engine
 */
public class Car {
	private int no; // 차량번호
	private String model; // 차량모델명
	// 차량 엔진객체주소
	private Engine engine;// 차량엔진객체주소를 저장할 멤버필드
	
	//생성자
	public Car() {
		
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model= model;
		this.engine = engine;
	}
	
//메서드

	public void print() { //
		System.out.print(no+ "\t"+model+"\t");
		System.out.println(this.engine.getType()+"\t" +this.engine.getCc());
							//engine은 Car클래스에서 멤버변수이자   Engine클래스의 객체다. 즉 참조변수가 들어갈 자리다. 
							//따라서 그 다음에 Engine 클래스의 getCc()메소드가 들어갈 수 있다.
		this.engine.print();
	}
	
	
	//alt + shift + s
	
	//getter,setter
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() { // 반환타입은 당연히  Engine타입
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}



}
