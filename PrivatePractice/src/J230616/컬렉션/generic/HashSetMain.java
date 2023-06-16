package generic;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		
		Car car1=new Car("1111", 1);
		Car car2=new Car("2222", 2);
		Car car3=new Car("3333", 3);
		Car car4=new Car("4444", 4);
		Car car5=new Car("5555", 5);
		HashSet<Car> carSet=new HashSet<Car>();
		System.out.println("# set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println("------------- 1.add --------------");
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
		System.out.println("# set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println("------------- 2.add[중복객체] --------------");
		/*
		 * Element의 equals메쏘드를 호출해서 중복을체크한다.
		 */
		boolean isAdd=carSet.add(car3);
		System.out.println("추가여부:"+isAdd);
		System.out.println("# set size:"+carSet.size());//사이즈 그대로 5
		System.out.println(carSet);
		System.out.println("------------- 3.remove(객체) --------------");
		boolean isRemove = carSet.remove(car1);
		System.out.println("삭제여부:"+isRemove);
		System.out.println("# set size:"+carSet.size());
		System.out.println(carSet);
		System.out.println("--------------전체출력-----------------");
		System.out.println("---------------toArray()---------------");
		
		Object[] carObjectArray =carSet.toArray();
		
		 //toArray() 메서드는 HashSet의 모든 요소를 객체 배열로 변환하는 역할을 합니다.
 		 //	호출한 HashSet의 요소들이 객체 배열에 복사되어 반환됩니다.
		//toArray()는 Set인터페이스의 메소드임

		for (int i = 0; i < carObjectArray.length; i++) { // 이건 형변환 생략 못한다?
			Car tempCar = (Car)carObjectArray[i]; 
			tempCar.print();
		}
		 
		System.out.println("---------------enhanced for---------------");
		for (Car car : carSet) { // 이미 제네릭타입에 Car타입으로 지정해서
			car.print();
		}
		
		/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		System.out.println("%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%");
		Iterator<Car> carIterator=carSet.iterator();
		while(carIterator.hasNext()) {
			Car tempCar=carIterator.next();
			tempCar.print();
			//hasNext()는 Iterator 인터페이스의 메서드로, 다음 요소의 존재 여부를 확인하는 역할을 합니다
			//next() 메서드는 Iterator 인터페이스의 메서드로, 다음 요소를 가져옵니다.
			//한마디로 tempCar의 요소를 순차적으로 가져온다는거!!!
		}
	}

}









