package wrapper;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("-----------------------Boxing,UnBoxing--------------------");
		/*
		 * Boxing[기본형-->Wrapper객체]
		 */
		Character wc1=new Character('김');
		Integer wi1=new Integer(1231);
		Double wd1=new Double(3.141592);
		Boolean wb1=new Boolean(true);
		/*
		 * UnBoxing[Wrapper객체-->기본형]
		 */
		char c1 = wc1.charValue();
		int i1=wi1.intValue();
		double d1=wd1.doubleValue();
		boolean b1=wb1.booleanValue();
		System.out.println("----------AutoBoxing,AutoUnBoxing--------");
		/*
		 Auto Boxing[기본형-->Wrapper객체]
		 */
		Character wc2 = '김';
		Integer wi2=1231;
		Double wd2=3.141592;
		Boolean wb2=true;
		
		/*
		 Auto UnBoxing[Wrapper객체-->기본형]
		 */
		char c2=wc2;
		int i2=wi2;
		double d2=wd2;
		boolean b2=wb2;
		System.out.println("***************AUTO BOXING*****************");
		//AUTO BOXING은 Java에서 기본 데이터 타입(primitive type)과 해당 래퍼 클래스(wrapper class) 사이의 자동 변환을 지원하는 기능입니다.
		int a=  89;
		int b=  45;
		int c=  78;
		int d=  90;
		int e = 99;
		
		Integer ia = new Integer(a);
		Integer ib = b;
		Integer ic = c;
		Integer id = d;
		Integer ie = e;
		
		System.out.println("--------------------자동형변환------------------------");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		
		System.out.println("--------------------AUTO BOXING, 자동형변환------------------------");
		/*
		 * AUTO BOXING과 자동 형변환은 동시에 가능합니다. 
		 * AUTO BOXING은 기본 데이터 타입을 해당하는 래퍼 클래스의 객체로 자동 변환하는 것이며,
		 *  자동 형변환은 서로 다른 데이터 타입 간에 필요한 경우 자동으로 타입을 변환하는 것입니다
		 */
		Object ooa =89;  // 원래 89는 int a였음 // 이식 자체가 AUTO BOXING과 자동형변환이 한번에 일어난다는 거임
		Object oob =45;
		Object ooc =78;
		Object ood =90;
		Object ooe =99;
	
		
		System.out.println("****************Object[]**********************");
		Object[] scoreArray = new Object[5];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 90;
		scoreArray[4] = 99;
		
		for (int i = 0; i < scoreArray.length; i++) {
			//scoreArray에는 주소값이 들어가있음 (Integer Wrapper의 주소)
			
			/*
			Integer tempScore = (Integer)scoreArray[i];
			int score = tempScore.intValue();
				//Integer 객체에서 intValue()를 호출하면 해당 Integer 객체의 값에 해당하는 기본형 int 값을 반환합니다
			System.out.print(score + "");
			*/
			int score = (Integer)scoreArray[i];
			System.out.print(score + " ");
		}

		
		System.out.println("******************************xxxxx**********************************");
		System.out.println();
		Integer wi11 = new Integer(123);
		Integer wi22 = new Integer(123);
		System.out.println("주소비교(==): " +(wi11 == wi22));
		System.out.println("기본형멤버필드값 비교로 재정의됨( .equals() ): " +(wi11.equals(wi22)));
		
		System.out.println(wi11 + wi22);// 주소값끼리 더하는게 아니라 value끼리 더함
										//한마디로 java에서 자동 언박싱 기능이 있어서 그렇다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}













