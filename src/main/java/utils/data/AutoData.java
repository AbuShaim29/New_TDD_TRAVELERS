package utils.data;

public class AutoData {

	private String zip;
	private String firstName;
	private String lastName;
	private String address;
	private String dobMonth;
	private String dobDay;
	private String dobYear;
	
	public AutoData(String zip,String firstName,String lastName,String address,String dobMonth,String dobDay,String dobYear) {
	this.zip = zip;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.dobMonth = dobMonth;
	this.dobDay = dobDay;
	this.dobYear = dobYear;
	}
	
	public String getZip() {
		return zip;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getDobMonth() {
		return dobMonth;
	}

	public String getDobDay() {
		return dobDay;
	}

	public String getDobYear() {
		return dobYear;
	}
	
}
