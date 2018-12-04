package com.biz.classes.exec;

public class MyClass03 {

	private String strName ;
	private int intAge ;
	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public int getIntAge() {
		return intAge;
	}

	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}

	public MyClass03() {
		this("몽이");
	}
	
	public MyClass03(String strName) {
		this(strName, 14);
	}
	
	public MyClass03(String strName, int intAge) {
		this.strName = strName;
		this.intAge = intAge;
	}
}
