package structural.adapter_pattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}