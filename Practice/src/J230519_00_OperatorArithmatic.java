
public class J230519_00_OperatorArithmatic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int result = 0;
		result = (a + b);
		System.out.println("a + b --> " + result);
			// 여기서  + 는 문자열 연결연산자
		result = (a - b);
		System.out.println("a - b --> " + result);
		
		result = (a * b);
		System.out.println("a * b --> " + result);
		
		result = (a / b);
		System.out.println("a / b --> " + result);
		//원래는 0.5가 나와야되는데 0이 나온다.이유는 나중에 
		

		
		/*
		 * 나머지 연산자
		 *  %
		 * 
		 */
		result = (a % b);
		System.out.println("a % b --> " + result);
		
		int number = 16;
		result = number %4;
		System.out.println("result변수값이 0이면 4의 배수:" + result);
		
		
		
		int year = 2023;
		
		result = year % 4; //0,1,2,3
		System.out.println("2023%4-->" +result);
		
		result = year%100; 
		System.out.println("2023%100-->" +result);

		result = year%400; 
		System.out.println("2023%400-->" +result);
		
		/*
		 * 비트연산자
		 * << ,>>
		 */
		int i =1;
		System.out.println("---------->>,<<(비트연산자)----------");
		System.out.println(i);
		result = i << 1;// 0000|0001 에서 0000|0010 이렇게 된다는거
		System.out.println(result);
		result = i << 2; // 0000|0001 에서 0000|0100 이렇게 된다는거 
		System.out.println(result);
		result = i << 3;
		System.out.println(result);
		result = i << 4;
		System.out.println(result);
			
		/*
		int d = 128;     	==> 00000000|00000000|00000000|10000000
		result =d >> 1;     ==> 00000000|00000000|00000000|00100000 
		result =d >> 2;     ==> 00000000|00000000|00000000|00010000 
		result =d >> 3;     ==> 00000000|00000000|00000000|00001000 
		*/
		
		i =128;
		System.out.println(i);
		result =  i >>1;
		
		System.out.println(result);
		result =  i >>2;
		
		System.out.println(result);
		result =  i >>3;
		
		System.out.println(result);
		result =  i >>4;
		System.out.println(result);
		
		
		System.out.println("--------문자연산--------");
		char ca = 'A';
		char cz = 'Z';
		
		int numberOfAlphabet = cz-ca + 1;// 하나 더해야 갯수 나온다.
		System.out.println("알파벳 대문자 갯수 =" +numberOfAlphabet);
		int numberOfHangul = '힣' - '가'+1;//한글은 가~힣(자음 모음 따로있는건 일단 제외하자)
		System.out.println("한글 글자수 =" + numberOfHangul);
		
		char hangul1 = '가';
		System.out.println(hangul1);
		char hangul2 = '가' - 2;
		System.out.println(hangul2);
		
		
		
	}

}