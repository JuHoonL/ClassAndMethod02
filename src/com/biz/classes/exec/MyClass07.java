package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass07 {

	List<String> stList ;
	
	public MyClass07() {
		stList = new ArrayList();
	}
	
	public void add(String strName, int num) {
		String intNum = ""+num;
		stList.add(strName+":"+intNum);
	}
	
}
