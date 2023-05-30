
public class J230530_CarConstructorMain {

	public static void main(String[] args) {
		
		
		System.out.println("**********************car1**********************");
		J230530_Car car1 = new J230530_Car();
		car1.setIpChaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();
		
		System.out.println("**********************car1**********************");
		J230530_Car car2 = new J230530_Car("8890",13);
		car2.setOutTime(16);
		car2.calculateFee();
		car2.print();
		
		System.out.println("*********오늘 주차장이용차량출력********");
		
		J230530_Car cara = new J230530_Car("1234", 1, 2, 1000);
		J230530_Car carb = new J230530_Car("3444", 12, 17, 5000);
		J230530_Car carc = new J230530_Car("3400", 6, 9, 3000);
		J230530_Car card = new J230530_Car("9087", 3, 7, 4000);
		
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		

	}

}
