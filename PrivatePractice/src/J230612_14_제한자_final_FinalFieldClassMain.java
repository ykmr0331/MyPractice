
public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("---------FinalFieldClass 객체1--------");
		FinalFieldClass ffc1=new FinalFieldClass(0.1);
		/*
		<< The final field FinalFieldClass.PORT_NUMBER cannot be assigned >>
		ffc1.PORT_NUMBER=99;
		ffc1.INCENTIVE_RATE=3.6;
		ffc1.PI=3.12121;
		ffc1.EARTH_RADIUS=89545;
		*/
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
		System.out.println("---------FinalFieldClass 객체2--------");
		FinalFieldClass ffc2=new FinalFieldClass(0.8);
		System.out.println(ffc2.PORT_NUMBER);
		System.out.println(ffc2.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		System.out.println(Math.PI);
		
	}

}