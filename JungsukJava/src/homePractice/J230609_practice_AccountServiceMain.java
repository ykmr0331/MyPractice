package com.itwill05.service.account;

public class AccountServiceMain {
	
	
	
	public static void main(String[] args) {
		
	
		
		AccountService accountService=
				new AccountService();
		
		Account accountNew = new Account(3555, "아무개", 760000, 5.5);
		/*
		<<과제아님>>
		System.out.println("0.AccountService객체야 Account 객체줄께추가해줘(배열사이즈증가)[OPTION]");
		accountService.addAccount(new Account(1234, "NEW", 56000, 0.3));
		accountService.addAccount(new Account(3422, "ONG", 78000, 0.8));
		accountService.addAccount(2839, "KAN", 96000, 0.9);
		accountService.print();
		System.out.println("0.AccountService객체야 번호,이름,잔고,이율줄께 계좌객체추가해줘(배열사이즈증가)[OPTION]");
		 */
		
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");//완료
		accountService.totAccountNumberPrint();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");//완료
		accountService.print();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");//완료
		accountService.totBalancePrint();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");//원래 완료
		accountService.findByNoPrint(3333);
		accountService.findByNoPrint(1111);
		accountService.findByNoPrint(7777);
		accountService.findByNoPrint(2222);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("5.AccountService객체야 계좌잔고(50000)줄께 잔고이상인 계좌들출력해줘");//완료
		accountService.findByBalancePrint(50000);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("6.AccountService객체야 계좌이율 인자(3.0)로줄께 이율이상인 계좌들출력해줘");//완료
		accountService.findByIyulPrint(3.0);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");//완료
		accountService.findByNamePrint("KIM");
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");//완료
		System.out.println("ㅡㅡㅡㅡㅡ입금 전ㅡㅡㅡㅡㅡ");
		accountService.findByNoPrint(6666);
		System.out.println();
		accountService.ipGum(6666, 9000);
		System.out.println("ㅡㅡㅡㅡㅡ입금 후ㅡㅡㅡㅡㅡ");
		accountService.findByNoPrint(6666);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");//완료
		System.out.println("ㅡㅡㅡㅡㅡ출금 전ㅡㅡㅡㅡㅡ");
		accountService.findByNoPrint(8888);
		accountService.chulGum(8888,1234);
		System.out.println("ㅡㅡㅡㅡㅡ출금 후ㅡㅡㅡㅡㅡ");
		accountService.findByNoPrint(8888);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
	
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");//완료
		accountService.sortByBalanceAscending();
		accountService.print();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountService.sortByBalanceDescending();
		accountService.print();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		
		/*
		<<과제아님>>
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC); // 완료
		 */
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		accountService.findByNoPrint(3333);
		Account updateAccount=new Account(3333, "삼삼",30000, 3.3);// 
		accountService.updateAccount(updateAccount);
		accountService.findByNoPrint(3333);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께... 이름,잔고,이율 수정(update)해줘)[OPTION]");
		accountService.print();
		accountService.updateAccount(7777, "칠칠", 70000, 7.7);
		accountService.print();
		System.out.println();
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		System.out.println("14.0.계좌객체를 인자로받아서 Account[]에추가[OPTION]");
		accountService.addAccount(accountNew);
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	
		System.out.println("15.0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]");
		accountService.addAccount(new Account(3434, "김밥",444444,6.6));
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
}