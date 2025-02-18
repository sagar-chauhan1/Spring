package in.sp.dependency;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		
	}
	
	public void show() {
		System.out.println("StudId : "+id);
		System.out.println("StudName : "+name);
		System.out.println("StudAddress : "+address);
	}
}
