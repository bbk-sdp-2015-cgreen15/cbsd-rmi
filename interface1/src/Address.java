package interface1;

import java.io.Serializable;

public class Address implements Serializable {
	
	public String street;
	private int zip;

	public Address(String street, int zip) {
		this.street = street;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}