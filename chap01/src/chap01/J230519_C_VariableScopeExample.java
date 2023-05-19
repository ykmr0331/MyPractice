package chap01;

public class J230519_C_VariableScopeExample {

	public static void main(String[] args) {
		 int v1 = 15; //변수 v1의 선언과 데이터 삽입 동시에 수행
		 if(v1>10) { //if문을 사용해서 변수 v1이 숫자 10보다 클 경우 중괄호 안의 문장들을 수행한다.
			 int v2;     //8,9라인은 if문이 참일 때 수행될 문장들
			 v2 =v1 -10;
			 System.out.println(v2);
		 }
//		 int v3 =v1 + v2 + 5; //v2는 if문 안 괄호에서만 사용할 수 있기때문에 컴파일 에러가 발생 
	}

}
