package nogeneric;

public class Account {

	
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;    //계좌이율
	
	/**
	 * 기본값으로 초기화된 계좌객체생성
	 */
	public Account() {
	}
	/**
	 * 인자값으로 초기화된 계좌객체생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 계좌잔고
	 * @param iyul 계좌이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	
	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ메소드는 모두 접근제한자 public으로 설정
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 외부에서 멤버변수에 접근 못하기 때문에 메소드로 접근하기 위해
	/*
	 * 계좌데이타를 대입
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/*
	 * 입금
	 */
	/**
	 * 입금 
	 * @param money 입금할 돈은 0보다 큰 수여야한다.
	 */
	public void deposit(int money) {
		balance+=money;
	}
	/**
	 * 출금
	 * @param money출금할돈
	 */
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		balance=balance-money;
		//this.balance-=money;
	}

	/*
	 * 계좌헤더출력
	 */
	/**
	 * 계좌헤더출력
	 */
	public static void headerPrint() {
		System.out.println("----------------------");
		System.out.printf("%s %s %4s %s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	public void print() {
		
		System.out.printf("%d %s %8d %.1f\n",
				this.no,this.owner,this.balance,this.iyul);
	}
	
	
	
	/*
	 *alt + shift + s 그 다음에 r누르면 get set 추가기능있음 
	 */
	//<<getter, setter 메쏘드 생성단축키>>
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}

	
}










