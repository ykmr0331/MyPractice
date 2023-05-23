package homePractice;

public class J230523_AN_Honja_p152_1 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i =0;
		for(i =1; i<=100; i++) {
			sum +=i;
			System.out.println("1~" +(i -1) + "합 :" + sum ); 
		}
		
		
		System.out.println("1~" +(i -1) + "합 :" + sum ); //i++가 for문의 마지막으로 끝나는거니까  

	}

}
