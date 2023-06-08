import java.util.ArrayList;

/*
 객체주소변수의 타입(형)변환
   1. 상속관계에있는 클래스 들에서만 가능하다.
      ex> 자식타입객체의주소를 부모타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모타입객체의주소를 자식타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식타입객체의주소를 부모타입객체의 주소로 형변환
       - 자동으로 이루어진다(묵시적)
       	Child c = new Child();
       	Parent p = c; 
   3. 부모타입객체의주소를 자식타입객체의 주소로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child c = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */
class Parent {
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
}

class Child extends Parent {
	@Override
	public void method3() { //메서드 이름치고 컨트롤 스페이스 누르면 바로 밑에 오버라이딩해주는 기능 나옴
		System.out.println("Child.method3() --> Parent.method3()를 재정의[오버라이딩]");
	}
	
	public void method4() {
		System.out.println("Child.method4()");
	}
}

public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("--------------<Child>>---------------");
		Child c1=new Child();
		c1.method1();
		c1.method2();
		c1.method3();//Child객체의 재정의메소드 호출
		c1.method4();
		System.out.println("--------------<Child-->Parent>>---------------");
		/*
		 2. 자식타입객체의주소를 부모타입객체의 주소로 형변환
       		- 자동으로 이루어진다(묵시적)
		 */
		Parent p1 = c1; //p1은 자식 객체를 참조하는 부모 타입의 참조 변수입니다.
		if(p1==c1) {
			System.out.println(p1+" == "+ c1 +"[p1과c1의 주소가동일]");
		}
		p1.method1();
		p1.method2();
		p1.method3();//Child객체의 재정의된 메소드 호출
	  //p1.method4();  //method4()는 Child 클래스에만 존재하므로 p1에서는 직접 호출할 수 없습니다.
		
		/*p1은 원래 Child 타입인 c1을 참조하고 있습니다. 
		다만, 변수의 타입이 Parent로 선언되어 있을 뿐이지만, 객체 자체는 여전히 Child 객체입니다. 
		따라서 p1은 실제로 Child 객체를 참조하고 있습니다.*/
		
		
		
		
		/*
		 3. 부모타입객체의주소를 자식타입객체의 주소로 형변환
       		- 자동으로 이루어지지않는다.
       		- 원칙적으로는 불가능하다
       		- 부모의 탈을쓴 자식객체 는 가능하다.
		 */
		Parent p2=new Parent();
		/*
		1. compile시
		 << Type mismatch: cannot convert from Parent to Child >>
		Child c2=p2;
		
		2. runtime시 
		 << ClassCastException: Parent cannot be cast to Child >>
		Child c2=(Child)p2;
		 */
		
		Parent p3 = new Child(); // 부모의 탈을쓴 자식객체임
		System.out.println("-------Child객체를 Parent타입변수로 호출--------");
		p3.method1();
		p3.method2();
		p3.method3();
//		p3.method4(); 안되는 이유는 c3는 Child타입이라서 method4()메소드를 사용할 수 있지만 부모로 형변환한 p3는 자식객체에만 있는 method4()를 사용불가
		
		Child c3 = (Child)p3;//p3는 원래 Child객체였기 때문에 다시 Child타입으로 형변환 가능(강제형변환)
		System.out.println("-------Child객체를 Child타입변수로 호출--------");
		c3.method1();
		c3.method2();
		c3.method3();//Child 객체의재정의된메쏘드호출
		c3.method4();
		

	}

}









