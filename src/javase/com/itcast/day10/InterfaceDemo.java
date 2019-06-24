package com.itcast.day10;

//定义一个说英语的接口
interface SpeakEnglish{
	public  abstract void speak();
}

//定义人的抽象类
abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}
	
}


public class InterfaceDemo {

}
