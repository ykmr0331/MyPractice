
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 909090;
		oc.outer_member_method();
		
		oc.new InnerClass();/* 위에 외부클래스의 객체 만들었으니까 
							외부객체의 참조변수 사용해서 내부클래스 객체 선언가능*/
		
		/*  이렇게 안함
	 	OuterClass.InnerClass ic= oc.new InnerClass();
	 	ic.inner_member_field=303030;
	 	ic.inner_member_method();
		*/
	}

}
