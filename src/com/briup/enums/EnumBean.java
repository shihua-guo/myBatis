package com.briup.enums;

enum Gender{
	MALE,FEMALE
};
public class EnumBean {
	private int id;
	private Gender gender;
	public EnumBean() {
	}
	public EnumBean(int id, Gender gender) {
		super();
		this.id = id;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "EnumBean [id=" + id + ", gender=" + gender + "]";
	}
	
}
