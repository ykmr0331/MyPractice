package J230531_p177_198_Main;

public class J230531_p198_AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for (int score : scores) { // 이 세줄은 scores배열객체의 처음부터 끝까지의 요소를 sum변수에 더하는 것이다. 
			sum += score;		   //		
		}		                   //
		
		System.out.println("점수 총합 =" + sum);
		
		double avg = sum / (double)scores.length;
		System.out.println("점수 평균 =" + avg);
	}

}
