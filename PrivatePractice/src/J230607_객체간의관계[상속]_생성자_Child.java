
public class Child extends Parent{//Child를 호출하는 순간 Object까지 3개의 템플릿이 올라옴
	private int member3;

	
	public Child() {
		/*
		 *-클래스의 생성자 첫번째 라인에서는 부모클래스의 생성자가 반드시 호출되어야한다.
		 *-부모클래스의 생성자 호출을 생략할 경우에는 부모클래스의 기본생성자가 자동호출된다.
		 */
		super(); // Parent의 기본생성자임
		System.out.println("Child() 기본생성자");
	}
	
	
	

	public Child(int member1, int member2,int member3) {//여기서 member1과 member2는 생략 못함!!!
		//super(member1, member2)를 호출하기 위해서는 member1과 member2를 반드시 전달해야 합니다
		
		/*
		 *-클래스의 생성자 첫번째 라인에서는 부모클래스의 생성자가 반드시 호출되어야한다.
		 *-부모클래스의 생성자 호출을 생략할 경우에는 부모클래스의 기본생성자가 자동호출된다.
		 *-매개변수를 가진 부모생성자를 호출할 수 있다.(명시적으로 호출코드를 기술하여야한다.)
		 */
		
		super(member1, member2);
		//이게 되는이유는 부모 클래스의 생성자 호출 시에 인자를 전달하는 문법이 정의되어 있기 때문입니다
		
		/*
		 * Child클래스에 매개변수 2개를 갖는 생성자가 있으면 this(member1, member2)를 써서 해결할 수 있음
		 * 그냥 getter setter써라...	
		 */
		
		/* 캡슐화하면 이게 안돼(이유는 member1과 member2는 Child클래스안의 private멤버변수라서)
		 * this.member1 = member1;
		 * this.member2 = member2;
		 */
		
		this.member3 = member3;
		
		System.out.println("3,Child(int member1, int member2, int member3)생성자");
	}




	public void method3() {
		System.out.println("Child.method3()");
	}
	
	public void print() {
		super.print();
		System.out.print(member3);
		
	}
}