//생성자 오버로딩  this.
package Honja;

public class J230524_AL_Honja_p239 {

	public static void main(String[] args) {

	}

}

class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;	
	int maxSpeed;
	
	//생성자
	Car() {
		
	}
	
	Car(String model) {
		this.model = model; //this는 현재 객체를 가리키는 키워드
							//즉,  this는 현재 객체에 대한 참조를 나타내며, 인스턴스 변수와 매개변수를 구분하기 위해 사용됩니다.
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color= color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color= color;
		this.maxSpeed= maxSpeed;
		
	}
	
}