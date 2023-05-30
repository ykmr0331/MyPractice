
public class J230530_PrintOverLoadingMain {

	public static void main(String[] args) {
		J230530_Print p = new J230530_Print();
		p.print(1);
		p.print("김");
		p.print('꿈');
		p.print(23.45);
		p.print(true);
		
		p.print(1);
		p.print(1,2);
		p.print(1,2,3);
	}

}
