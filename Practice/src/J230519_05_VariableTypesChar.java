
public class J230519_05_VariableTypesChar {

	public static void main(String[] args) {
		/*
		 * 문자형(한개문자)-2byte
		 * 	char c1, c2, c3
		 * 	-문자형 변수(c1,c2,c3)
		 *  -문자형 리터럴: 'A', '힣', 'a', '1', '★'
		 * */
		
		char c1;
		c1 ='A';
		char c2 = '가';
		char c3 ='힣';
		char c4 ='1';
		char c5 = c1;
		
		System.out.println("------char------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		char munja1, munja2, munja3, munja4, munja5, munja6, munja7, munja8, munja9;
		
		munja1 ='A';
			//'A' ==> 00000000|01000001
			//65  ==> 00000000|00000000|00000000|01000001
		munja2 = 65;
			// munja2가  integer라면 65를 출력하겠지만 char이기 때문에 테이블을보고 'A'를 출력하는거다	
		munja3 = '가';
		munja4 = 44032;
			//  munja4가  integer라면 44032를 출력하겠지만 char이기 때문에 테이블을보고 '가'를 출력하는거다
		munja5 = 0xAC00;
			// 유니코드값 integer라면 0xAC00(10진수라면 44032)를 출력하겠지만 char이기 때문에 테이블을보고 '가'를 출력하는거다
		munja6 ='\uAC00';
			//'AC00'가 유니코드임을 알려주려면 앞에 \\u를 붙여야한다. 그냥 u를 붙이면 단순히 u라고 인식해서 안됌
			//'가'가 출력됨
		munja7 ='1';
		munja8 = 49;
		munja9 = '※';
		System.out.println("*************************************");
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println("munja6 =" +munja6);
		System.out.println(munja7);
		System.out.println(munja8);
		System.out.println(munja9);
		/*
		 * 문자열(한개문자)-2byte
		 * 	char c1, c2, c3
		 * 	-문자형 변수(c1,c2,c3)
		 *  -문자형 리터럴: 'A', '힣', 'a', '1', '★'
		 * */
		
	}
 
}
