
public class Parent {
	private int member1;
	private int member2;

	
	public Parent() {
		/*
		 *-클래스의 생성자 첫번째 라인에서는 부모클래스의 생성자가 반드시 호출되어야한다.
		 *-부모클래스의 생성자 호출을 생략할 경우에는 부모클래스의 기본생성자가 자동호출된다.
		 */
		super(); //Object의 기본생성자
		System.out.println("1.Object()기본생성자");
		System.out.println("2.Parent()기본생성자");
	}
	
	
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("1.Object()기본생성자");
		System.out.println("2.Parent(int member1, int member2)생성자");
	}



	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
		
	}
	
	public void print() {
		System.out.print(this.member1+"\t"+this.member2+"\t");
	}
}