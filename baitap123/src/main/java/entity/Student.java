package entity;

import java.util.Date;

public class Student {
	private int stuId;
	private String fullName;
	private boolean gender;
	private Date birthday;
	private String address;
	private String className;
	private Double scholarShip;

	public Student() {
		super();
	}

	public Student(int stuId, String fullName, boolean gender, Date birthday, String address, String className,
			Double scholarShip) {
		super();
		this.stuId = stuId;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.className = className;
		this.scholarShip = scholarShip;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", fullName=" + fullName + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + ", className=" + className + ", scholarShip=" + scholarShip + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Double getScholarShip() {
		return scholarShip;
	}

	public void setScholarShip(Double scholarShip) {
		this.scholarShip = scholarShip;
	}
	
}
