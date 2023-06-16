package com.itwill06.collection.student;
//		System.out.println("----------------1. add[맨마지막 index에 객체 저장]------------------");

//		System.out.println("----------------2. add(index,element)[지정된 index에 객체 저장]------------------");
//		System.out.println("----------------3. set(index,element)[지정된 index에 객체 저장]------------------");
//		System.out.println("----------------4. get(index,element)[지정된 index에 객체의 참조변수 반환]------------------");
//		System.out.println("----------------5. remove(index)[지정된 index에 객체 삭제]------------------");

import java.util.ArrayList;

public class StudentArrayListMain {

	public static void main(String[] args) {
		/*
		 * 0.학생ArrayList객체생성초기화
		 */
		ArrayList studentList = new ArrayList();
		studentList.add(new Student(1, "KIM", 89, 93, 94));
		studentList.add(new Student(2, "HIM", 88, 77, 98));
		studentList.add(new Student(3, "AIM", 65, 87, 99));
		studentList.add(new Student(4, "KIM", 75, 97, 60));
		studentList.add(new Student(5, "KIM", 85, 98, 90));
		studentList.add(new Student(6, "TIM", 95, 88, 77));
		studentList.add(new Student(7, "KIM", 99, 93, 95));
		studentList.add(new Student(8, "LIM", 83, 80, 99));
		studentList.add(new Student(9, "QIM", 73, 90, 80));
		/*
		 * 0.학생두명추가
		 */
		System.out.println("0.학생두명추가");
		studentList.add(new Student(10, "JANG", 85, 86, 87));
		studentList.add(new Student(11, "KANG", 80, 82, 84));
		for (int i = 0; i < studentList.size(); i++) {
			Student stu = (Student) studentList.get(i);
			stu.print();
		}

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");

		// 총점
		int allTot = 0;
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);// @@@@@@ ArrayList는 객체의 참조변수 반환할 때 [i]가 아니라 get()을 써야해@@@@@@@@@@
			str.calculateTotal();// Student클래스에 멤버변수인 과목 값들을 다 더해서 총점을 구하는 메소드가 있다.
			str.calculateAvg();
			str.calculateGrade();

		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.size(); j++) {
				if ((((Student) studentList.get(i)).getTot()) < (((Student) studentList.get(j)).getTot())) {
					((Student) studentList.get(i)).increaseRank();
					Student str = (Student) studentList.get(i);
				}
				// 일단 studentList.get()도 Student로 형변환해야되고
				// .getTot()를 쓸 떄도 ()로 감싸줘야한다. getTot()함수 자체가 Student객체가 사용할 수 있기 때문이다.
			}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 (enhanced for)");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		Student.headerPrint();
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getNo() == 3) {
				str.print();
				break;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getGrade() == 'A') {
				str.print();
			}
		}
		System.out.println();
		System.out.println();

		/*
		 * 6.이름이 KIM인학생들 출력
		 */
		System.out.println("6.이름이 KIM인학생들 출력");

		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getName().equals("KIM")) {
				str.print();
			}
		}
		System.out.println();
		System.out.println();

		/*
		 * 7.번호3번학생한명삭제
		 */
		System.out.println("7.번호3번학생삭제");

		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getNo() == 3) {
				studentList.remove(i);
				break;
			}
		}

		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}

		System.out.println();
		System.out.println();

		/*
		 * 8.이름KIM인 학생들삭제
		 */
		System.out.println("8.이름KIM인 학생들삭제");

		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getName().equals("KIM")) {
				studentList.remove(i);
			}

		}
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}
		System.out.println();
		System.out.println();

		/*
		 * 9.평점 F 인 학생들삭제
		 */
		System.out.println("9.평점 F 인 학생들삭제");
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			if (str.getGrade() == 'F') {
				studentList.remove(i);
			}
		}
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}
		System.out.println();
		System.out.println();

		/****************** 안해도됨 ******************************/
		/*
		 * 10. 학생총점으로 오름차순정렬
		 */

		for (int i = 0; i < studentList.size() - 1; i++) {
			for (int j = 0; j < studentList.size() - i - 1; j++) {
				Student studentA = (Student) studentList.get(j);
				Student studentB = (Student) studentList.get(j + 1);
				if (studentA.getTot() > studentB.getTot()) {// i가 총점이 더 크면 바꿔야지
					Object temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);

				}

			}

		}
		
		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		/*
		 * 11. 학생이름순으로 오름차순정렬
		 */
		for (int i = 0; i < studentList.size() - 1; i++) {
			for (int j = 0; j < studentList.size() - i - 1; j++) {
				Student studentA = (Student) studentList.get(j);
				Student studentB = (Student) studentList.get(j + 1);
				if (studentA.getName().compareTo(studentB.getName()) > 0) {// i가 총점이 더 크면 바꿔야지
					Object temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);

				}

			}

		}

		for (int i = 0; i < studentList.size(); i++) {
			Student str = (Student) studentList.get(i);
			str.print();
		}
		/********************************************************/
	}
}
