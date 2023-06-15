package nogeneric;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map: 키, 값을 가짐
 * 중복된 키 허용하지 않음: Map은 중복된 키를 허용하지 않습니다. 
 * 동일한 키를 여러 번 추가하면 마지막에 추가한 값으로 덮어쓰입니다.
 */

/*
 * HashMap: 해시맵(Hash Map)으로, 키-값 쌍을 해시 테이블에 저장합니다. 
 * 순서를 보장하지 않고, null 값을 허용합니다. O(1)의 평균 시간 복잡도를 가지며,
 *  가장 일반적으로 사용되는 Map 구현체입니다.
 */


/*
 * HashMap의 put() 메서드는 지정된 키-값 쌍을 맵에 추가 또는 갱신하는 역할을 합니다. 
 * 메서드 시그니처는 다음과 같습니다
 * V put(K key, V value)
 */
public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		System.out.println("#map size:" + carMap.size());
		System.out.println(carMap);
		System.out.println("******************************************* 1.put *******************************************");
		Car c1 = new Car("1111",12);
		carMap.put("1111",c1);
		carMap.put("2222",new Car("2222",13));
		carMap.put("3333",new Car("3333",15));
		carMap.put("4444",new Car("4444",16));
		carMap.put("5555",new Car("5555",17));
		System.out.println("#map size:" + carMap.size());
		System.out.println(carMap);

		
		/* HashMap에서 key 값은 equals() 메서드를 사용하여 비교합니다.
		 *
		 * 이유
		 * 		동등성 비교: 객체의 동등성을 판단하기 위해 사용됩니다. 
		 * 					 두 객체가 equals() 메서드를 통해 동등하다고 판단되면, 두 객체는 동일한 값을 갖는 것으로 간주됩니다.
		 *		
		 *		중복 제거:   컬렉션(예: Set, Map)에서 객체를 저장할 때 중복을 제거하기 위해 사용됩니다. 
		 *					 컬렉션은 내부적으로 객체의 equals() 메서드를 호출하여 동등성을 비교하고, 
		 *					 이미 존재하는 객체와 동등한 객체는 추가하지 않습니다.
		 */
		
		carMap.put("3333",new Car("삼삼삼삼", 20)); // carMap은 hashMap 타입
		System.out.println("#map size:" + carMap.size());
		System.out.println(carMap);
		
		System.out.println("******************************************* 2.get(key)*******************************************");
		/*
		 * get() 메서드는 지정된 키에 해당하는 값을 반환하는 역할을 합니다
		 */
		Object getObjectCar = carMap.get("3333"); 
		/*
		 * carMap.get("3333")에서 반환된 값은 Car 객체이지만(정확히는 객체의 주소), 
		 * 						get() 메서드의 반환 타입은 Object!!!!!!!!중요함
		 *  따라서 이 값을 Object 타입으로 저장한 후, 다시 Car 타입으로 형변환해야 합니다.
		 */
		System.out.println(getObjectCar); //nogeneric.Car@7852e922 주소값 나옴
		Car getCar = (Car)getObjectCar;// print메서드는 Car객체에만 있으니까 형변환하는거
		getCar.print(); //getCar는 Car타입이다.
		
		System.out.println("******************************************* 2.remove(key)*******************************************");
		Object removeObjectCar =carMap.remove("3333");
				/* carMap.get("3333")에서 반환된 값은 Car 객체이지만(정확히는 객체의 주소), 
										remove() 메서드의 반환 타입은 Object!!!!!!!!중요함*/ 

		Car removeCar = (Car)removeObjectCar; // Object타입을 다시 Car타입으로 형변환. 이유는 Car타입으로 print()하기 위해서
		removeCar.print();					  
		System.out.println("#map size:" + carMap.size());
		System.out.println(carMap);
		
		
		System.out.println("******************************************* 전체차량출력*******************************************");
		//@@@@@@@@@@@@@@@@@@@@@@@@@@Map을 Set으로 반환하는 메소드가 있다. entrySet();@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		
		Set carEntrySet =carMap.entrySet(); //carMap(HashMap타입)을 Set으로 변환하여 carEntrySet에 저장합니다.
		
		/*entrySet()은 Map 인터페이스에서 제공하는 메서드로, Map의 모든 키-값 쌍(엔트리)을 포함하는 Set을 반환합니다	
		   entrySet() 메서드를 호출하면, Map의 모든 엔트리를 담은 Set 객체가 반환됩니다*/
		
		
		
		/**import java.util.Set;이거 자동추가됌
				
   		자바에서 제공하는 기본 라이브러리 클래스인 Set을 사용하기 위해 필요
		carMap은 HashMap타입
		carMap을 Map에서 Set으로 변형하기위한것
		 Set인터페이스는 Collection인터페이스를 상속받은 인터페이스**/
		
		
		Object[] carObjectEntryArray =carEntrySet.toArray(); // carEntrySet 타입은 Set  
		
		//toArray()메소드는 목록의 요소를 배열로 변환
		// Set 인터페이스의 toArray() 메서드의 반환값은 Object이기 때문에 이렇게 함

		
		for (int i = 0; i < carObjectEntryArray.length; i++) { //carObjectEntryArray의 타입은 Object배열임
			
			Entry carEntry = (Entry)carObjectEntryArray[i]; 		 //배열의 요소는 Object타입이고 Entry타입으로 형변환함
/**
 
 Entry 인터페이스는 Map 인터페이스의 키와 값을 나타내는 인터페이스입니다. 
 Entry 인터페이스는 Map 인터페이스의 EntrySet() 메서드로 얻을 수 있습니다.
 Entry 인터페이스는 다음과 같은 두 가지 메서드를 제공합니다.

getKey() 메서드는 Map 인터페이스의 키를 반환합니다.
getValue() 메서드는 Map 인터페이스의 값을 반환합니다. 		
  			
 **/
			
//원래 carEntry는 hashMap타입이고 Entry인터페이스에 있는 getKey()메서드를 사용해 Map인터페이스의 키를 반환한다.
			
			
			String key =(String)carEntry.getKey();	 		// carEntry의 키 값을 String 타입으로 형변환하여 key에 저장합니다.
			Car car = (Car)carEntry.getValue();	// carEntry의 값(차량 객체)을 Car 타입으로 형변환하여 car에 저장합니다
															//getValue()는 Car객체임
			car.print();
		}

		
		System.out.println("-----------------------------");
		
		for(Object entryObject :carEntrySet) {
			Entry carEntry=(Entry)entryObject;
			String key=(String)carEntry.getKey();
			Car car=(Car)carEntry.getValue();

			car.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
