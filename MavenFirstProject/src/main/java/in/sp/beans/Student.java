package in.sp.beans;

public class Student {
	
	private int id;
	private String name;
	private double mark;
	
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
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public void show() {
		System.out.println("StudId : "+id);
		System.out.println("StudName : "+name);
		System.out.println("StudMark : "+mark);
	}
}
