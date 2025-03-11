package in.sp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Magician {
	
	private String trick;
	
	public Magician() {
		
	}
	
	public Magician(String trick) {
		this.trick = trick;
	}

	public void perform() {
		
		System.out.println("magician is doing a magic trick "+trick);
	}
}
