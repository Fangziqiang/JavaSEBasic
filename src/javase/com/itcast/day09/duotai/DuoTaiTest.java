package com.itcast.day09.duotai;

class AnimalTest{
	public void eat(){
		System.out.println("吃饭");
	}
}

class Dog2 extends AnimalTest{
	public void eat(){
		System.out.println("狗吃肉");
	}
	public void lookDoor(){
		System.out.println("狗看门");
	}
}

class Cat2 extends AnimalTest{
	public void eat(){
		System.out.println("猫吃鱼");
	}
	public void playGame(){
		System.out.println("猫捉迷藏");
	}
}

public class DuoTaiTest {
	public static void main(String[] args){
		//定义为狗
		AnimalTest a =new Dog2();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//还原成狗
		Dog2 d = (Dog2)a;
		d.eat();
		d.lookDoor();
		System.out.println("--------------------------------------------------");
		
		//变成猫
		a =new Cat2();
		a.eat();
		System.out.println("--------------------------------------------------");
		
		//还原成猫
		Cat2 c = (Cat2)a;
		c.eat();
		c.playGame();
		System.out.println("--------------------------------------------------");
		
		//演示错误的内容
		//Dog dd = new Animal();
		//Dog ddd = new Cat();
	}
}
