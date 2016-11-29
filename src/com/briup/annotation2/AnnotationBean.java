package com.briup.annotation2;

public class AnnotationBean {
	private int id;
	private String name;
	public AnnotationBean() {
	}
	public AnnotationBean(int id, String name) {
		super();
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
		return "AutoBean [id=" + id + ", name=" + name + "]";
	}
	
}
