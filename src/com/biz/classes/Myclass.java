package com.biz.classes;

public class Myclass {

	public Myclass(){ 	// 생성하지 않아도 자동으로 생성되는 메소드
		System.out.println("빈생성자");
	}
	
	public Myclass(String s) {
		System.out.println(s + " 공부좀 그만해");
	}
	
	public void hello() {
		System.out.println("안녕~종환이 지각");
	}
	
	public void hello(String name) {
		System.out.println(name + "이(가) 말한다. 응~종환이 지각");
	}
}
