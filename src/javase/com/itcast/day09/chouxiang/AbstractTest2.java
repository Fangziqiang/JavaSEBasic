package com.itcast.day09.chouxiang;

/*
 * 老师案例
 * 		具体事物：基础班老师，就业班老师
 * 		共性：姓名，年龄，讲课
 * 分析：
 * 		基础班老师
 * 			姓名，年龄
 * 			讲课
 * 		就业班老师
 * 			姓名，年龄
 * 			讲课
 * 
 * 实现：
 * 		老师类
 * 			基础班老师
 * 			就业班老师
 * 			
 */

//定义抽象的老师类
abstract class Teacher{
	private String name;
	private int age;
	public Teacher(){}
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}

public class AbstractTest2 {

}
