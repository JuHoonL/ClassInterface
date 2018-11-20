package com.biz.lnterfaces;

public class AnimalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZooKeper zookeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionImp = new Lion();
		
		zookeper.food(lion);
		//zookeper에 있는 food(Lion lion) method 로출
		zookeper.food(tiger);
		//zookeper에 있는 food(Tiger tiger) method 로출
		zookeper.food01("lion");
		zookeper.food01("tiger");
		
		zookeper.add(3,  4);
		zookeper.add(3f, 4f);
		
	}

}
