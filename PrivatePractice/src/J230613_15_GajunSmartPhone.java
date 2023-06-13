
public class GajunSmartPhone implements GajunVolume, GajunOnOff{

	@Override
	public void on() {
			System.out.println("GajunSmartPhone.on()");
		
	}

	@Override
	public void off() {
		System.out.println("GajunSmartPhone.off()");	
		
	}

	@Override
	public void up() {
		System.out.println("GajunSmartPhone.up()");
		
	}

	@Override
	public void down() {
		System.out.println("GajunSmartPhone.down()");
		
	}
	
}
