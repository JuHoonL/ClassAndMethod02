package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass06 {

	List<String> intList ;
	
	public MyClass06() {
		intList = new ArrayList();
	}
	
	public void add(int intNum) {
		intList.add(""+intNum);
	}
	
	public int intList() {
		int intSum = 0;
		int intLen = intList.size();
		for(int i = 0 ; i < intLen ; i ++) {
			int Num = Integer.valueOf(intList.get(i));
			intSum += Num;
		}
		return intSum;
	}
}
