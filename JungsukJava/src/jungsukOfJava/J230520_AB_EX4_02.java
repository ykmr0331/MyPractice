package jungsukOfJava;

public class J230520_AB_EX4_02 {

	public static void main(String[] args) {
		int x = 0; //int형 변수 x를 선언하고 리터럴 데이터 대입
		System.out.printf("x =%d일 때, 참인 것은 %n", x); //형식화된 출력을 이용해 x의 값을 출력, %d는 정수형 변수를 의미한다. %n은 줄바꿈을 의미한다.
															//???? %d는 형식 지정자고, %n은 이스케이프 시퀸스라고 한다.
		
		if(x==0) System.out.println("x==0"); //x가 0이면 블럭안의 문장을 수행한다. 블럭이 없는 이유는 if조건문 뒤에 문장이 1개이기 때문이다.
		if(x!=0) System.out.println("x!=0");//x가 0이 아니면 블럭안의 문장을 수행한다. 
		if(!(x==0)) System.out.println("!(x==0)");//x가 0이 아니면 블럭안의 문장을 수행한다.
		if(!(x!=0)) System.out.println("!(x!=0)");//x가 0이면 블럭안의 문장을 수행한다.
		
		x = 1; //변수 x에 리터럴데이터를 대입
		System.out.printf("x =%d일 때, 참인 것은%n", x); //형식화된 출력을 이용해 x의 값을 출력, %d는 정수형 변수를 의미한다. %n은 줄바꿈을 의미한다.
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
	}

}
