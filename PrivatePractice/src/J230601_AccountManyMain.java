
public class J230601_AccountManyMain {
	
	//AccountManyMember는 Account객체를 멤버변수로 갖는다.
	
	public static void main(String[] args) {
		J230601_AccountMany accountManyMember = new J230601_AccountMany();
		System.out.println(accountManyMember);
			
		accountManyMember.acc0 = new J230601_Account(1, "KIM", 30000, 0.3) ;
		//accountManyMember는 AccountManyMember타입 
		//accountManyMember.acc0는 Account타입
		accountManyMember.acc1 = new J230601_Account(2, "LEE", 45000, 4.2) ;
		accountManyMember.acc2 = new J230601_Account(3, "MIN", 78000, 3.8) ;		
		accountManyMember.acc3 = new J230601_Account(4, "NIM", 92000, 2.9 ) ;
		accountManyMember.acc4 = new J230601_Account(5, "OIM", 81000, 1.7) ;
		
		//배열은 식별자가 없고 숫자로 접근한다
		
		accountManyMember.length =5;
		J230601_Account.headerPrint(); //메소드를 static으로 해놔서 이게 가능
		//밑에는 for문으로 못바꿈  배열로는 가능 그래서 이거 한거임
		accountManyMember.acc0.print();
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
		
		
	}

}
