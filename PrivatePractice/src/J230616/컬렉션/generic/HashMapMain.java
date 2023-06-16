package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap<String,Car> carMap=new HashMap<String,Car>();
		
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("**************** 1.put *************");
		Car c1=new Car("1111",12);
		Car putCar=carMap.put("1111", c1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 16));
		carMap.put("5555", new Car("5555", 17));
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		/*
		 * 키값은 중복허용안함.
		 */
		carMap.put("3333", new Car("삼삼삼삼", 20));
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		
		System.out.println("************** 2.get(key) **********");
		Car getCar = carMap.get("3333");
		getCar.print();
		
		System.out.println("************** 3.remove(key) **********");
		Car removeCar=carMap.remove("3333");
		removeCar.print();
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("**********전체차량출력***********");
		
		Set<Entry<String,Car>> carEntrySet=carMap.entrySet();
		/*
		Object[] carObjectEntryArray = carEntrySet.toArray();
		for (int i=0;i<carObjectEntryArray.length;i++) {
			Entry carEntry=(Entry)carObjectEntryArray[i];
			String key=(String)carEntry.getKey();
			Car car=(Car)carEntry.getValue();
			car.print();
		}
		*/
		System.out.println("---------------------");
		for(Entry<String,Car> carEntry :carEntrySet) {
			String key=carEntry.getKey();
			Car car=carEntry.getValue();
			System.out.println("key="+key);
			car.print();
		}
		
		/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		System.out.println("%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%");
		Set<Entry<String,Car>> carEntrySet2=carMap.entrySet();
		Iterator<Entry<String, Car>> carEntryIterator=carEntrySet2.iterator();
		while(carEntryIterator.hasNext()) {
			Entry<String,Car> carEntry=carEntryIterator.next();
			String key = carEntry.getKey();
			Car car=carEntry.getValue();
			System.out.println("key="+key);
			car.print();
		}
		System.out.println("--------- key set ----------");
		Set<String> keySet=carMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			System.out.println("key="+key);
			Car car=carMap.get(key);
			car.print();
		}
	}

}








