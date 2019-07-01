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
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public void sleep(){
		System.out.println("人都是要睡觉的");
	}
	public abstract void eat();
}

//定义运动员抽象类
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	
	//学习
	public abstract void study();
}

//定义教练抽象类
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	
	//教
	public abstract void teach();
}

//定义乒乓球运动员具体类
class PingPangPlayer extends Player implements SpeakEnglish{
	public PingPangPlayer(){}
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("乒乓球运动员吃大白菜，喝小米粥");
	}
	public void study(){
		System.out.println("乒乓球运动员学习如何发球和接球");
	}
	public void speak(){
		System.out.println("乒乓球运动员说英语");
	}
}

//定义乒乓球教练具体类
class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("乒乓球教练吃小白菜，喝大米粥");
	}
	public void teach(){
		System.out.println("乒乓球教练教如何发球和接球");
	}
	public void speak(){
		System.out.println("乒乓球教练说英语");
	}
}

//定义篮球运动员具体类
class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("篮球运动员吃牛肉，喝牛奶");
	}
	public void study(){
		System.out.println("篮球运动员学习如何运球和投篮");
	}
}
//定义篮球教练具体类
class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("篮球教练吃羊肉，喝羊奶");
	}
	public void teach(){
		System.out.println("篮球教练教如何运球和投篮");
	}
}

public class InterfaceDemo {
	public static void main(String[] args){
		//测试运动员
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setAge(33);
		ppp.setName("王浩");
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.sleep();
		ppp.study();
		System.out.println( );
		//通过带参构造给数据
		
		//篮球运动员
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("姚明");
		bp.setAge(34);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.sleep();
		bp.study();
		
		//测试教练
		
	}

}
