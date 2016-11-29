package com.briup.one2one;

public class Hus {
	private int id;
	private String name;
	public Hus(){}
	public Hus(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hus [id=" + id + ", name=" + name + "]";
	}
	
}
