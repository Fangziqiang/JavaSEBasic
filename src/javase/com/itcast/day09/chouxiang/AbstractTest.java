package com.itcast.day09.chouxiang;

/*
 * 猫狗案例
 * 		具体事物：猫，狗
 * 		共性：姓名，年龄，吃饭
 * 分析：从具体到抽象
 * 		猫：
 * 			成员变量：姓名，年龄
 * 			构造方法：无参，带参
 * 			成员方法：吃饭（猫吃鱼）
 * 		狗：
 * 			成员变量：姓名，年龄
 * 			构造方法：无参，带参
 * 			成员方法：吃饭（狗吃肉）
 * 
 * 		因为有共性的内容，所以就提取了一个父类：动物
 * 		但是又由于吃饭的内容不一样，所以吃饭的方法是抽象的，
 * 		而方法是抽象的类，类就必须定义为抽象类。
 * 
 * 		抽象动物类：
 * 			成员变量：姓名，年龄
 * 			构造方法：无参，带参
 * 			成员方法：吃饭（）；
 * 
 * 	实现：从抽象到具体
 * 
 */

//定义抽象的动物类
abstract class AnimalTest{
	//姓名
	private String name;
	//年龄
	private int age;
	
	public AnimalTest(){}
	
	public AnimalTest(String name,int age){
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
	
	//定义一个抽象方法
	public abstract void eat();
}

class DogTest extends AnimalTest{
	public DogTest(){}
		
	public DogTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("狗吃肉");
	}
}

class CatTest extends AnimalTest{
	public CatTest(){}
	public CatTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("猫吃鱼");
	}
}

//测试类
public class AbstractTest {
	public static void main(String[] args){
		//测试狗类
		//方式1：具体类用法
		DogTest d = new DogTest();
		d.setName("旺财");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();		
		
		//方式2：
		DogTest d2 = new DogTest("旺财",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("--------------------------------");
		//方式3：
		AnimalTest a = new DogTest();
		a.setName("旺财");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		AnimalTest a2 = new DogTest("旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
	}

}
