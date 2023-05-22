
public class J230522_02_OperatorLogical {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4;
		boolean result;
		b1=true;
		b2=true;
		b3=false;
		b4=false;

		
		result =b1 || b2;
		System.out.println("true || true -->" +result);
		result =b1 || b3;
		System.out.println("true || false -->" +result);
		result =b3 || b1;
		System.out.println("false || true -->" +result);
		result =b3 || b4;
		System.out.println("false || false -->" +result);
		
		System.out.println();
		
		result =b1 && b2;
		System.out.println("true && true -->" +result);
		result =b1 && b3;
		System.out.println("true && false -->" +result);
		result =b3 && b1;
		System.out.println("false && true -->" +result);
		result =b3 && b4;
		System.out.println("false && false -->" +result);
		
		/*
		 * 점수의 유효성체크[0~100사이의 정수]
		 * 
		 */
		int kor =67;
		int eng = 90;
		
		boolean condition1 = kor >=0;
		boolean condition2 = kor <=100;
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수유효성체크:" + isValidScore);
		
		boolean condition3 = kor >= 90;
		boolean condition4 = eng >= 90;
		
		System.out.println(">>A대학 국어점수가 90점이상이거나 영어점수가 90점이상이면 합격");
		boolean isPass1 = condition3 || condition4;
		System.out.println("\t A대학 합격여부:" +isPass1);
		
		System.out.println(">>B대학 국어점수가 90점이상고 영어점수가 90점이상이면 합격");
		boolean isPass2 = condition3 && condition4;
		System.out.println("\tB대학 합격여부:" +isPass2);
		
		int math = 73;
		
		boolean isValidMathScore = (math > 0) && (math <=100); 
		System.out.println("수학점수의 유효성여부:"+isValidMathScore);
		
		boolean isInvalidMathScore = math < 0 || math > 100; 
		System.out.println("수학점수의 유효하지않은지 여부:"+isInvalidMathScore);
		
		System.out.println("----------배수판별----------");
		int number = 12;
		boolean isMultiple3 = (number%3) ==0;
		System.out.println("3의 배수 여부:" + isMultiple3);
		
		boolean isMultiple4 = (number%4) ==0;
		System.out.println("4의 배수 여부:" + isMultiple4);
		
		boolean isMultiple34 = isMultiple3 && isMultiple4;
//		boolean isMultiple34 =  (number%3) ==0 && (number%4) ==0 ;같은거임
		System.out.println("3,4의 공통배수 여부:" + isMultiple34);
		
		
		/*
		 * 윤년여부판단
		 * -4의배수(4로 나누어떨어지는수)이면서 100의 배수가 아닌수(100으로 나누어 떨어지지않는수) jay %4 ==0 && jay % 100 !=0;
		 * -400의배수(400으로 나누어 떨어지는 수)  jay % 400 ==0;
		 * */

		int year = 2023;
		boolean isLeapYear = (year % 4 ==0 && year % 100 != 0) || (year % 400 ==0) ;// ||를 쓴이유는 어짜피 400년은 4년배수와 겹치므로 
		System.out.println(year+ "의 윤년여부: " +isLeapYear);
		
		char c = '김';
		
		boolean isHangul = c >= '가' && c <='힣';
		System.out.println("한글여부:" + isHangul);
	
		/*
		 * 아이디의 첫글자가 영어 대문자나 소문자여야함
		 * 
		 */
		
		char idFirstLetter = '@';
		boolean isValidIdFirstLetter = true;
		boolean isEnglish = (idFirstLetter >= 'a' && idFirstLetter <= 'z') || (idFirstLetter >= 'A' && idFirstLetter <= 'Z');
		
		System.out.println(+idFirstLetter+"의 적합성여부:" +isValidIdFirstLetter);
		System.out.println(+idFirstLetter+"의 적합성여부:" +isEnglish);
		
	}

}






