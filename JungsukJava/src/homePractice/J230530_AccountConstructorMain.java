
public class J230530_AccountConstructorMain {

	public static void main(String[] args) {
		J230530_Account account1 = new J230530_Account();
		account1.setAccountData(1111, "KIM", 7800, 2.3);
		account1.deposit(8000);
		account1.headerPrint();
		account1.print();
		
		J230530_Account account2 = new J230530_Account(2222, "LEE", 5600, 3.3);
		account2.withDraw(678);
		account2.headerPrint();
		account2.print();
	
		/*
		 * 객체를 재사용
		 */
		
		/*
		account2.setAccountData(3333, "SAM", 3000, 3.3);
		account2.deposit(333);
		account2.headerPrint();
		account2.print();
		*/
	}

}
