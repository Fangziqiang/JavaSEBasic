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
	
	public abstract void teach();
}
//基础班老师
class BasicTeacher extends Teacher{
	public BasicTeacher(){}
	public BasicTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("基础班老师讲解JavaSE");
	}
}

//就业班老师
class WorkTeacher extends Teacher{
	public WorkTeacher(){}
	public WorkTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("就业班老师讲解JavaEE");
	}
}

public class AbstractTest2 {
	public static void main(String[] args){
		//具体的类测试
		
		//测试（多态）
		//基础班老师
		Teacher t = new BasicTeacher();
		t.setName("方自强");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("-------------------------");
		
		t=new BasicTeacher("方自强",30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("-------------------------");
		
		//就业班老师
		t= new WorkTeacher();
		t.setName("马云");
		t.setAge(45);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("-------------------------");
		
		t= new WorkTeacher("马云",45);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("-------------------------");
	}
}
