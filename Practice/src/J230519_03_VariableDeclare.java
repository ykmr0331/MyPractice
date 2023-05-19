		/*
		 값(데이타)
			- 문자  : 김 , A , z
			- 문자열: "김경호", "JAMES" , "Student"
			- 숫자  : 1, 2 , 3 , 3.14159
		 */
		/*
		변수의선언
           	   - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		   - 형태:
		        데이타타입 이름(식별자);
		         ex> int number;


		   - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$ 는 사용가능)
			   - 키워드 사용금지
		*/
public class J230519_03_VariableDeclare {

	public static void main(String[] args) {
		int score1; //변수선언
		score1 = 100;	//정수형데이터, 정수형 리터럴, 변수에 값(정수형 리터럴)을 대입
		System.out.println(score1);//변수값을 출력
		score1 = 89; 
		System.out.println(score1);
		int score2 = 90;
		System.out.println(score2);
		score2 = 99;
		System.out.println(score2);

		int number = 333;
		int $number = 444;
		int 번호 = 555;
		System.out.println(number);
		System.out.println($number);
		System.out.println(번호);
		
		
		
		int kor, eng, math; //타입이 같은 변수를 연속으로 선언할 수 있다.
		kor =90;
		eng = 89;
		math = 99;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		/*
		 Duplicate local variable kor >> 같은 이름의 변수가 중복해서 선언되었을 때 발생하는 오류
		 
		 int kor =99;
		 */
//		history = 80;  history cannot be resolved to a variable >> 변수 선언 안됐다고
		
//		int 7Up;  앞에 숫자라서 안됌
//		int my-score; 특수문자 안됌 
//		int your score; 띄어쓰기 안됌
		
		String name;
		name = "박재찬";
		System.out.println(name);
		
				}

}
