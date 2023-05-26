
public class CarMemberMethodMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		/*
		 * 1.차량번호 1234 차량 12시 입차
		 */
		//입차시 데이터(번호,시간)대입메소드 호출
		car1.setIpChaData("1234",12); // 차 들어온 시간 체크하는 메서드임 차번호와 들어온 시간을 요구함


		
		/*
		 * 2.car1차량 16시 출차
		 */
		
		/*
		 * 2-1 출차시간 대입메소드 호출 메소드 실행
		 */
		car1.setOutTime(16);
		
		/*
		 * 2-2. car1객체의 주차요금계산 메소드 실행
		 */
		car1.calculateFee();
	
		/*
		 * 2-3. 주차요금의 영수증출력 메소드 실행
		 */
		car1.print();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Car car2 = new Car();
		car2.setIpChaData("7788", 17); // 차량번호 7788 입차시간 17시
		
		//3시간후
		
		car2.setOutTime(20);
		car2.calculateFee();
		car2.print();
		
		
		
		
		
		
		
		
		
		
	}

}
