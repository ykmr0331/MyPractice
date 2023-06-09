package lang;

public class StringUseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------length-----------------");
		String str1 = "Have a nice day!!!";
		String str2 = "오늘은 금요일 String클래스를 공부해요.";
		int length1 = str1.length();
		int length2 = str2.length();
		int length3 = "자바가 재미있네요.".length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		String emptyStr =""; //null이면 .length() 출력하면 NullPointerException 나온다.
		System.out.println("empty string length: "+ emptyStr.length());
		
		
		
		System.out.println("--------------null-------------------");
		String id = null;
		//String id = "";
		if(id==null || id.equals("")) {
			System.out.println("아이디를 입력하세요~~");
//			id.length();  //이러면 NullPointerException오류 발생한다. null인 객체에 접근해서
		}
		
		System.out.println("--------------charAt-----------------");
		//charAt() 메소드는 주어진 인덱스에 해당하는 위치에 있는 문자를 반환하는 데 사용됩니다.
		String userId = "testST%^*!3467";
		char firstChar = userId.charAt(0);
		char lastChar = userId.charAt(userId.length()-1);
		System.out.println(firstChar);
		System.out.println(lastChar);

		System.out.println(">>아이디는 영문대(소)문자, 숫자로 구분되어야한다.");
		System.out.println(">>아이디의 첫글자는 영문대(소)문자여야한다.");
		if((firstChar > 'a' && firstChar<='z') || (firstChar > 'A' && firstChar<='Z')) {
			System.out.println(firstChar + "는 아이디첫글자로 유효합니다.");
		}else {
			System.out.println(firstChar + "는 아이디첫글자로 유효하지 않습니다..");
		}
		
		System.out.println("[Quiz]--------id 유효성체크-----");
		boolean isValid = false;
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.println(tempChar+" , ");
		}	
		System.out.println();
		if(isValid) {
			System.out.println(userId + " 는 유효한 이이디입니다.");
		} else {
			System.out.println(userId + " 는 유효 안한 이이디입니다.");
		}
		
		
		System.out.println("-------------substring------------------");
		//substring() 메소드는 문자열에서 원하는 부분 문자열을 추출하는 데 사용됩니다
		System.out.println("Have a nice day!!!".substring(7));//이러면 7부터 끝까지 nice day!!!
		System.out.println("Have a nice day!!!".substring(7,11)); //이러면 7부터 10까지 나옴 nice
		System.out.println("오늘은 금요일 String클래스를 공부해요.".substring(4,7)); //금요일
		System.out.println("오늘은 금요일 String클래스를 공부해요.".substring(4)); //금요일 String클래스를 공부해요.
		
		
		System.out.println("-------------indexOf------------------");
		/*메소드는 문자열에서 특정 문자 또는 부분 문자열의 첫 번째 등장 위치를 찾는 데 사용됩니다. 
		  이 메소드는 해당 문자열이나 부분 문자열이 처음으로 나타나는 인덱스를 반환합니다.*/
		String email = "guard@gmail.com";
		int atSignPosition = email.indexOf("@");//5
		System.out.println(email.substring(0,atSignPosition));//guard
		System.out.println(email.substring(atSignPosition+1)); //괄호안이 6이므로 index 6부터 출력하니까 gmail.com이 나오는거임
		System.out.println(atSignPosition); //5가 나오는데 이게 @의 위치임
		
		
		System.out.println("--------------split------------------");
		String phoneNo = "010-5624-7686";
		String[] phoneNoArray = phoneNo.split("-");
		for (String tempNo : phoneNoArray) {
			System.out.println(tempNo); //  배열이 {010, 5624, 7686 } 이렇게 되어있어
 		}
		
		
		System.out.println("--------------replace----------------");
		/* replace() 메소드는 문자열에서 특정 문자나 부분 문자열을 다른 문자열로 치환하는 데 사용됩니다.
		 * 이 메소드는 원래의 문자열을 변경하지 않고 새로운 문자열을 반환합니다
		 */
		String str3 = "자바는 객체지향언어입니다. 우리는 자바를 공부합니다.";
		String result3 = str3.replace('자', '날');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		
		
		
		System.out.println("--------------toUpperCase,toLowerCase");
		/*
		 * toUpperCase()는 문자열의 모든 알파벳 문자를 대문자로 변환하는 데 사용됩니다.
		 * toLowerCase()는 문자열의 모든 알파벳 문자를 소문자로 변환하는 데 사용됩니다.
		 */
		System.out.println("jAvA".toUpperCase());
		System.out.println("jAvA".toLowerCase());
		System.out.println("equals -->" + "java".equals("JAVA"));
		System.out.println("equalsIgnoreCase -->" + "java".equalsIgnoreCase("JAVA"));

		
		System.out.println("--------------startsWith-------------");
		/*startsWith() 메소드는 주어진 문자열 또는 부분 문자열로 시작하는지 여부를 확인하는 데 사용됩니다.
		 *  이 메소드는 불리언 값을 반환합니다.*/
		String name ="김수한";
		if(name.startsWith("김")) {
			System.out.println("김씨인사람: "+ name);
		}
		String[] names = {"정경호", "김미숙", "최경녀", "김은희", "신명숙"};
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				System.out.println("김씨인사람["+i+"]: "+ names[i]);
			}
		}
		
		System.out.println("--------------endsWith---------------");
		/*endsWith() 메소드는 주어진 문자열 또는 부분 문자열로 끝나는지 여부를 확인하는 데 사용됩니다. 
		 * 이 메소드는 불리언 값을 반환합니다.*/
		String[] fileNameArray = {
				"a.jpg", "s.txt", "d.gif", "zz.doc", "nn.java"
		};
		for (int i = 0; i < fileNameArray.length; i++) {
			if(fileNameArray[i].endsWith("gif") || fileNameArray[i].endsWith("jpg")) {
				System.out.println(fileNameArray[i]);
			}
		}

		System.out.println("--------------trim-------------------");
		/*trim() 메소드는 문자열의 앞뒤에 있는 공백(화이트스페이스)을 제거하는 데 사용됩니다. */
		String id2 = "   guard  dfds adf dfd  ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		System.out.println(id2.trim());//  문자열들 사이의 공백은 안없어진다. //"guard  dfds adf dfd" 이렇게 나옴
		String chatMessage ="           ";
		if(chatMessage.trim().length()==0) {
			System.out.println("전송안함");
		}
	}

}