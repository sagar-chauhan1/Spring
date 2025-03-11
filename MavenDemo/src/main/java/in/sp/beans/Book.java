package in.sp.beans;

import org.springframework.stereotype.Component;

@Component()
public class Book {
	
	private int no;
	private String name;
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("Book No : "+no);
		System.out.println("Book Name : "+name);
	}
	
}
