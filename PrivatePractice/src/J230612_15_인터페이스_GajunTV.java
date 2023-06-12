
public class GajunTV implements GajunOnOff, GajunVolume { // 인터페이스의 추상메소드를 재정의해야!!!!
	public void operation1() {
		System.out.println("TV.operation1()");
	}

	@Override
	public void up() {
		System.out.println("TV.up()");
		
	}

	@Override
	public void down() {
		System.out.println("TV.down()");
		
	}

	@Override
	public void on() {
		System.out.println("TV.on()");
		
	}

	@Override
	public void off() {
		System.out.println("TV.off()");
		
	}
	
}
