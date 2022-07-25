package com.pp;

public class Customerdouble {
private int id;
private String name;
private char gender;
public Customerdouble(int id, String name, char gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public int getID() {
	return id;
}
public String name() {
return name;
}
public char gender() {
	return gender;
}
@Override
	public String toString() {
		return  "Id= "+id+" name= "+name+" ";
	}
}

