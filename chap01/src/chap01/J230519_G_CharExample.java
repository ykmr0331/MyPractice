package chap01;

public class J230519_G_CharExample {

	public static void main(String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65;  //???? 65는 아스키 코드에서 문자A를 숫자로 나타냈을 때 65임 
		char c3 = '\u0041'; //????  \\u를사용해  16진수로 표현한 Unicode 코드 포인트를 문자로 나타낼 수 있습니다
							//????즉 이건 16진수 0041이고 아스키 표준에서 A를 나타낸다
		char c4 = '가'; //문자를 직접 저장
		char c5 = 44032;
		char c6 = '\uac00';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		

	}

}
