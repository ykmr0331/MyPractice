
public class J230525_BA_Honja_265_2 {

	public static void main(String[] args) {
		Calculator2 myCalcu = new Calculator2();
		
		//정사각형의 넓이 구하기
		
		myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기

		myCalcu.areaRectangle(10, 20);
		
		System.out.println(myCalcu.areaRectangle(10));
		System.out.println(myCalcu.areaRectangle(10,20));
	}

}
