package com.briup.many2one;

import java.util.HashSet;
import java.util.Set;

public class OneClz {
	private int id;
	private String name;
	private Set<MStudent> stus = new HashSet<MStudent>();
	public OneClz(){}
	public OneClz(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public OneClz(int id, String name, Set<MStudent> stus) {
		super();
		this.id = id;
		this.name = name;
		this.stus = stus;
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
	public Set<MStudent> getStus() {
		return stus;
	}
	public void setStus(Set<MStudent> stus) {
		this.stus = stus;
	}
	@Override
	public String toString() {
		return "OneClz [id=" + id + ", name=" + name + ", stus=" + stus + "]";
	}
	
}
