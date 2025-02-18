package in.sp.dependency;

public class Address {
	
	private int house;
	private String city;
	private int pincode;
	
	public Address(int house, String city, int pincode) {
		this.house = house;
		this.city = city;
		this.pincode = pincode;
	}
	
	public Address() {
		
	}

	@Override
	public String toString() {
		return "Address [house=" + house + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
