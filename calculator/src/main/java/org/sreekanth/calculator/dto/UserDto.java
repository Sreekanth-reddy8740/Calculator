package org.sreekanth.calculator.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private long altkey;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String phoneNumber;
	
	private String city;
	
	private String pincode;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincod() {
		return pincode;
	}

	public void setPincod(String pincode) {
		this.pincode = pincode;
	}
	
}
