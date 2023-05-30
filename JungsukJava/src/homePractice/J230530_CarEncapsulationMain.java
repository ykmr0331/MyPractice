
public class J230530_CarEncapsulationMain {

	public static void main(String[] args) {
		J230530_Car car1=new J230530_Car();
		car1.setIpChaData("1234", 12);
		
		J230530_Car car2=new J230530_Car();
		car2.setIpChaData("8890", 13);
		
		car1.setOutTime(16);
		car1.calculateFee();
		car1.print();
		System.out.println();
		car2.setOutTime(16);
		car2.calculateFee();
		car2.print();
		
		/*
		 * car1객체의 주차요금
		 */
		//int car1Fee = car1.fee;
		int car1Fee = car1.getFee();
		System.out.println("car1의 주차요금:"+car1Fee);
		
		/*
		 * car1객체의 주차요금 대입
		 */
		//car1.fee=0;
		car1.setFee(0);
		car1.print();
		

	}

}