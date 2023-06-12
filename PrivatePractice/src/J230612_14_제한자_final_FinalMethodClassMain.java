
public class FinalMethodClassMain {

	public static void main(String[] args) {
		FinalMethodClassChild  fmcc1=
				new FinalMethodClassChild();
		fmcc1.method1();
		fmcc1.method2();
		
		FinalMethodClass fmcc2=
				new FinalMethodClassChild();
		fmcc2.method1();
		fmcc2.method2();
	}

}