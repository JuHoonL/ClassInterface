package com.biz.lnterfaces;

public class ZooKeper {
/*
	public void food(AnimalInterface ani) {
		System.out.println("인터페이스를 통한 명령수행");
	}
*/
	
	public void food(Lion lion) {
		System.out.println("사자가 종환이를 먹습니다.");
	}
	
	public void food(Tiger tiger) {
		System.out.println("호랑이가 주현이를 먹습니다.");
	}
	
	public void food01(String strAni) {
		if(strAni == "lion") System.out.println("사자가 종환이를 먹습니다.");
		if(strAni == "tiger") System.out.println("호랑이가 주현이를 먹습니다.");
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void add(float a, float b) {
		System.out.println(a + b);
	}
}
