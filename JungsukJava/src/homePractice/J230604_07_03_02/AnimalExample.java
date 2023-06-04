package J230604_07_03_02;

//실행 클래스
public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog객체 선언
		Cat cat = new Cat(); // Cat 객체 선언
		dog.sound(); // 객체 생성후 사용 가능 Animal클래스의 추상메서드를 재정의한 것임
		cat.sound();
		System.out.println("----");

		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); /*
							 * Dog클래스는 추상클래스인 Animal클래스를 상속받은 클래스다. 따라서 Dog클래스 타입의 객체를 Animal클래스 타입으로
							 * 자동타입변환한것이다.
							 */
		animal.sound(); // 따라서 개의 sound()메소드가 반환됌
		animal = new Cat();
		animal.sound();
		System.out.println("----");

		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//* 메소드를 호출하는 메소드인거임, 매개변수로 Animal타입의 객체가 들어오는거고
	public static void animalSound(Animal animal) { 
		/*Animal 타입의 매개변수 animal을 받으며, 
		  매개변수로 전달된 객체의 실제 타입에 따라 다른 sound() 메서드가 호출됩니다*/
		animal.sound();
	}

}
