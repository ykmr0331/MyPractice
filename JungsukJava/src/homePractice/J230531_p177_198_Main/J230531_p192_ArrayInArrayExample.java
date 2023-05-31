package J230531_p177_198_Main;

public class J230531_p192_ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			
			}
		}
		
		System.out.println();
		
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2]; // 0행은크기가 2인거임
		englishScores[1] = new int[3]; // 1행은 크기가 3
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" +i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();
		int[][] javaScores = {{95,80},{92,96,80}};
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" +i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
		

	}

}
