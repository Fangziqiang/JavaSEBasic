package com.itcast.day09.chouxiang;

/*
 * 	一个类如果没有抽象方法，可不可以定义为抽象类？如果可以，有什么意义
 * A：可以
 * B：不让创建对象
 * 
 * 抽象类不能和哪些关键字共存
 * private  冲突
 * final    冲突
 * static   无意义
 */

abstract class Animal3{
	public int num = 10;
	public final int num2 =20;
	
	public Animal3(){}
	
	public Animal3(String name,int age){}
	
	//强制要求子类做的事情
	public abstract void show();
	
	//非抽象方法，
	public void method(){
		System.out.println("method");
	}
}

class Dog3 extends Animal3{
	//子类必须有这个方法，因为父类中这个是抽象方法
	public void show(){
		System.out.println("show Dog");
	}
}

class AbstractDemo3 {
	public static void main(String[] args){
		//创建对象
		Animal3 a = new Dog3();
		a.num = 100;
		System.out.println(a.num);
//		a.num2 = 200;
		System.out.println(a.num2);
		System.out.println("--------------------");
		a.show();
		a.method();
		
	}
}
