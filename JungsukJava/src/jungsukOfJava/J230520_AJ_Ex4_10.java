package jungsukOfJava;

public class J230520_AJ_Ex4_10 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i <=5; i++) {
			sum +=1; 
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);// printf메소드를 사용했고, %2d에서 2는 변수 i의 왼쪽에 공백 2칸을 두라는 의미다.
			// ?? %2d: 형식 지정자임, %2d에서의 2는 출력 시 해당 정수 값을 표시할 때 최소 필드 너비를 지정합니다. 따라서 %2d는 출력할 정수 값이 두 자리 이하인 경우 왼쪽에 공백을 추가하여 전체 너비가 2가 되도록 정렬합니다.
		}

	}

}
