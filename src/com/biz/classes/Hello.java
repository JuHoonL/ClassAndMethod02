package com.biz.classes;

public class Hello {

	public void Hello() {
		System.out.println("안녕하세요");
	}
	
	public void Hello(String strName) {
		System.out.println(strName + "안녕");
	}
	
	public void Hello(int num) {
		if(num == 7) {
			System.out.println("7은 행운의 숫자");
		}else if(num == 8) {
			System.out.println("8은 완전한 숫자");
		}else
			System.out.println("나도 몰라");
	}
}
