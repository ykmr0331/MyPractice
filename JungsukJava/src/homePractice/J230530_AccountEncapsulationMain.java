
public class J230530_AccountEncapsulationMain {

	public static void main(String[] args) {
		J230530_Account account1 = new J230530_Account();
		account1.setAccountData(1111, "KIM", 89000, 2.4);
	/*
	 * account1 8000원 입금
	 * 
	 */
		account1.deposit(8000);
		account1.headerPrint();
		account1.print();
		
	/*
	 * account1의 이율 변경	 // 멤버변수 자체에는 접근 안된다. 지금
	 */
		
		account1.setIyul(account1.getIyul() + 1.0);
		account1.print();
	
		
		/*
		 * account1의 잔고 얻기
		 */
		
		System.out.println("account1의 잔고:" + account1.getBalance());
	
		
		J230530_Account acc1 = new J230530_Account();
		J230530_Account acc2 = new J230530_Account();
		J230530_Account acc3 = new J230530_Account();
		acc1.setAccountData(100, "CHOI",890000 ,3.5);
		acc2.setAccountData(200, "SIM",450000,2.7);
		acc3.setAccountData(300, "LEE",120000 ,1.2);
		
		
		/*
		 *   모든 계좌 잔고 50원 증가 
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();  //print()도 메서드이기 때문에 사용 가능
	
	
	
	
	
	
	
	  
	
	
	}

}
