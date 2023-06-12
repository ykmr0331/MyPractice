public abstract class Employee {
    private int no;		//번호
    private String name;//이름
    private int pay;	//급여
     
    public final static double INCENTIVE_RATE=0.1;
    
    public Employee() {   
	}
    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
    /*
     * 급여계산
     *   - 실제구현작업 불가능
     *   - 자식클래스에서 반드시 재정의해야하는 메쏘드
     *   - 재정의강제(규칙,specfication)
     */
	public abstract void calculatePay();
	/*
	 *인센티브계산( 급여가 200만원이 넘으면 10% 인센티브지급)
	 *	 - 모든사원들의  인센티브계산방법 동일함
	 *   - 재정의금지(회장님의 방침,변경금지) 
	 */
	public final double calulateIncentive() {
		double incentive=0.0;
		if(this.pay>2000000) {
			incentive = this.pay*Employee.INCENTIVE_RATE;
		}
		return incentive;
	}
	
	
	
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.pay+"\t");
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
	

}