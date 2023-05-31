


public class J230531_AB_CalculatorMain {

	public static void main(String[] args) {
		J230531_AA_Calculator calculator = new J230531_AA_Calculator();  
		//Calculator클래스의 참조변수 calculator를 만들고, 새로운 Calculator객체를 생성
		//새 Calculator객체의 주소값이 참조변수 calculator에 저장되어있음
		
		
		//잘못된 접근임
		//이렇게 못하게 하려면 객체생성을 불가능하게 해야함
		//내부에서 생성자 호출 못하도록해야함
		System.out.println("-----------access static way---------------------");
		
		
		/*경고발생
		 * The static method static_method() from the type Static should be accessed in a static way
		 * 
		정적(static) 메서드를 정적 방식으로 접근하지 않았을 때 발생합니다.
		즉, 클래스 이름(정적메서드가 선언된)을 통해 정적 메서드를 호출해야 하는데, 
		객체를 통해 호출하거나 다른 방식으로 접근하려고 할 때 발생합니다.
		*/
		
		
		
		int result =calculator.add(23,34); 
		/* 참조변수 calculator로 Calculator객체의 add()메소드를 호출한다. add()메소드는 매개변수가 int형 2개이므로 
		50과 10을 넣는다. 그 값을 int형 변수 result에 대입한다.*/ 
		System.out.println(result);	   
		
		result =calculator.sub(23,34);
		System.out.println(result);
		
		
		result =calculator.mul(23,34);
		System.out.println(result);
		
		 result =calculator.div(45435, 34); 
		//?????calculator.div()메서드에서 반환하는 리턴값은 double이므로 변수의 타입도 double이 되어야 한다. 
		System.out.println(result);

		
		
		System.out.println("-----------access static way---------------------");
		result =J230531_AA_Calculator.add(12, 23);
		System.out.println(result);
		result =J230531_AA_Calculator.sub(12, 23);
		System.out.println(result);
		result =J230531_AA_Calculator.mul(12, 23);
		System.out.println(result);
		result =J230531_AA_Calculator.div(12, 23);
		System.out.println(result);
		
		System.out.println();
		// System은 클래스, out은 정적(static)멤버필드이자 객체?, println()은 out객체의 메소드임
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
