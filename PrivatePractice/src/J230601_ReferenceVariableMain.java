
public class J230601_ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("--------------------Reference Variable assign-------------------");
		J230601_Account account1 = new J230601_Account(2351, "김아론", 90000, 3.6);
		J230601_Account account2 = account1;
		J230601_Account account3 = new J230601_Account(8989, "김경록", 89000, 5.6);
		
		System.out.println("account1주소>>"+account1);
		System.out.println("account2주소>>"+account2);
		account1.print();
		account2.print();
		
		account1.setOwner("김야론"); // 이러면 account2 의 Owner 변수도 똑같이 바뀜
		account1.print();
		account2.print();

		System.out.println("--------------Reference Variable Compare(\"==\",\"!\"=)-----------------");
		if(account1==account2) {
			System.out.println("주소값이 동일하다.      "+account1+ "==" +account2);
		}
		if(account1!=account3) {
			System.out.println("주소값이 동일하지 않다. "+account1+ "!=" +account3);
		}
		System.out.println();
		
		System.out.println("--------------Reference Variable swap[주소교환]-----------------");
		J230601_Account a1 = new J230601_Account(1000, "일천님", 30000, 3.0);
		J230601_Account a2 = new J230601_Account(2000, "이천님", 80000, 2.0);
		
		System.out.println("---swap전----");
		a1.print();
		a2.print();
		
		
		//교환하기 위한 임시변수선언
		J230601_Account tempAccount = a2;
		a2 =a1;
		a1 =tempAccount;
		
		
		System.out.println("---swap후----");  // 이제 a1이 이천님이다.
		a1.print();
		a2.print();
		
		System.out.println("---Reference Variable null value----");  
		/*
		 * null: 객체주소리터럴값
		 * -객체주소초기화의 용도로 사용
		 * -null주소 사용시 NullPointerException 예외가 발생(런타임시 발생)
		 */
		J230601_Account a = null;
		if(a ==null) {
			a =new J230601_Account(9090,"구공이", 565678,1.3624);
		}
		a.print();
		
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
 *     결론부터 말하자면 주소값이 같은 객체이면 절대 안의 내용이 다를 수 없다. 
 *
 * public class ReferenceVariableMain {

	public static void main(String[] args) {
		Account account1 = new Account(2351, "김아론", 90000, 3.6);
		Account account2 = new Account(2353, "김오론", 90006, 3.4);
		Account account2 = account1;   //account2 변수가 이미 선언되어 있기 때문에 다시 선언할 수 없습니다
	}

}

 public class Memo2 {

	public static void main(String[] args) {
		Account account1 = new Account(2351, "김아론", 90000, 3.6);
		Account account2 = new Account(2353, "김오론", 90006, 3.4);
		account2 = account1; // 객체 내용도 들어간다.
		
		System.out.println(account1);
		System.out.println(account2);

		account1.print();
		account2.print(); //같게 나온다.
	}
}
 */

