package com.briup.dynamic;

import java.util.Date;

public class S_Emp {
	private int id;
	private String last_name;
	private String first_name;
	private int user_id;
	private Date start_date;
	private String comments;
	private int manager_id;
	private String title;
	private int dept_id;
	private double salary;
	private double commission_pct;
	public S_Emp(){}
	public S_Emp(int id, String last_name, String first_name, int user_id, Date start_date, String comments,
			int manager_id, String title, int dept_id, double salary, double commission_pct) {
		this.id = id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.user_id = user_id;
		this.start_date = start_date;
		this.comments = comments;
		this.manager_id = manager_id;
		this.title = title;
		this.dept_id = dept_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(double commission_pct) {
		this.commission_pct = commission_pct;
	}
	@Override
	public String toString() {
		return "S_Emp [id=" + id + ", last_name=" + last_name + ", first_name=" + first_name + ", user_id=" + user_id
				+ ", start_date=" + start_date + ", comments=" + comments + ", manager_id=" + manager_id + ", title="
				+ title + ", dept_id=" + dept_id + ", salary=" + salary + ", commission_pct=" + commission_pct + "]";
	}
	
}
