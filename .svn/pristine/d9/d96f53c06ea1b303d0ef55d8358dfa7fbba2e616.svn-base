package com.briup.many2many;

import java.util.HashSet;
import java.util.Set;

public class MUser {
	private int id;
	private String name;
	private Set<MRole> roles = new HashSet<MRole>();
	public MUser(){}
	public MUser(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public MUser(int id, String name, Set<MRole> roles) {
		super();
		this.id = id;
		this.name = name;
		this.roles = roles;
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
	public Set<MRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<MRole> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "MUser [id=" + id + ", name=" + name + ", roles=" + roles + "]";
	}
	
	
}
