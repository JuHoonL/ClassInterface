package com.biz.lnterfaces.imp;

public class AniExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog자신으로 자신을 생성
/*		Dog dog = new Dog();
		
		//Animal(부모)를 앞세워서 자신을 생성
		Animal dogImp = new Dog();
*/
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bunny bunny = new Bunny();
		
		view(dog);
		view(cat);
		view(bunny);
	}
	
	public static void view(Animal a) {
		// view를 호출할 때 어떤 type의 변수를 전달했는가 알아보는 코드 : 지정변수 instanceof 변수
		if(a instanceof Dog) {
			System.out.println("강아지");
		} else if(a instanceof Cat) {
			System.out.println("고양이");
		} else if(a instanceof Bunny) {
			System.out.println("빨간눈의 토끼");
		} else {
			System.out.println("그외 Animal");
		}
	}
/*
	public static void view(Dog dog) {
		System.out.println("종환이");
	}
	
	public static void view(Cat cat) {
		System.out.println("주현이");
	}
*/
}
