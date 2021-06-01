package com.onebill.corejava.assignment9;

public class StudentClass implements Comparable<StudentClass> {
	int id;
	String name;
	int marks;
	
	public StudentClass(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "\n(id=" + id + ", name=" + name + ", marks=" + marks + ")\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
	    if (!(obj instanceof StudentClass))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getId() == ((StudentClass) obj).getId();
		
	}
	@Override
	public int hashCode() {
	    return id;
	}

	@Override
	public int compareTo(StudentClass o) {
		
		return this.id-o.id;
	}
	
}
