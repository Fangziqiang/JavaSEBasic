package com.itcast.day10;

//����һ��˵Ӣ��Ľӿ�
interface SpeakEnglish{
	public  abstract void speak();
}

//�����˵ĳ�����
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
		System.out.println("�˶���Ҫ˯����");
	}
	public abstract void eat();
}

//�����˶�Ա������
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	
	//ѧϰ
	public abstract void study();
}

//�������������
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	
	//��
	public abstract void teach();
}

//����ƹ�����˶�Ա������
class PingPangPlayer extends Player implements SpeakEnglish{
	public PingPangPlayer(){}
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
	}
	public void study(){
		System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
	}
	public void speak(){
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
}

//����ƹ�������������
class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("ƹ���������С�ײˣ��ȴ�����");
	}
	public void teach(){
		System.out.println("ƹ�����������η���ͽ���");
	}
	public void speak(){
		System.out.println("ƹ�������˵Ӣ��");
	}
}

//���������˶�Ա������
class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("�����˶�Ա��ţ�⣬��ţ��");
	}
	public void study(){
		System.out.println("�����˶�Աѧϰ��������Ͷ��");
	}
}
//�����������������
class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("������������⣬������");
	}
	public void teach(){
		System.out.println("�����������������Ͷ��");
	}
}

public class InterfaceDemo {
	public static void main(String[] args){
		//�����˶�Ա
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setAge(33);
		ppp.setName("����");
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.sleep();
		ppp.study();
		System.out.println( );
		//ͨ�����ι��������
		
		//�����˶�Ա
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("Ҧ��");
		bp.setAge(34);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.sleep();
		bp.study();
		
		//���Խ���
		
	}

}
