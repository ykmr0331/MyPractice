package jungsukOfJava;

public class J230520_AK_Ex4_11 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=5; i++) {// for문을 이용해서 i가1부터 5까지 반복되도록한다.
			for(int j=1; j<=i; j++) {//for문을 이용해서 jrk 1부터 5까지 반복되도록하는데 여기서 j는 i이하여야한다.
				System.out.print("*");// 위의 두 for문 조건에 따라 i가 1일 때는 *가 1개, i가 2일 때는 *가 2개 이렇게 순차적으로 출력된다.
			}
			System.out.println();// 순차적으로 *가 출력되는데 여기서 줄바꿈 표시가 있으므로 *가 피라미드 형식으로 출력되는거다.
		}

	}

}
