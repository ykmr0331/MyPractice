package chap01;

public class J230519_B_VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);// 문자열 연결 연산자를 이용해서  x값과 y값 출력

		
		//temp 변수를 만들어서 x와 y의 값을 바꾸려는 것
		int temp = x; // 변수 x의 값을 변수 temp값에 대입
		x = y;		  //변수 y의 값을 변수 x의 값에 대입	
		y = temp;	  //변수 temp의 값을 변수 y의 값에 대입
		System.out.println("x :" + x + ", y :" + y);// 이렇게 서로 바뀐 x와 y를 출력함
		
	}

}
