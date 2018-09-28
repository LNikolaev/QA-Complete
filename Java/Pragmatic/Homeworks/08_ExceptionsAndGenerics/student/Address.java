package student;

public class Address {
	private String city;
	private String strName;
	private int strNumber;

	public Address(String city, String strName, int strNumber) {
		this.city = city;
		this.strName = strName;
		this.strNumber = strNumber;
	}

	public String getCity() {
		return city;
	}
	
	public String getStrName() {
		return strName;
	}

	public int getStrNumber() {
		return strNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", strName=" + strName + ", strNumber=" + strNumber + "]";
	}

	
}
