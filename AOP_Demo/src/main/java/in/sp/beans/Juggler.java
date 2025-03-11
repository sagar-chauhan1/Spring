package in.sp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Juggler {
	
	private int jug;
	
	public Juggler() {
		
	}
	
	public Juggler(int jug) {
		this.jug = jug;
	}

	public void perform() {
		System.out.println("juggler is juggling with "+jug +" balls");
	}
	
}
