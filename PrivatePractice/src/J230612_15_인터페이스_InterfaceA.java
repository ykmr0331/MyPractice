/*
 인터페이스
    1. 클래스가 가진 모든 메쏘드가 추상메쏘드임
    2. 다중상속의 효과를 냄
       (클래스는 불가능하나 인터페이스는가능하다)
   -형식
     * class keyword 대신에 interface 라는 keyword를  사용
     * 추상메쏘드앞에 abstract 를 붙히지않는다.
     ex>public interface Test{
     		public void method1();
     		public void method2();
        }
   - 사용
       1. interface를 상속(implements)받아서
       2. 추상메쏘드를 재정의(구현)한후 사용한다.
       
       ex> public class TestImpl implements Test{
       			public void method1(){}
     			public void method2(){}
          }
*/

/*
 *
 * 인터페이스 안에 정의되는 메소드는 추상메소드여아한다.
 * -Abstract methods do not specify a body
 */
public interface InterfaceA {

	
	public abstract void method1();  // 인터페이스 안에서는 추상메소드에 abstract 안붙여도 된다. 그치만 그냥 붙이자. 
	public abstract void method2();


}




























