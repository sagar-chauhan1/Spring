package autoWiring_Anno;

public class Address {
	
	private int house;
	private String city;
	private int pincode;
	
//	public int getHouse() {
//		return house;
//	}
	public void setHouse(int house) {
		this.house = house;
	}
//	public String getCity() {
//		return city;
//	}
	public void setCity(String city) {
		this.city = city;
	}
//	public int getPincode() {
//		return pincode;
//	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [house=" + house + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
