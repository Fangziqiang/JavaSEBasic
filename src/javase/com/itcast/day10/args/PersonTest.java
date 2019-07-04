package com.itcast.day10.args;
/*
 * 形式参数：
 * 		基本类型（太简单，不是我今天要讲解的）
 * 		引用类型
 * 			类做形参 ：（匿名对象的时候其实我们已经讲过了）需要的是该类的对象
 * 			抽象类：需要的是该抽象类的子类对象
 * 			接口
 */		

abstract class Person2{
	public abstract void study();
}

class PersonDemo{
	public void method(Person2 p){
		p.study();
	}
}

//定义一个具体的学生类
class Student2 extends Person2{
	public void study(){
		System.out.println("Good Good Study,Day Day up");
	}
}

class PersonTest{
	public static void main(String[] args){
		//目前是没有办法使用的
		//因为抽象类没有对应的具体类
		//那么，我们就应该先定义一个具体类
		//需求：我要使用PersonDemo类中的method()方法
		PersonDemo pd = new PersonDemo(); 
		Person2 p2= new Student2();
		pd.method(p2);
	}
}