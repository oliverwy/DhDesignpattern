package ch15_abstractfactorypattern.databaseportable;

import java.util.Date;

public class Student {
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBithday() {
		return bithday;
	}
	public void setBithday(Date bithday) {
		this.bithday = bithday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMoblieno() {
		return moblieno;
	}
	public void setMoblieno(String moblieno) {
		this.moblieno = moblieno;
	}
	
	private String id;
	private String name;
	private Date  bithday;
	private String address;
	private String moblieno;
	

}
