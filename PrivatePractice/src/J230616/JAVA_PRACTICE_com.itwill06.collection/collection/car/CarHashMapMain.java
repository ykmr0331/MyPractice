package com.itwill06.collection.car;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CarHashMapMain {

	public static void main(String[] args) {
		Car c1 = new Car("2344",3 );
		Car c2 = new Car("4566",4 );
		Car c3 = new Car("4567",5 );
		Car c4 = new Car("2389",6 );
		Car c5 = new Car("3908",7 );
		Car c6=  new Car("7891",8 );
		Car c7 = new Car("5656",9 );
		Car c8 = new Car("7789",10 );
		Car c9 = new Car("4690",11 );
		/*
		 * 0.Car HashMap 객체생성 초기화
		 */
		HashMap carMap=new HashMap();		
		System.out.println("1.입차 9대");
		/*
		 * 1.차량객체생성
		 * 2.carMap저장
		 */
		carMap.put(c1.getNo(), c1);
		carMap.put(c2.getNo(), c2);
		carMap.put(c3.getNo(), c3);
		carMap.put(c4.getNo(), c4);
		carMap.put(c5.getNo(), c5);
		carMap.put(c6.getNo(), c6);
		carMap.put(c7.getNo(), c7);
		carMap.put(c8.getNo(), c8);
		carMap.put(c9.getNo(), c9);
		System.out.println(carMap);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	
		System.out.println("2.차량번호 7789번  차한대 정보출력");
		Car carPrint =(Car)carMap.get("7789");
		carPrint.print();

		 
		System.out.println();
		System.out.println();
		System.out.println();
		


		System.out.println("3.입차시간 8시이후 차량여러대 찾아서 정보출력");
		Set carSet = carMap.entrySet(); // hashMap타입인 carMAp을 Set타입으로 형변환한다.
										//hashMap클래스에 있는 entrySet()메소드를 사용해서
		Object[] carObj =	carSet.toArray();	//toArray메소드는 Set을 Object배열타입으로 변환하는 메소드다.
//		Entry carEntry = (Entry)carObj;   carObj는 배열의 요소가 아니라 배열이다. 그래서 안돼
		
		for (int i = 0; i < carObj.length; i++) {
											//carObj의 요소 객체는 근본적으로 HashMap타입 객체다. 
											//HashMap의 요소는 Entry 객체(키와 값을 가진)이다.
//			Car carRealType =(Car)carObj[i];//따라서 hashMap의 Entry객체를 Car객체로 형변환하면 키와 값 못가져와
			Entry carEntry = (Entry)carObj[i];//그래서 Object배열의 요소인 Object객체를 Entry타입으로 형변환해야함
			String key=(String)carEntry.getKey();  // carEntry의 키 값을 String 타입으로 형변환하여 key에 저장합니다.
			Car car=(Car)carEntry.getValue();     // carEntry의 값(차량 객체)을 Car 타입으로 형변환하여 car에 저장합니다  
			if(car.getInTime() > 8) {
				car.print();
			}
		}

		System.out.println("4.2389번차량 12시 출차");

		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 2389번차량 주차장에서 차량삭제
		 */
		Car.headerPrint(); 						//이따가 영수증 출력할 떄 영수증 상단 제목	
		for (int i = 0; i < carObj.length; i++) {
												//carObj의 요소 객체는 근본적으로 HashMap타입 객체다. 
												//HashMap의 요소는 Entry 객체(키와 값을 가진)이다.
			//Car carRealType =(Car)carObj[i];//따라서 hashMap의 Entry객체를 Car객체로 형변환하면 키와 값 못가져와
			Entry carEntry = (Entry)carObj[i];//그래서 Object배열의 요소인 Object객체를 Entry타입으로 형변환해야함
			String key=(String)carEntry.getKey();  // carEntry의 키 값을 String 타입으로 형변환하여 key에 저장합니다.
			Car car=(Car)carEntry.getValue();     // carEntry의 값(차량 객체)을 Car 타입으로 형변환하여 car에 저장합니다  
				
			if(car.getNo().equals("2389")) {
				car.setOutTime(12);				//2389번 차량 출차
				car.print();					//출차한 2389번 차량의 영수증출력
				break;
			}
	
		}	
		carMap.put("2389",null);		//출차한 2389번 차량을 hashMap단위에서 제거한다.
		
		Car.headerPrint(); 						//이따가 영수증 출력할 떄 영수증 상단 제목	
		for (int i = 0; i < carObj.length; i++) {
						//carObj의 요소 객체는 근본적으로 HashMap타입 객체다. 
						//HashMap의 요소는 Entry 객체(키와 값을 가진)이다.
			//Car carRealType =(Car)carObj[i];//따라서 hashMap의 Entry객체를 Car객체로 형변환하면 키와 값 못가져와
			Entry carEntry = (Entry)carObj[i];//그래서 Object배열의 요소인 Object객체를 Entry타입으로 형변환해야함
			String key=(String)carEntry.getKey();  // carEntry의 키 값을 String 타입으로 형변환하여 key에 저장합니다.
			Car car=(Car)carEntry.getValue();     // carEntry의 값(차량 객체)을 Car 타입으로 형변환하여 car에 저장합니다  
			if(car!=null) {
			car.print();
			}
		
		}
		
		
		
		
		
		//carMap을 새롭게 정의하고 다시 바꿔서 출력해보자

		System.out.println("5. 2389번차량 출차후전체 차량출력");


	}

}
