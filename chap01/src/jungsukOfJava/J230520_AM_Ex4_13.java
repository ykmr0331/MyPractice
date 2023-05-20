package jungsukOfJava;

public class J230520_AM_Ex4_13 {

	public static void main(String[] args) {
		int sum = 0; //integer형 변수 sum을 선언하고 데이터 동시 대입
		int i =0;  //integer형 변수 i를 선언하고 데이터 동시 대입
		
		while(sum <=100) {//while반복문 사용하는데 sum의 값이 100이하가 아닐 때 까지 반복
			System.out.printf("%d - %d%n", i, sum);//형식지정자를 사용해서 i와 sum의 값을 출력
			sum += ++i; //변수 sum에 i값을 더한다.
		}

	}

}
