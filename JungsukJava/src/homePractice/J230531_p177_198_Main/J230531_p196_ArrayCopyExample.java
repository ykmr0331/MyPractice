package J230531_p177_198_Main;
//System.arraycopy()로 배열 복사
public class J230531_p196_ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
//자바에서 배열을 복사하는 메서드입니다. 

	/*
oldStrArray: 복사할 원본 배열
0: 원본 배열에서 복사를 시작할 인덱스
newStrArray: 복사된 요소를 저장할 대상 배열
0: 대상 배열에서 복사를 시작할 인덱스
oldStrArray.length: 복사할 요소의 개수
	 */

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
