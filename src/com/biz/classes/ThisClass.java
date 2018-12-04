package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class ThisClass {

	List<String> stList;
	
	public  ThisClass() {
//		this.stList = new ArrayList();
//		stList.add("몽이");
		this("몽이"); 	//아래의 자기자신의 매개변수가 있는 메소드를 호출할 때의 명령어 this(문자열변수);
	}
	
	public  ThisClass(String strname) {
//		this.stList = new ArrayList();
//		stList.add(strname);
		this("name", 12);
	}
	
	public ThisClass(String strname, int age) {
		this.stList = new ArrayList();
		stList.add(strname);
	}
}
