

public class AccountMemberFieldMain {

	public static void main(String[] args) {
		
		/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡcase1ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
		
		/*
		 *  1. 1111번 계좌 8000원 입금
		 */
		
		/*
		 * 1-1 계좌객체 생성
		 * 1-2 계좌데이터 대입
		 */
		Account acc1 = new Account();
		acc1.no =1111;
		acc1.owner = "KIM";
		acc1.balance =  10000;
		acc1.iyul = 3.0;
		
		
		/*
		 * 1-3 계좌잔고 8000원 증가
		 */
		acc1.balance += 8000; // 증가연산자
		
		/*
		 * 2. 1111계좌정보출력
		 */
		
		System.out.println("---------------------------");
		System.out.printf("%s %s %3s %4s\n","번호","이름","잔고","이율");
		System.out.println("---------------------------");
		System.out.printf("%d  %s  %d  %.1f\n",acc1.no,acc1.owner,acc1.balance,acc1.iyul);	
		System.out.println();
		//*************************case2*****************************/
		
		/*
		 * 1.은행 모든 계좌의 잔고 50원 증가
		 */
		
		
		/*
		 * 1-1전체계좌생성
		 * 1-2 계좌데이터 대입
		 */
		
		Account a1 = new Account(); // a1 참조변수 만들고 Account객체 만듦 주소는 참조변수에 저장
		a1.no =1000;
		a1.owner = "KIM";
		a1.balance = 70000;
		a1.iyul = 2.0;
		
		Account a2 = new Account(); // a1 참조변수 만들고 Account객체 만듦 주소는 참조변수에 저장
		a2.no =2000;
		a2.owner = "LEE";
		a2.balance = 98000;
		a2.iyul = 3.5;
		
		Account a3 = new Account(); // a1 참조변수 만들고 Account객체 만듦 주소는 참조변수에 저장
		a3.no =3000;
		a3.owner = "SIM";
		a3.balance = 34000;
		a3.iyul = 2.8;
		
		/*
		 * 1-3 모든 계좌 잔고 50원 증가
		 */
		a1.balance += 50;
		a2.balance += 50;
		a3.balance += 50;
		
		/*
		 * 2.은행계좌 전체정보출력
		 */
		
		System.out.println("---------------------------");                                  
		System.out.printf("%s %s %3s %4s \n","번호","이름","잔고","이율");                          
		System.out.println("---------------------------");                                  
		System.out.printf("%d  %s  %d  %.1f\n",a1.no,a1.owner,a1.balance,a1.iyul);	

		
		
		
		
		
	}

}
