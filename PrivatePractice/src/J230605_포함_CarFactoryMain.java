
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차 공장
		 */
		/*
		Engine porcheEngine = new Engine();// Engine클래스의 객체 만듦
		porcheEngine.getType()
		porcheEngine.cc= 5000;
		
		Car porcheCar = new Car();
		porcheCar.no=1234;
		porcheCar.model="PORCHE";
		porcheCar.engine= porcheEngine;
		
		System.out.println(porcheCar.no + "\t" + porcheCar.model+ "\t" + porcheCar.engine.type + "\t" + porcheCar.engine.cc);
																											//.engine도 Engine클래스의 참조변수라서
		*/
		

		
		Engine porscheEngine=new Engine();
		porscheEngine.setType("A");
		porscheEngine.setCc(5000);
		
		Car porscheCar = new Car();
		porscheCar.setNo(1234);
		porscheCar.setModel("PORCHE");
		porscheCar.setEngine(porscheEngine);
		
		porscheCar.print();
		
		System.out.println("------차량엔진검사------");
		Car gumsaCar = porscheCar;
		Engine returnEngine = gumsaCar.getEngine();
		returnEngine.print();
		
		System.out.println();
		System.out.println();
		Car volvoCar = new Car(5678, "XC90", new Engine("S", 4900));
		volvoCar.print();
		
		
		System.out.println("------차량엔진검사------");
		volvoCar.getEngine().print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
