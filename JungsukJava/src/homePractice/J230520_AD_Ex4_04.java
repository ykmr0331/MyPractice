package homePractice;

import java.util.Scanner; //Scanner함수를 사용하기 위해서 선언함
						  // ??  java.util 패키지에 속한 Scanner 클래스를 현재 소스 파일에서 사용하기 위해 포함시킨 것입니다.
public class J230520_AD_Ex4_04 {

	public static void main(String[] args) {
		int score = 0; //int형 변수 score를 선언하고 동시에 데이터도 대입
		char grade = ' '; //char형 변수 grade를 선언하고 동시에 데이터도 대입
		
		System.out.print("점수를 입력하세요.>"); //Scanner함수를 이용해서 데이터를 입력하기 전에 무슨 데이터를 입력할지 내용을 출력
		Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성하고, 이 객체를 scanner라는 변수에 대입하는 것입니다.
												  //  ??생성된 Scanner 객체를 사용하여 키보드로부터 데이터를 입력받을 수 있습니다.	
		score = scanner.nextInt(); //Scanner객체를 활용해 입력한 숫자형데이터를 int형변수 score에 대입 
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >=80) {
			grade = 'B';
		} else if (score >=70) {
			grade = 'C';
		} else {
			grade ='D' ;
		}
		System.out.println("당신의 학점은 " + grade+ "입니다." );
	}

}
