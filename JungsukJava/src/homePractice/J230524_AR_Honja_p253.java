//매개변수의 개수를 모를 경우, 가변인수를 사용한다!!!!!!!!!
package homePractice;

public class J230524_AR_Honja_p253 {

}

class Computer {
	
	int sum1(int[] values) { // ?? 매개변수로 int배열 values를 받는다. 그리고 int타입의 값을 반환한다
		int sum = 0; //sum1메서드 안에서 변수 선언 및 초기화
					 // ??배열 values의 모든 요소들의 합을 저장하기 위한 변수 sum을 선언하고 0으로 초기화합니다.
		for(int i =0; i <values.length; i++) { 
			sum += values[i];//메서드 내의 변수 sum에 배열의 인덱스의 값을 더한다?
							
		}
		return sum; // 계산된 합계(sum)을 반환합니다.
	}
	
	int sum2(int... values) { // int... values는 가변 인수를 나타내는 문법입니다 
								//이때 전달된 인수들은 내부적으로 배열로 처리됩니다.
		int sum = 0;
		for(int i =0; i <values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
