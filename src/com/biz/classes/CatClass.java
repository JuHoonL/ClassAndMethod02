package com.biz.classes;

public class CatClass {
	
	//매개변수가 있는 생성자를 만들었을 때는 기본생성자도 따로 만들어줘야 함(매개변수있는 생성자 없을 시 필요없음)
	public CatClass() {
	}
	
	public CatClass(String name) {
		System.out.println(name + "를 따라해보자 묭묭묭");
	}
}
