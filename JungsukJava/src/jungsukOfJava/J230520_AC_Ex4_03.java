package jungsukOfJava;

import java.util.Scanner; //Scanner함수로 숫자 입력하기위해 넣은것 정확히 뭔진모르겠어
//??  Scanner 클래스를 사용하기 위해 해당 클래스를 포함시키기 위한 선언입니다. 
//??  Java에서는 다른 패키지에 있는 클래스를 사용하려면 해당 클래스를 import 문을 사용하여 명시적으로 포함해야 합니다.

public class J230520_AC_Ex4_03 {

	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력하세요.>"); //이건 숫자 입력하기 전에 설명위해 출력한거
		
		Scanner scanner = new Scanner(System.in);// 숫자 입력하기 위해서 scanner객체 입력?? 정확히는 모르겠다.
												 // ??  사용자로부터 숫자를 입력받기 위해 Scanner 객체 생성	
		
		int input = scanner.nextInt(); // scanner함수로 입력받은 숫자 데이터를 int형 변수 input에 대입
									  // ??  . nextInt() 메서드는 Scanner 객체를 사용하여 정수 값을 입력받을 수 있습니다.
		
		if(input ==0) { 
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}

	}

}
