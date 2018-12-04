package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass02 {

	List<String> stList ;
	
	public MyClass02() {
		stList = new ArrayList();
	}
	
	public void hello(String strName) {
		stList.add(strName);
	}
	
	public void view() {
		int intLen = stList.size();
		for(int i = 0 ; i < intLen ; i ++) {
			System.out.println(stList.get(i));
		}
	}
	
	public void view01() {
		for(String s : stList) {
			System.out.println(s);
		}
	}
	
	
	
}
