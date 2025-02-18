package in.sp.spring;

public class Student {
	
	private int  id;
	private String name;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void show() {
		System.out.println("StudId :"+id);
		System.out.println("StudName :"+name);
		System.out.println("StudEmail :"+email);
	}
	
}
