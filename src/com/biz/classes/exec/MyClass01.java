package com.biz.classes.exec;

public class MyClass01 {

	private String strName ;
	
	public MyClass01() {
		strName = "";
	}
	
	public MyClass01(String strName) {
		this.strName = strName;
	}
	
	public void hello() {
		System.out.println(strName + "이 최선입니까?");
	}
}
