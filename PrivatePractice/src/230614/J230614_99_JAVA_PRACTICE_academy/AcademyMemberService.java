package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {// 생성자
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (int i = 0; i < members.length; i++) {
			members[i].print();
			;
		}

	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘 //다시
	 */

	public AcademyMember referVarNo() {
		AcademyMember referVar = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == 1) {
				referVar = members[i];
			}
		}
		return referVar;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember referVarName() {
		AcademyMember referVar = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals("KIM")) {
				referVar = members[i];
			}
		}
		return referVar;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */

	public AcademyMember[] referVarStudent() {/*
												 * 배열객체 먼저 for문으로 크기 구하고 그다음에 for문으로조건충족개체가 배열로 들어가도록한다.
												 */
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			count++;
		}
		AcademyMember[] academyMember = new AcademyMember[count];

		for (int i = 0; i < academyMember.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				academyMember[i] = members[i];
			}
		}

		return academyMember;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */

	public AcademyMember[] referVarStaff() {/*
											 * 배열객체 먼저 for문으로 크기 구하고 그다음에 for문으로조건충족개체가 배열로 들어가도록한다.
											 */
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			count++;
		}
		AcademyMember[] academyMember = new AcademyMember[count];

		for (int i = 0; i < academyMember.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				academyMember[i] = members[i];
			}
		}

		return academyMember;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */

	public AcademyMember[] referVarGangsa() {/*
												 * 배열객체 먼저 for문으로 크기 구하고 그다음에 for문으로조건충족개체가 배열로 들어가도록한다.
												 */
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			count++;
		}
		AcademyMember[] academyMember = new AcademyMember[count];

		for (int i = 0; i < academyMember.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				academyMember[i] = members[i];
			}
		}

		return academyMember;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/* 4.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘 */

	public AcademyMember[] referVarJavaStudent() {/*
													 * 배열객체 먼저 for문으로 크기 구하고 그다음에 for문으로조건충족개체가 배열로 들어가도록한다.
													 */
		int count = 0;

		for (int i = 0; i < members.length; i++) {
			if ((members[i] instanceof AcademyStudent) && (members[i].getClass().equals("자바"))) {
				count++;

			}
		}

		// 학생객체수만큼의 숫자가 count에 들어감
		AcademyMember[] academyMember = new AcademyMember[count];

		for (int i = 0; i < academyMember.length; i++) {
			if ((members[i] instanceof AcademyStudent) && (members[i].getClass().equals("자바"))) {
				academyMember[i] = members[i];
			}

		}
		return academyMember;
	}


	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	/* 4.AcademyMember 중에서 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘 */

	public AcademyMember[] referVarJavaStaff() {

		 // 일단 멤버 중에서 staff가 몇명인지를 구해야돼
		int count = 0; // 2가나옴
		
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		//count수 만큼의 크기를 가진  AcademyStaff배열객체를 만든다.
		AcademyStaff[] academyStaff = new AcademyStaff[count];//count는 마지막은 2다.
		

		// members의 개수와 academyStaff의 개수가 다르므로 새로운 integer변수를 만들어
		int count2 = 0;//마지막은 2다.
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				
				//그다음에 멤버중에서 staff인 애들을 형변환한다.
				//그다음에 형변환한 staff객체를 academyStaff배열객체에 넣어
				academyStaff[count2] =(AcademyStaff)members[i];
				count2++;

			}
		}

		
		//이제 staff배열객체에서 영업부서 요소를 뽑아내서 새로운 배열객체에 넣는 작업이다.
		int count3 = 0;//1이 나와야함

		for (int i = 0; i < academyStaff.length; i++) {
			if (academyStaff[i].getDepart().equals("영업")) {
				//academyStaff배열객체에서 영업부소 요소의 수가 얼마인지 알아낸다.
				count3++;
			}
		}

		//count3의 수 만큼의 크기를 가진  AcademyYoungupStaff배열객체를 만든다.
		AcademyStaff[] academyYoungupStaff = new AcademyStaff[count3];//count3은 마지막은 1이다.

		// academyStaff(staff)의 개수와 academyYoungupStaff(영업staff)의 개수가 다르므로 새로운 integer변수를 만들어
		int count4 = 0; //1이 나온다.(영업 스태프의 수)
		for (int i = 0; i < academyStaff.length; i++) {
			if (academyStaff[i].getDepart().equals("영업")) {//staff수는 2명

				academyYoungupStaff[count4] =academyStaff[i]; // 영업staff수는 1명
				count4++;

			}
		}
		return academyYoungupStaff;
	}

	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	/* 4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘 */

	public AcademyMember[] referVarJavaGangsa() {

		 // 일단 멤버 중에서 Gangsa가 몇명인지를 구해야돼
		int count = 0; // 3이나옴
		
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		//count수 만큼의 크기를 가진  AcademyStaff배열객체를 만든다.
		AcademyGangsa[] academyGangsa = new AcademyGangsa[count];//count는 마지막은 3이다.
		

		// members의 개수와 academyGangsa의 개수가 다르므로 새로운 integer변수를 만들어
		int count2 = 0;//마지막은 3이다.
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				
				//그다음에 멤버중에서 Gangsa인 애들을 형변환한다.
				//그다음에 형변환한 Gangsa객체를 academyGangsa배열객체에 넣어
				academyGangsa[count2] =(AcademyGangsa)members[i];
				count2++;//마지막은 3이다.

			}
		}

		
		//이제 Gangsa배열객체에서 자바과목 요소를 뽑아내서 새로운 배열객체에 넣는 작업이다.
		int count3 = 0;//0이 나와야함. 강사들 중 자바는 없다.

		for (int i = 0; i < academyGangsa.length; i++) {
			if (academyGangsa[i].getSubject().equals("자바")) {
				//academyStaff배열객체에서 영업부소 요소의 수가 얼마인지 알아낸다.
				count3++;//0이 나와야함. 강사들 중 자바는 없다.
			}
		}

		//count3의 수 만큼의 크기를 가진  AcademyYoungupStaff배열객체를 만든다.
		AcademyGangsa[] academyJavaGangsa = new AcademyGangsa[count3];//count3은 마지막은 1이다.

		// academyStaff(staff)의 개수와 academyYoungupStaff(영업staff)의 개수가 다르므로 새로운 integer변수를 만들어
		int count4 = 0; //1이 나온다.(영업 스태프의 수)
		for (int i = 0; i < academyGangsa.length; i++) {
			if (academyGangsa[i].getSubject().equals("자바")) {//Gangsa수는 3명

				academyJavaGangsa[count4] =academyGangsa[i]; // 자바과목은 0명
				count4++;

			}
		}
		return academyJavaGangsa;
	}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	



	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	 

}