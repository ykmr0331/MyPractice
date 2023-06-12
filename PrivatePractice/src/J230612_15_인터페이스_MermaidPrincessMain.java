
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("-----------MermaidPrincess-------------");
		MermaidPrincess mp = new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.liveSea();
		mp.fastSwim();
		System.out.println("-----------Mermaid-------------");
		Mermaid m = mp;
		/*
		mp.speak(); // Princess객체에만 있는거라서 타입때문에 안됌
		mp.think(); // Princess객체에만 있는거라서 타입때문에 안됌
		*/
		mp.liveSea();
		mp.fastSwim();
	
		System.out.println("-----------Princess-------------");
		Princess p = mp;
		mp.speak();
		mp.think();
		/*
		mp.liveSea();  // Mermaid객체에만 있는거라서 타입때문에 안됌
		mp.fastSwim(); // Mermaid객체에만 있는거라서 타입때문에 안됌
		*/
		
		System.out.println("-----------Mermaid <-->Princess-------------");
		Mermaid m2 = new MermaidPrincess();

		m2.liveSea();
		m2.fastSwim();
		
		Princess p2 = (Princess)m2;
		p2.speak();
		p2.think();
		System.out.println("-----------Object-------------");
		/*
		Object o = new MermaidPrincess();
		o.speak();
		o.think();
		o.liveSea();
		o.fastSwim();

	 	*/
	}

}
