
public class EmployeePayPrintAbstractMain {
	public static void main(String args[]) {
		Employee[] emms = {
				new SalaryEmployee(1, "고범석", 40000000),
				new SalaryEmployee(2, "권경록", 45000000),
				new SalaryEmployee(3, "김숙현", 43000000 ),
				new HourlyEmployee(4, "고길동", 200, 10000),
				new HourlyEmployee(5, "김둘리", 100, 9000)
		};
		for (Employee employee : emms) {
			employee.calculatePay();
			System.out.println("-----------------"+employee.getName()+"님 급여명세표");
			employee.print();
			
			
		}
		
	}
}
