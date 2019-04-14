package com.itcast.day09.duotai;

/*
 * 不同地方饮食文化不同的案例
 */

class Person{
	public void eat(){
		System.out.println("吃饭");
	}
}

class SourthPerson extends Person{
	public void eat(){
		System.out.println("炒菜，吃米饭");
	}
	public void business(){
		System.out.println("经商");
	}
}

class NorthPerson extends Person{
	public void eat(){
		System.out.println("炖菜，吃馒头");
	}
	public void yanJiu(){
		System.out.println("研究");
	}
}

public class DuiTaiTest2 {
	public static void main(String[] args){
		//测试
		//南方人
		Person p = new SourthPerson();
		p.eat();
		System.out.println("-------------------------------------------");
		SourthPerson sp = (SourthPerson)p;
		sp.eat();
		sp.business();
		System.out.println("-------------------------------------------");
		
		//北方人
		p = new NorthPerson();
		p.eat();
		System.out.println("-------------------------------------------");
		NorthPerson np = (NorthPerson)p;
		np.eat();
		np.yanJiu();
	}
}
