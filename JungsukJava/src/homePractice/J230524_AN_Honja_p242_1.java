//다른 생성자를 호출해서 중복코드 줄이기

//this()는 다른 생성자를 호출한다. 반드시 생성자의 첫줄에서 사용되어야한다.
package Honja;

public class J230524_AN_Honja_p242_1 {


}

class Car2 {
	
	//필드	
	 String company = "현대 자동차";
	 String model;
	 String color;
	 int maxSpeed;
	 
	 
	 //생성자
	 
	 Car2() {
		 
	 }
	 
	 Car2(String model) {
		 this(model, "은색", 250) ; // 다른 생성자 호출.  Car2(String model, String color, int maxSpeed) 생성자를 호출
	 }
	 
	 Car2(String model, String color) {
		 this(model, color, 250) ;  //다른 생성자 호출  .위와 같음
	 }
	 
	 Car2(String model, String color, int maxSpeed) { // 이 생성자는 모든 필드에 값을 할당하고 있습니다.
		 this.model = model;
		 this.color = color;
		 this.maxSpeed= maxSpeed;// 이 세개가 공통 실행코드. 이거 3줄 없으면 위에 this() 오류남
	 }
	
}