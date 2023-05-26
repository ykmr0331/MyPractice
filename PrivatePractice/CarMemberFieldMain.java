public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램 시작
		 */
		
		/*
		 * 1.차량번호 1234 차량 12시입차
		 */
		
		Car car1;   		//차 객체의 주소값을 저장할 Car클래스타입 참조변수를 선언
							//이것도 변수선언인데 앞이 타입(사용자 정의 타입), 뒤가 식별자 // 컨트롤 누르고  Car클릭하면 Car class가 있는 곳이 나옴	
		car1 = new Car();	//Car클래스를 사용하여 차객체를 생성한 후 차 객체의 주소값이 car1참조변수에 대입 //new Car()는 정확히는 생성자임
		
//		car1 ="1234"; //car1은 4개의 변수를 가지고 있음. 따라서 밑에를 보면
		
		car1.no ="1234";//차객체(car1)의 멤버필드 no에 "1234"값을 대입. //참조변수 car1에 저장된 주소를 가진 Car객체의 멤버변수에 데이터 1234를 대입
		//"car1.no"는 "car1" 참조 변수를 통해 Car 객체의 멤버 변수인 "no"에 접근하는 구문입니다

		car1.inTime =12;//차객체(car1)의 멤버필드 inTime에 12 값을 대입.
		
		/*
		 * 2.car1객체의 16시 출차
		 */
		
		
		
		/*
		 * 2-1. car1객체의 출차시간대입
		 */
		car1.outTime =16; // //차객체(car1)의 멤버필드 outTime에 16값을 대입. 16시에 차 나갔다는것 
		
		/*
		 * 2-2. car1객체의 주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)* 1000; 
			/*차객체(car1)의 멤버필드 fee에 차객체(car1)의 outTime,inTime멤버필드를 사용해서 
			  주차요금 계산 후 대입*/ 
		
		/*
		 * 2-3. 주차요금의 영수증출력
		 */
		System.out.printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");	
		System.out.printf("%s  %s  %s  %s\n", "차량번호","입차시간","출차시간","주차요금");	
		System.out.printf("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");	
		System.out.printf("%7s %6d원 %6d시 %8d시",car1.no, car1.fee, car1.inTime, car1.outTime);
			 
		 
		
		
		
		
	}
}