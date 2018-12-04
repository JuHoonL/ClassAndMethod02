package com.biz.classes;

public class ClassExec04 {

	public static void main(String[] args) {

		DogClass dog1 = new DogClass();
		DogClass dog2 = new DogClass("종환");
		
		dog1.run();
		dog2.run();
		
		DogListClass dogList = new DogListClass();
		DogListClass dogList1 = new DogListClass("종환");
	}

}
