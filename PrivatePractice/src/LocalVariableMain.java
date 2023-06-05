
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(loca variable)
		 *  -메소드 블록 안에서 선언된 변수(매개변수)
		 * 멤버변수(필드)
		 *  -클래스 불록 안에 선언된 변수   
		 */
		
		/*
		 *  local 변수(기본형변수)
		 */
		int a = 9;// 참고로 변수를 초기화 안하면 사용할 수 없다.
		int b = 10;
		System.out.println("a ="  +a);
		System.out.println("b ="  +b);
		
		/*
		 * 모든 변수는 반드시 초기화여야 사용할 수 있다.
		 */
	//	int tot;
	//	System.out.println(tot);   //The local variable tot may not have been initialized  
									//로컬 변수 'tot'이 초기화되지 않았을 가능성이 있다
		
		int tot0;
		boolean condition1 =true; 
		if(condition1) {
			tot0 =0;
			System.out.println("tot = " + tot0); //여기서는 된다. 왜냐면 조건이 참이라고 정해져서
		}
		//System.out.println(tot); // 조건에 따라서 될수도 있고 안될 수도 있기 때문에 안됌
		
		int tot1;
		tot1 = 1;
		//tot = tot + 1; //  에러나는 이유는 우측의 tot가 좌측으로 대입대는 방식인데 아직 우측의 tot가 초기화되지 않아서
		System.out.println(tot1);
	
		int tot2;
		tot2 =0;
		boolean condition = true;
		if(condition) {
			tot2 =2;
			
		}
		System.out.println("tot2 =" + tot2);
		
		
		int tot3;
		tot3 =0;
		tot3 = tot3 + 3;
		System.out.println("tot3 ="+tot3);
		
		
		/*
		 * local변수(참조형변수)
		 */
		Order order = new Order();
		System.out.println(order.toString()); // 이렇게하면 객체의 멤버변수 다 반환해줌
											  //Order [no=0, title=null, date=null, price=0]
		
		/* Order클래스에 이게 정의되어있음
		 * @Override
			public String toString() {
				return "Order [no=" + no + ", title=" + title + ", date=" + date + ", price=" + price + "]";
		 */
		
		
		//  The local variable order1 may not have been initialized 지역변수가 초기화 안돼서 사용 못한다.
		Order order1; // order1은 참조변수인건 당연하고 여긴 메인메서드 안이므로 멤버변수가 아니라 지역변수다.
		order1= new Order(1, "아이패드외 3종", "2023-06-02", 56000);
		order1.print();
		
	
		/*
		<< 2.The local variable order2 may not have been initialized>>
		Order order2;
		boolean condition2=true;
		if(condition2) {
			order2 = new Order(2, "바지외4종", "2023-06-02", 23000);
		}
		order2.print();
		*/
		
		
		Order order2;
		boolean condition2=false;
		if(condition2) {
			order2=new Order(20, "TV외2종", "2023-06-02", 56000);
		}else {
			order2=new Order(21, "NOTEBOOK외1종", "2023-06-02", 34000);
		}
		order2.print();
		
		/*
		 * 참조변수 초기화시 기본값
		 *    - null(참조변수리터럴)
		 *    - 주소없다 주소값
		 */
		Order order3=null;
		if(order3==null) {
			order3=new Order(3, "시계외2종", "2023-06-02", 80000);
		}
		order3.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
