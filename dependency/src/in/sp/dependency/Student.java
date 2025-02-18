package in.sp.dependency;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("StudId : "+id);
		System.out.println("StudName : "+name);
		System.out.println("StudAddress : "+address);
	}
	
}
