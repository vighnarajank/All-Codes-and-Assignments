package com.onebill.corejava.set;

public class TreeSetPerson {
	int id;
	String pname;
	public TreeSetPerson(int id, String name) {
		super();
		this.id = id;
		this.pname = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return pname;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + pname + "]";
	}
	public void setName(String name) {
		this.pname = name;
	}
}
