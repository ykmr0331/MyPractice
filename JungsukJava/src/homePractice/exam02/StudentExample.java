package J230530_AL_Honja_sec08.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1); //자식클래스 Student의 생성자(매개변수3개포함한)	통해 객체 생성	
			System.out.println("name :" + student.name);
			System.out.println("name :" + student.ssn);
			
			System.out.println("studentNo : " + student.studentNo);
	}

}
