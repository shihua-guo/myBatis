package com.briup.many2many;

import java.util.HashSet;
import java.util.Set;

public class MRole {
	private int id;
	private String name;
	private Set<MUser> users = new HashSet<MUser>(); 
	public MRole(){}
	public MRole(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public MRole(int id, String name, Set<MUser> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
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
	public Set<MUser> getUsers() {
		return users;
	}
	public void setUsers(Set<MUser> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "MRole [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
	
}
