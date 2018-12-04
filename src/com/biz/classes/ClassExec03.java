package com.biz.classes;

public class ClassExec03 {

	public static void main(String[] args) {

		Myclass myclass ; 
		myclass = new Myclass();
		
		Myclass myclass01 = new Myclass();
		
		myclass.hello();
		
		myclass01.hello();
		
		Myclass myclass02 = new Myclass();
		//Myclass 형으로 객체를 선언하고 Myclass에 감춰진 메소드를 이용해서 초기화 선언해줌
		
		myclass02.hello();
		myclass02.hello("안정하");
		
		Myclass myclass03 = new Myclass("이주현");
	}

}
