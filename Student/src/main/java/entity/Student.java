package entity;

import java.util.Date;

public class Student {
	private String id ;
	private String name ;
	private int status ;
	private boolean bit ;
	private Date birthday;
	
	public Student() {
		super();
	}

	public Student(String id, String name, int status, boolean bit, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.bit = bit;
		this.birthday = birthday;
	}

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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isBit() {
		return bit;
	}

	public void setBit(boolean bit) {
		this.bit = bit;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}	
