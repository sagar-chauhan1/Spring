package in.sp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Singer {
	
	private String song;
	
	public Singer() {
		
	}
	
	public Singer(String song) {
		this.song = song;
	}

	public void perform() {
		System.out.println("Singer is singing "+song);
	}
}
