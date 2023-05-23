package jungsukOfJava;

import java.util.Scanner; //java.util패키지에 있는 Scanner 클래스를 사용하기 위해 선언함
							// ?? 정확히는 Scanner클래스를 사용하기 위해 객체를 생성하는 것이다. 
public class J230520_AF_Ex4_06 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner  = new Scanner(System.in);//키보드로 데이터를 입력받기 위해 Scanner 객체를 생성함
		int month = scanner.nextInt(); //키보드로 입력받은 데이터를 Int형으로 변환한 후 변수 month에 대입
		// ?? scanner.nextInt()는 Scanner 객체로부터 정수를 입력받아 반환하는 메서드입니다. 이 메서드를 통해 입력한 값은 int 형으로 변환되어 month 변수에 저장됩니다.
		
		switch(month) { //switch 반복문인데 month가 3,4,5중 하나면 "현재 계절은 봄입니다."가 출력되고 이하는 생략
						// ??  정확히는 switch-case 문입니다. 
						// ?? switch 문 안에는 변수나 식의 값이 들어가며, 해당 값과 일치하는 case 레이블을 찾아 해당하는 코드 블록을 실행합니다. 
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울입니다.");
		}

	}

}
