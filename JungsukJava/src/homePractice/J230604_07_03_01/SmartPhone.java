package J230604_07_03_01;
//실체 클래스
public class SmartPhone extends Phone { // 추상클래스인 Phone을 상속했다.
	//생성자
	public SmartPhone(String owner) { 
		super(owner);
	}
		/* super(); 안쓰면 아래 오류 발생
			Implicit super constructor Phone() is undefined. Must explicitly invoke another constructor
			부모 클래스인 Phone의 기본 생성자(Phone()라는 매개변수가 없는 생성자)를 호출하려고 하지만, 
			해당 생성자가 정의되어 있지 않기 때문에 오류가 발생했다는 의미입니다.
		 */	
		
	/*
	 	//부모 클래스인 추상클래스 Phone의 생성자는 아래와 같다.
		public Phone(String owner) {
			this.owner = owner;
		}
	 */
		
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	
	}
}
