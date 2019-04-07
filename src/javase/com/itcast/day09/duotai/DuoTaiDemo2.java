package com.itcast.day09.duotai;
/*
 * 多态的好处：
 * 		A：
 */

class Animal1{
	public void eat(){
		System.out.println("吃饭");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
}

class Cat1 extends Animal1{
	@Override
	public void eat(){
		System.out.println("猫吃鱼");
	}
	
	@Override
	public void sleep(){
		System.out.println("猫趴着睡觉");
	}
}

class Dog1 extends Animal1{
	@Override
	public void eat(){
		System.out.println("狗吃骨头");
	}
	
	@Override
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}

class Pig extends Animal1{
	@Override
	public void eat(){
		System.out.println("猪吃白菜");
	}
	
	@Override
	public void sleep(){
		System.out.println("猪侧着睡");
	}
}

class AnimalTool{
	private AnimalTool(){
		
	}
	//调用猫的功能
	public static void useCat(Cat1 c){
		c.eat();
		c.sleep();
	}
	
	//调用狗的功能
	public static void useDog(Dog1 d){
		d.eat();
		d.sleep();
	}
	
	public static void usePig(Pig p){
		p.eat();
		p.sleep();
	}
	
	public static void useAnimal(Animal1 a){
		a.eat();
		a.sleep();
	}
}

public class DuoTaiDemo2 {
	public static void main(String[] args){
		System.out.println("-----------基本方法----------------");
		//我喜欢猫，就养了一只
		Cat1 c1 = new Cat1();
		c1.eat();
		c1.sleep();
		
		//我很喜欢猫，所以，又养了一只
		Cat1 c2 = new Cat1();
		c2.eat();
		c2.sleep();
		
		Cat1 c3 = new Cat1();
		c3.eat();
		c3.sleep();
		
		//问题来了，我养了很多只猫，每次创建对象是可以接受的
		//但是呢？调用方法，你不觉得很相似吗？仅仅是对象名不一样
		//我们准备用方法改进
//		userCat(c1);
//		userCat(c2);
//		userCat(c3);
		System.out.println("----------AnimalTool-useCat------------");
		AnimalTool.useCat(c1);
		AnimalTool.useCat(c2);
		AnimalTool.useCat(c3);
		
		//我喜欢狗
		System.out.println("----------AnimalTool-useDog------------");
		Dog1 d1= new Dog1();
		Dog1 d2= new Dog1();
		Dog1 d3= new Dog1();
		AnimalTool.useDog(d1);
		AnimalTool.useDog(d2);
		AnimalTool.useDog(d3);
		
		//我喜欢宠物猪
		System.out.println("----------AnimalTool-usePig------------");
		Pig p1= new Pig();
		Pig p2= new Pig();
		Pig p3= new Pig();
		AnimalTool.usePig(p1);
		AnimalTool.usePig(p2);
		AnimalTool.usePig(p3);
		
		System.out.println("----------AnimalTool-useAnimal------------");
		AnimalTool.useAnimal(c1);
		c1.eat();
		c1.sleep();
	}
	
	
	/*
	//调用猫的功能
	public static void userCat(Cat1 c){
		c.eat();
		c.sleep();
	}
	
	//调用狗的功能
		public static void userDog(Dog1 d){
			d.eat();
			d.sleep();
		}
	*/
}
