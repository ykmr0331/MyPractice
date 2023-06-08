package J230608_09_01_05;

public class OutterExample {
//바깥클래스.내부클래스  내부객체참조변수 = 바깥클래스.new 
	public static void main(String[] args) {
		Outter outter = new Outter(); //외부클래스의 객체 만들기
		Outter.Nested nested = outter.new Nested();//내부클래스의 객체 만들기
		 /*Outter 클래스 내부의 Nested 클래스의 객체를 생성합니다. 
		  * 내부 클래스의 객체를 만들 때는 외부 클래스의 객체를 통해 생성해야 하므로 outter.new를 사용합니다. 
		  * 생성된 객체는 nested 변수에 할당됩니다.*/
		
		nested.print(); //내부클래스 메서드 호출
	}

}
