//객체 생성 시 생성자 선택
package Honja;

public class J230524_AM_Honja_p240 {

	public static void main(String[] args) {
		Car car1 = new Car(); 
		// 참조변수 car1을 만들고 생성자 선언해서 Car객체를 만듦 
		System.out.println("car1.company :" + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용"); 
		// Car클래스에서 Car(String model)... 생성자가 있어
		System.out.println("car2.company :" + car2.company);
		System.out.println("car2.model:" + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강"); 
		// Car클래스에서 Car(String model,String color)... 생성자가 있어
		System.out.println("car3.company :" + car3.company);
		System.out.println("car3.model:" + car3.model);
		System.out.println("car3.color:" + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200); 
// Car클래스에서 Car(String model,String color, int maxSpeed)... 생성자가 있어
		System.out.println("car4.company :" + car4.company);
		System.out.println("car4.model:" + car4.model);
		System.out.println("car4.color:" + car4.color);
		System.out.println("car4.maxSpeed:" + car4.maxSpeed);
		System.out.println();
	}

}
