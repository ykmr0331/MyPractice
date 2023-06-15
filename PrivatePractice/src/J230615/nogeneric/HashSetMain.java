package nogeneric;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		Car car1 = new Car("1111", 1);
		Car car2 = new Car("2222", 2);
		Car car3 = new Car("3333", 3);
		Car car4 = new Car("4444", 4);
		Car car5 = new Car("5555", 5);
		
		HashSet carSet = new HashSet();
		System.out.println("#set size: " + carSet.size());
		System.out.println(carSet); //[ ~~ ] 이런 형태가 나옴
		System.out.println("--------------------1.add-----------------------");
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
		System.out.println("#set size: " + carSet.size());	
		System.out.println(carSet);
		System.out.println("--------------------2.add[중복객체]-----------------------");
		
		/*
		 * Element의 equals메소드를 호출해서 중복을 체크한다. //String 객체의 동등성 비교는 equals() 메서드를 사용하여 수행된다.
		 */
		boolean isAdd = carSet.add(car3);
		System.out.println("추가여부: " + isAdd);
		carSet.add(car3); //지금 중복인거 넣었어
		System.out.println("#set size: " + carSet.size());	//사이즈 그대로 5
		System.out.println(carSet);//[~~ ]내용 그대로임
	
		System.out.println("--------------------3.remove[객체]-----------------------");
		boolean isRemove =carSet.remove(car1);
		System.out.println("삭제여부: " + isRemove); 
		System.out.println("#set size: " + carSet.size());	
		System.out.println(carSet);
	
		System.out.println("--------------------전체출력----------------------");
		System.out.println("--------------------toArray()----------------------");
		/*
		Object[] carObjectArray =carSet.toArray();
		
		 *toArray() 메서드는 HashSet의 모든 요소를 객체 배열로 변환하는 역할을 합니다.
 		 *	호출한 HashSet의 요소들이 객체 배열에 복사되어 반환됩니다.
		
		for (int i = 0; i < carObjectArray.length; i++) {
			Car tempCar = (Car)carObjectArray[i]; 
			tempCar.print();
		}
		 */
		System.out.println("-------------------enhance for---------------------");
		for (Object carObject : carSet) {
			Car tempCar = (Car)carObject;
			tempCar.print();
		}
		
	}

}
