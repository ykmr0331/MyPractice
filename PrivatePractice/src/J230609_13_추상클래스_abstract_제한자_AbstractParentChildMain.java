
/*
추상클래스
  1.정의: 하나이상의 추상메소드가 정의되어있는 클래스
 
     ex> public abstract class Test{
     
         	//추상(abstract)메쏘드();
         	public abstract int print(int i);
         	//구현된(concrete) 메쏘드();
         	public void test(){ }                     //{ }:바디라고한다.
         	
         	}   
         	
         	      
         	==>추상메쏘드: 메쏘드의 구현부분(바디{})이 없고 선언부(signature)만 존재하는 메쏘드
            ex> public abstract int print(int i); 
            
     -추상메쏘드가 존재하지 않으나 객체생성을 막기위해 만든 클래스      	
     	ex> public abstract class AcademyMember{} 
                     
  2. 추상클래스는 불완전한 추상메쏘드를 가지므로 객체생성
      이 불가능하다.
      Test t=new Test();(X)
      
  3. 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 
     구현(오버라이딩)하는 자식 클래스를 만들어 
     사용(자식객체생성)해야한다 
*/ 

abstract class AbstractParent {
	public void method1() {
		System.out.println("난 구상(Concrete)메소드");
	}
	public abstract void method2();
}

class AbstractChild extends AbstractParent{ // 추상메서드를 구현해야 된다. 재정의해야 된다고

	@Override
	public void method2() {
		System.out.println("AbstractChild에서 AbstractParent의  추상메서드 method2() 재정의[implement(구현)]");
		
	}


}

public class AbstractParentChildMain {

	public static void main(String[] args) {
		AbstractChild abstractChild1 = new AbstractChild();
		abstractChild1.method1();
		abstractChild1.method2();
			
		AbstractParent abstractChild2 = new  AbstractChild();
		// 추상 클래스를 상속받은 구체적인 자식 클래스의 인스턴스를 생성하고 부모 클래스의 타입으로 참조할 수 있다.
		abstractChild2.method1();
		abstractChild2.method2();
		/*abstractChild2 참조 변수의 타입은 AbstractParent 추상 클래스이지만,실제로 참조하는 객체는 AbstractChild 클래스임.
		  따라서 AbstractChild 클래스에서 상속받은 메소드들을 호출할 수 있습니다.*/
		

			

		

	}

}
