package chap01;

public class J230519__A_VariableUseExample {

	public static void main(String[] args) {
		int hour =3;//hour 변수 선언 변수 데이터 삽입 동시에
		int minute = 5;//minute 변수 선언 변수 데이터 입력 동시에
		System.out.println(hour + "시간" + minute + "분"); // 문자열 연결연사자를 사용해 몇시간 몇분인지 나타냄
		
		int totalMinute = (hour*60) + minute; 
		//totalMinute이라는 변수를 생성하고 hour, minute변수를 사용해 totalMinute 변수에 데이터 입력
		System.out.println("총" + totalMinute + "분");//이번에는 총 몇분인지로 나타냄/
	
	}

}
