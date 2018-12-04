package com.biz.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class MyClass04 {

	int intSum = 0 ;
	List<Integer> intList ;
	
	public MyClass04() {
		intList = new ArrayList();
	}
	
	public void add(int intN) {
		intList.add(intN);
	}
	
	public void sum() {
		int intLen = intList.size();
		int intSum = 0;
		for(int i = 0 ; i < intLen ; i ++) {
			intSum += intList.get(i);
		}
		System.out.println(intSum);
	}
}
