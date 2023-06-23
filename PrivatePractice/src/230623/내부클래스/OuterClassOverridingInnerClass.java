
public class OuterClassOverridingInnerClass {
	
	private int outer_member_field;
	public void outer_member_method() {
		System.out.println("OuterClassOverridingInnerClass.outer_member_method()");
	}
	/*************OuterClass에서 InnerClass객체생성사용*******************/
	public void outer_inner_class_use() {
		/************member inner clas[CASE1]***********************/
		ChildParentFirstConcreteClass childParentFirstConcreteClass1=new ChildParentFirstConcreteClass();
		ChildParentSecondAbstractClass childParentSecondAbstractClass1=new ChildParentSecondAbstractClass();
		ChildParentThirdInterface childParentThirdInterface1=new ChildParentThirdInterface();
		childParentFirstConcreteClass1.method();
		childParentSecondAbstractClass1.method();
		childParentThirdInterface1.method();
		/************anonymouse local inner class[CASE2]***********************/
		/*
		 * 특정클래스의 메쏘드를 재정의해야할때
		 * 1. local위치에 이름이없는 클래스정의
		 * 2. 이름이없는 객체를생성
		 */
		ParentFirstConcreteClass childParentFirstConcreteClass2=new ParentFirstConcreteClass() {
			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass를 상속받는 "
						+ "이름없는로칼내부클래스에서 재정의한 method()");
			}
		};
		childParentFirstConcreteClass2.method();
		ParentSecondAbstarctClass childParentSecondAbstractClass2=new ParentSecondAbstarctClass() {
			@Override
			public void method() {
				System.out.println("ParentSecondAbstarctClass를 상속받는 "
						+ "이름없는로칼내부클래스에서 재정의한 method()");
				
			}
		}; 
		childParentSecondAbstractClass2.method();
		
		ParentThirdInterface childParentThirdInterface2=new ParentThirdInterface() {
			@Override
			public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 "
						+ "이름없는로칼내부클래스에서 재정의한 method()");
				
			}
		};
		childParentThirdInterface2.method();
		
		
		Object objectChild=new Object() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "난 재정의한메쏘드";
			}
		};
		System.out.println(objectChild.toString());
		
	}
	public static void main(String[] args) {
		OuterClassOverridingInnerClass outerClass=new OuterClassOverridingInnerClass();
		outerClass.outer_inner_class_use();
	}
	
	/*********************** member inner class ****************************/
	public class ChildParentFirstConcreteClass extends ParentFirstConcreteClass{
		@Override
		public void method() {
			System.out.println("ParentFirstConcreteClass를 상속받는 "
					+ "ChildParentFirstConcreteClass에서 재정의한 method()");
		}
	}
	public class ChildParentSecondAbstractClass extends ParentSecondAbstarctClass{
		@Override
		public void method() {
			System.out.println("ParentSecondAbstarctClass를 상속받는 "
					+ "ChildParentSecondAbstractClass에서 재정의한 method()");
		}
		
	}
	public class ChildParentThirdInterface implements ParentThirdInterface{
		@Override
		public void method() {
				System.out.println("ParentThirdInterface를 상속(구현)받는 "
						+ "ChildParentThirdInterface에서 재정의한 method()");
		}
	}
}