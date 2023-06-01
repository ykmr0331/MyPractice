
public class J230601_ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		System.out.println("----------------{} 를 사용한 배열객체 사용과 초기화------------------");
		
		
		
		J230601_Account acc1 = new J230601_Account(1111, "LEE", 560000, 0.8);

		J230601_Account[] accounts = {
				// 계좌번호, 계좌주이름, 계좌잔고, 계좌이율
				acc1, 
				new J230601_Account(2222, "KIM", 990000, 3.5), 
				new J230601_Account(3333, "PARK", 965000, 6.9),
				new J230601_Account(4444, "LEE", 342000, 2.9), 
				new J230601_Account(5555, "CHOI", 783000, 4.8),
				new J230601_Account(6666, "SIM", 612900, 9.2), 
				new J230601_Account(7777, "SOO", 560000, 5.8),
				new J230601_Account(8888, "MIN", 123000, 2.2), 
				new J230601_Account(9999, "JANG", 98000, 8.9) };

		System.out.println("1.은행총계좌수" + accounts.length);// 9개인데
		// 배열의 멤버의수가 계좌 개수임
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("2.은행계좌 전체출력");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}

		/*
		 * Account tempAccount = accounts[i]; // accounts배열 안에 있는 account객체들을 새로 만든
		 * account객체의 참조변수 tempAccount에 집어 넣는다. tempAccount.print(); //그리고
		 * tempAccount참조변수를 호출해서 반복적으로 계좌를 출력한다.
		 */

		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("2.은행계좌 전체출력(enhanced for)");
		J230601_Account.headerPrint();
		for (J230601_Account tempAccount : accounts) {
			tempAccount.print();
		}

		/*
		 * int[] numbers = {1, 2, 3, 4, 5};
		 * 
		 * for (int num : numbers) { System.out.println(num); }
		 * 
		 * 위의 예제에서 numbers 배열의 각 요소가 반복문 실행 시 num 변수에 할당됩니다. 반복문은 배열의 모든 요소를 차례대로 출력하게
		 * 됩니다.
		 */

		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ			
		System.out.println("3.은행계좌들 총잔고");
		int totBalnce = 0;
		for (int j = 0; j < accounts.length; j++) {
			totBalnce += accounts[j].getBalance(); // Account클래스에서 멤버변수자체는 private임

		}
		System.out.println(">>" + totBalnce);
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 3333) {
				accounts[i].print();
				break; // 3333찾으면 반복할 필요 없으니까
			}
		}
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("5.은행 계좌들중에서 계좌잔고 500000원이상인 VIP계좌 여러개 찾아서 출력[enhanced for]");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 500000) {
				accounts[i].print();

			}
		}

		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getIyul() >= 2.0) {
				accounts[i].print();
			}
		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		

		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner() == "KIM") {
				accounts[i].print();
			}
		}
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		

		System.out.println("7.6666번계좌 3000원입금");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 6666) {
				System.out.println(">>입금전");
				accounts[i].print();

				accounts[i].deposit(3000);

				System.out.println(">>입금후");
				accounts[i].print();
			}
		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		

		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		J230601_Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == 9999) {
				System.out.println(">>출금전");
				accounts[i].print();

				accounts[i].withDraw(3000);

				System.out.println(">>출금후");
				accounts[i].print();
			}
		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		System.out.println(">>>>>>>>>>>>>>>>>정렬전<<<<<<<<<<<<<<<");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();

		}

	
		for(int j=0;j<accounts.length-1;j++) {
			for(int i = 0; i<accounts.length-1; i++) {
			if(accounts[i].getBalance() > accounts[i+1].getBalance()) {
				J230601_Account tempAccount = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i]=tempAccount;
				}
		
			}
		
		}
		
		System.out.println(">>>>>>>>>>>> 정렬후 <<<<<<<<<<<<<<<");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		System.out.println("9.계좌잔고순으로 내림차순정렬[Quiz]");
		System.out.println(">>>>>>>>>>>>>>>>>정렬전<<<<<<<<<<<<<<<");
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();	
		}
		
		for(int j=0;j<accounts.length-1;j++) {
			for(int i = 0; i<accounts.length-1; i++) {
			if(accounts[i].getBalance() < accounts[i+1].getBalance()) {
				J230601_Account tempAccount = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i]=tempAccount;
				}
		
			}
		
		}

			
		System.out.println(">>>>>>>>>>>> 정렬후 <<<<<<<<<<<<<<<");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println();	
			
			
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
	
		System.out.println(">>>>>>>>>>>>>>>>>정렬전<<<<<<<<<<<<<<<");
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();	
		}
		
		for(int j=0;j<accounts.length-1;j++) {
			for(int i = 0; i<accounts.length-1; i++) {
			if(accounts[i].getNo() > accounts[i+1].getNo()) {
				J230601_Account tempAccount = accounts[i+1];
				accounts[i+1] = accounts[i];
				accounts[i]=tempAccount;
				}
		
			}
		
		}

			
		System.out.println(">>>>>>>>>>>> 정렬후 <<<<<<<<<<<<<<<");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println();	
			
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		System.out.println("9.계좌이름순으로 오름(내림)차순정렬(String 클래스를 배운후에추가)");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for (J230601_Account account : accounts) {
			if(account.getNo()==5555) {
				account.print();
				account.setIyul(9.9);
				account.print();
				break;
			}
		}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		
		for (J230601_Account account : accounts) {
			if(account.getBalance() >50000) {

			}
		}
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

	}

}
