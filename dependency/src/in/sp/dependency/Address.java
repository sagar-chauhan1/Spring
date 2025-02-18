package in.sp.dependency;

public class Address {
	
	private int house;
	private String city;
	private String pincode;
	
	public void setHouse(int house) {
		this.house = house;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [house=" + house + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
