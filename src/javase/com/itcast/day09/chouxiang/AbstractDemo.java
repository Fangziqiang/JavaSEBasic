/**
 * 
 */
/**
 * @author Administrator
 * 抽象类的概述：
 * 		动物不应该定义为具体的东西，而且动物中的吃，睡等也不应该是具体的
 * 		我们把一个不是具体的功能称为抽象的功能，而一个类中如果有抽象的功能，该类必须是抽象类。
 *
 *	抽象类的特点：
 *		A：抽象类和抽象方法必须用abstract关键字。
 *		B：抽象类中不一定有抽象方法，但是有抽象方法的类必须定义为抽象类
 *		C：抽象类不能实例化
 *			因为它不是具体的。
 *			抽象类有构造方法，但是不能实例化？构造方法的作用是什么呢？
 *			用于子类访问父类数据的初始化
 *		D：抽象类的子类
 *			a：如果想重写抽象方法，该子类是一个抽象类
 *			b：重写所有的抽象方法，这个时候子类是一个具体的类
 *
 *		抽象类的实例化其实是靠具体的子类实现的。是多态的方式
 */
package com.itcast.day09.chouxiang;

abstract class Animal{
	//抽象方法
	//public abstract void eat(){}//空方法体，这个会报错。抽象方法不能有主体。
	public abstract void eat();
	
//	构造方法
	public Animal(){}
}

//子类是抽象类
abstract class Dog extends Animal{};

//报错：cat不是抽象类
//class Cat extends Animal{};
//子类是具体类，重写抽象方法
class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//闯进对象
		//Animal是抽象的；无法实例化
		//Animal a = new Animal();
//		通过多态的方式创建对象
		Animal a = new Cat();
		a.eat();
	}
	
}