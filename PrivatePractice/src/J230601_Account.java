
public class J230601_Account {

	
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//계좌잔고
	private double iyul;    //계좌이율

	
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ메소드는 모두 접근제한자 public으로 설정
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 외부에서 멤버변수에 접근 못하기 때문에 메소드로 접근하기 위해
	
	
	
	/*
	 * 계좌데이타를 대입
	 */
	
	
	
	public J230601_Account(int no, String owner, int balance, double iyul) {
		this.no =no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	
	
	
	public J230601_Account() {
		
	}



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
		balance=balance-money;
		//this.balance-=money;
	}
	/*
	 * 계좌헤더출력
	 */
	public static void headerPrint() { // 이러면 공용메서드가 된다.
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

}










