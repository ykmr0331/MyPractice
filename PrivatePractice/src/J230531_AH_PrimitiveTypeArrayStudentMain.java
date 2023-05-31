
import java.util.Arrays;

public class J230531_AH_PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {

		// 번호 이름 국어 영어 수학 총점 평균 평점 따로 만들기

		System.out.println("-------학생 10명 성적데이터를 저장하기 위한 배열 객체 생성과 초기화-------");
		System.out.println();
		// 번호는 번호대로 이름은 이름대로 넣어야함. 같은타입끼리 넣어야해서 그럼

		// int[] noArray = new int[10]; 이게 보통 배열 객체 생성하는거
		// 이렇게 초기화할 수 있다. 블럭에 의한 초기화라고 함
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 번호

		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };// 이름
		int[] korArray = { 12, 90, 45, 78, 45, 22, 99, 71, 63, 80 }; // 국어 // int[] korArray = {}; 이래도 배열만들어진다.
		int[] engArray = { 98, 45, 23, 68, 71, 95, 80, 37, 55, 88 };// 영어
		int[] mathArray = { 99, 97, 93, 77, 83, 56, 67, 82, 88, 12 };// 수학
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };// 총점
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };// 평균
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };// 학점
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };// 석차

		/*
		 * 총점,평균,평점계산
		 */

		for (int i = 0; i < noArray.length; i++) {
			totArray[i] += korArray[i] + engArray[i] + mathArray[i];

			avgArray[i] = totArray[i] / 3.0;

			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}

		}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		/*
		 * 총점으로 석차계산
		 */

		for (int j = 0; j < totArray.length; j++) {
			for (int i = 0; i < totArray.length; i++) {
				if (totArray[j] < totArray[i]) {
					rankArray[j]++;
				}
			}
		}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 
		

		
		/*
		 * 번호3번인학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)
		 */
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(" 번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)");

		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%2s %2s %2s %s %2s %2s %s %3s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
						"석차");
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break; // 3번 찾으면 더이상 for문 돌아다닐 필요 없다.
			}

		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < rankArray.length; i++) {
			if (korArray[i] == 80) {
				System.out.printf("%2s %2s %2s %s %2s %2s %s %3s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
						"석차");
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < rankArray.length; i++) {
			if (engArray[i] <= 50) {
				System.out.printf("%2s %2s %2s %s %2s %2s %s %3s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
						"석차");
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		for (int i = 0; i < rankArray.length; i++) {
			if (mathArray[i] >= 70) {
				System.out.printf("%2s %2s %2s %s %2s %2s %s %3s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
						"석차");
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("학점이 D학점이하인 학생모두찾아서 여러명 정보출력");
		for (int i = 0; i < rankArray.length; i++) {
			if (gradeArray[i] == 'D' || gradeArray[i] == 'F') {
				System.out.printf("%2s %2s %2s %s %2s %2s %s %3s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점",
						"석차");
				System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		System.out.println();

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	

		System.out.printf("_________________________학생성적출력________________________________\n");
		System.out.printf("%3s %5s %5s %s %4s %3s %s %4s %4s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("______________________________________________________________________\n");

		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %9s %5d %5d %5d %5d %5.1f %5c %5d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ			
		/*
		 * 정렬 1.오름차순 ex> 1,2,3,4,5.... a,b,c,d,e....,가 ... 힣 asending
		 */

		for (int i = 0; i < noArray.length - 1; i++) {
			for (int j = 0; j < totArray.length -1; j++)
				if (totArray[j] > totArray[j + 1]) {

					// tot 교체
					int tempTot = totArray[j + 1];
					totArray[j + 1] = totArray[j];
					totArray[j] = tempTot;
					
					
					
					// 여기서부터 교체하는 이유는  나중에 학생성적을 출력할 때 총점이 오름차순으로 정리되는 시기에  다른 요소들도 그에 맞는 위치를 찾아가도록 하기 위해서다 
					//no교체
					 int tempNo=noArray[j+1];
					 noArray[j+1]=noArray[j];
					 noArray[j]=tempNo;
					 
					 //name교체
					 String tempName = nameArray[j+1];
					 nameArray[j+1]=nameArray[j];
					 nameArray[j]=tempName;
					 
					 //kor
					 int tempKor = korArray[j+1];
					 korArray[j+1]=korArray[j];
					 korArray[j]=tempKor;
					
					 //eng
					 int tempEng = engArray[j+1];
					 engArray[j+1]=engArray[j];
					 engArray[j]=tempEng;
					 
					 //math
					 int tempMath = mathArray[j+1];
					 mathArray[j+1]=mathArray[j];
					 mathArray[j]=tempMath;
					
					 //avg
					 double tempAvg = avgArray[j+1];
					 avgArray[j+1]= avgArray[j];
					 avgArray[j]=tempAvg;
					
					 //grade
					 char tempGrade = gradeArray[j+1];
					 gradeArray[j+1]= gradeArray[j];
					 gradeArray[j]=tempGrade;
					
					 //rank
					 int tempRank = rankArray[j+1];
					 rankArray[j+1]= rankArray[j];
					 rankArray[j]=tempRank;
					 
				}
		}
		System.out.println("학생 총점을 오름차순으로 정리>>" + Arrays.toString(totArray)); 

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ			

		/*
		 * 2.내림차순 ex> 5,4,3,2,1 desending z,y,x.... , 힣 ... 가
		 */
/*     	
 
		for (int i = 0; i < noArray.length - 1; i++) {
			for (int j = 0; j < totArray.length - 1; j++)
				if (totArray[j] < totArray[j + 1]) {

					// tot 교체
					int tempTot = totArray[j + 1];
					totArray[j + 1] = totArray[j];
					totArray[j] = tempTot;
					 //no교체
					 int tempNo=noArray[j+1];
					 noArray[j+1]=noArray[j];
					 noArray[j]=tempNo;
					 
					 //name교체
					 String tempName = nameArray[j+1];
					 nameArray[j+1]=nameArray[j];
					 nameArray[j]=tempName;
					 
					 //kor
					 int tempKor = korArray[j+1];
					 korArray[j+1]=korArray[j];
					 korArray[j]=tempKor;
					
					 //eng
					 int tempEng = engArray[j+1];
					 engArray[j+1]=engArray[j];
					 engArray[j]=tempEng;
					 
					 //math
					 int tempMath = mathArray[j+1];
					 mathArray[j+1]=mathArray[j];
					 mathArray[j]=tempMath;
					
					 //avg
					 double tempAvg = avgArray[j+1];
					 avgArray[j+1]= avgArray[j];
					 avgArray[j]=tempAvg;
					
					 //grade
					 char tempGrade = gradeArray[j+1];
					 gradeArray[j+1]= gradeArray[j];
					 gradeArray[j]=tempGrade;
					
					 //rank
					 int tempRank = rankArray[j+1];
					 rankArray[j+1]= rankArray[j];
					 rankArray[j]=tempRank;
				}
		}
		*/

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	

		System.out.println(">>>>>>>>>>>>>>>>> 정렬후 <<<<<<<<<<<<<<<<<<<<<<<\n");
		System.out.printf("-----------------학생성적출력-----------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %6.1f %3c %4d\n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);

		}
	}
}
