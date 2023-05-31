package J230531_p177_198_Main;
//for문으로 배열 복사
public class J230531_p195_2_ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) { // i<newIntArray.length하면 안된다. old에 3개밖에 없으니가 범위 벗어나
			newIntArray[i] = oldIntArray[i]; 
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
		
	}

}
