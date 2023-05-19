package chap01;

public class J230519_E_ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;//선언 대입 동시
		byte var2 = -30;//선언 대입 동시
		byte var3 = 0;//선언 대입 동시
		byte var4 = 30;//선언 대입 동시
		byte var5 = 127;//선언 대입 동시
//		byte var6 = 128;// 컴파일 에러가 나는데 이유는 byte는 8bit이며 -2^7~2^7-1까지이기 때문에
		System.out.println(var1);//각각 출력
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
//		System.out.println(var6);

	}

}
