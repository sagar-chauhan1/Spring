package autoWiring_Anno;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	private Address address;
	@Autowired
	private Subjects subjects;
	
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void show() {
		System.out.println("StudId : "+id);
		System.out.println("StudName : "+name);
		System.out.println("StudAddress : "+address);
		System.out.println("StudSubjects : "+subjects);
	}
}
