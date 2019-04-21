package com.itcast.day09.chouxiang;

/*
 * 		抽象类的成员特点：
 * 			成员变量：既可以是变量，也可以是变量
 * 			构造方法：有。用于子类方位父类数据的初始化
 * 			成员方法：既可以是抽象的，也可以是非抽象的
 * 
 * 		抽象类的成员方法特性：
 * 		A：抽象方法 
 * 		B：
 */

abstract class Animal{
	public int num = 10;
	public final int num2 =20;
	
	public Animal(){}
	
	public Animal(String name,int age){}
	
	public abstract void show();
	
	
}

class Dog extends Animal{
	
}

public class AbstractDemo2 {
	public static void main(String[] args){
		//创建对象
	}
}
