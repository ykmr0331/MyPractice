package jungsukOfJava;

import java.util.Scanner; //java.util패키지 안에 있는 Scanner 클래스를 이용하기 위해 선언

public class J230520_AE_Ex4_05 {

	public static void main(String[] args) {
		int score = 0; //변수 score 선언과 데이터 대입 동시에 함
		char grade = ' ', opt = '0'; //변수 grade와 opt 선언을 하고 동시에 데이터 대입
		
		System.out.println("점수를 입력해주세요.>");//Scanner클래스를 통해 키보드를 데이터를 입력받기 전에 어떤 데이터를 입력해야되는지 알려주기 위해 출력함
		Scanner scanner = new Scanner(System.in);// 키보드로 데이터 입력받기 위해 Scanner 객체 생성
		score = scanner.nextInt(); //Scanner클래스를 통해서 키보드로 입력받은 데이터를 Int형으로 변환 후 변수 score에 대입
		
		System.out.printf("당신의 점수는 %d입니다.%n", score); //여기서 %d는 score를 말하는데 정확한 명칭은 모르겠고, %n은 줄바꿈을 의미하는데 정확한 명칭은 모르겠다. 
		 // ?? %d와 %n은 printf 메서드에서 사용되는 형식 지정자라고 한다.
		//  ??  %d는 정수형 변수를 출력하기 위한 서식 지정자로 사용됩니다
		
		if(score >= 90) {
			grade ='A';
			if(score >= 98) {
				opt ='+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade ='B';
			if(score >= 88) {
				opt ='+';
			} else if(score < 84) {
				opt = '-';
			} 
		}else {
				grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	
	}

}
