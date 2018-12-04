package com.biz.classes;

import com.biz.classes.exec.MyClass01;
import com.biz.classes.exec.MyClass02;
import com.biz.classes.exec.MyClass03;
import com.biz.classes.exec.MyClass04;
import com.biz.classes.exec.MyClass05;
import com.biz.classes.exec.MyClass06;
import com.biz.classes.exec.MyClass07;

public class MyClassExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass01 mc1 = new MyClass01("요로코롬");
		mc1.hello();
		System.out.println("================================================================");
		
		MyClass02 mc2 = new MyClass02();
		mc2.hello("이종환");
		mc2.hello("이주현");
		mc2.hello("안정하");
		mc2.hello("조동혁");
		mc2.hello("고재범");
		mc2.hello("이주훈");
		
		mc2.view();
		System.out.println("================================================================");
		
		MyClass03 mc3 = new MyClass03();
		System.out.println(mc3.getStrName());
		System.out.println(mc3.getIntAge());
		System.out.println("================================================================");
		
		MyClass04 mc4 = new MyClass04();
		mc4.add(makeScore());
		mc4.add(makeScore());
		mc4.add(makeScore());
		mc4.add(makeScore());
		
		mc4.sum();
		System.out.println("================================================================");
		MyClass05 mc5 = new MyClass05();
		mc5.add(makeScore());
		mc5.add(makeScore());
		mc5.add(makeScore());
		mc5.add(makeScore());
		
		System.out.println(mc5.intList());
		System.out.println("================================================================");
		
		MyClass06 mc06 = new MyClass06();
		mc06.add(makeScore());
		mc06.add(makeScore());
		mc06.add(makeScore());
		mc06.add(makeScore());
		
		System.out.println("정수형변환 합은 : " + mc06.intList());
		System.out.println("================================================================");
		
		MyClass07 mc7 = new MyClass07();
		mc7.add("이종환", 1);
		mc7.add("이주현", 2);
		mc7.add("안정하", 3);
		
		
		
		
	}

	public static int makeScore() {
		return (int)(Math.random()*11);
	}
}
