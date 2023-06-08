package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 * 1.생성자로 호출(명시적) new String();
		 * 2."" 로 생성(암시적)
		 */
		
		//Object의 equals는 주소를 비교하는거지만
		//String에서 equals는 문자열이 일치하는지를 비교하는 것으로 재정의했다.
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM"; // 문자열 리터럴을 사용해서 String객체를 만든 경우 동일한 문자열리터럴이라면 주소값이 같다.(바로 밑에 얘기)
		String name4 = "KIM"; 		
		
		
		/*  String str1 = "Hello";
			String str2 = new String("Hello");
			
			str1은 문자열 리터럴 "Hello"를 가리키는 객체를 참조하고, str2는 new 키워드를 사용하여 새로운 String 객체를 생성합니다. 
			이 두 개의 객체는 서로 다른 주소를 가리키게 됩니다.

			따라서, str1 == str2를 비교하면 false를 반환하게 됩니다. 
			하지만 우리가 의도한 것은 문자열의 내용이 같은지를 확인하는 것이기 때문에 
				equals() 메소드를 사용하여 객체의 내용을 비교해야 합니다.	*/
		
		System.out.println("-----------String 객체의 내용비교는 반드시 재정의된 equals메소드를 사용하여야합니다.-----------");
											//String객체에서 재정의한 equals를 쓰라고
		/*
		 * public boolean equals(String otherString)
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일하다.");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이 동일하다.");
		}
		if(name1.equals(name4)) {
			System.out.println("name1객체의 문자열과 name4객체의 문자열이 동일하다.");
		}
		if("KIM".equals(name4)) {
			System.out.println("\"KIM\"의 문자열과 name4객체의 문자열이 동일하다.");
		}

		/*compareTo
		 
		    num1.compareTo(num2);  (num1 - num2 =?)
		  
		    0보다 작은 값: 비교 대상 객체는 현재 객체보다 작음을 나타냅니다.
			0: 비교 대상 객체는 현재 객체와 같음을 나타냅니다.
			0보다 큰 값: 비교 대상 객체는 현재 객체보다 큼을 나타냅니다.
		 */
		
		int unicodeGap = "aaa".compareTo("aaa");
		System.out.println(unicodeGap);
		unicodeGap = "aaa".compareTo("aab");
		System.out.println(unicodeGap);
		unicodeGap = "aab".compareTo("aaa");
		System.out.println(unicodeGap);
		
		String irum1 = "홍경호";
		String irum2 = "김경호";
		if(irum1.compareTo(irum2) > 0) {
			System.out.println("irum1, irum2 교환[오름차순]");
		}
	}

}
