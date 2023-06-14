
public class Account {

	
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;    //계좌이율

	public Account() {
	}
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}



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
	public void deposit(int money) {
		balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		if(money > this.balance) {
			
		}else {
			balance=balance-money;
		}
	}
	/*
	 * 계좌헤더출력
	 */
	static public void  headerPrint() {
		System.out.println("-----------------------");
		System.out.printf("%s %s %4s %3s\n","번호","이름","잔고","이율");
		System.out.println("-----------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	public void print() {
		
		System.out.printf("%d %-4s %8d %.1f\n",
				this.no,this.owner,this.balance,this.iyul);
	}
	/*
	 << getter,setter 메쏘드생성단축키>>
	  alt + s         --> r
	  alt + shift + s --> r
	 */
	//getter,setter
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
	
	
}










