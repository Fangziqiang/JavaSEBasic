package com.itcast.day09.chouxiang;

/*
 * è������
 * 		�������è����
 * 		���ԣ����������䣬�Է�
 * �������Ӿ��嵽����
 * 		è��
 * 			��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա�������Է���è���㣩
 * 		����
 * 			��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա�������Է��������⣩
 * 
 * 		��Ϊ�й��Ե����ݣ����Ծ���ȡ��һ�����ࣺ����
 * 		���������ڳԷ������ݲ�һ�������ԳԷ��ķ����ǳ���ģ�
 * 		�������ǳ�����࣬��ͱ��붨��Ϊ�����ࡣ
 * 
 * 		�������ࣺ
 * 			��Ա����������������
 * 			���췽�����޲Σ�����
 * 			��Ա�������Է�������
 * 
 * 	ʵ�֣��ӳ��󵽾���
 * 
 */

//�������Ķ�����
abstract class AnimalTest{
	//����
	private String name;
	//����
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
	
	//����һ�����󷽷�
	public abstract void eat();
}

class DogTest extends AnimalTest{
	public DogTest(){}
		
	public DogTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("������");
	}
}

class CatTest extends AnimalTest{
	public CatTest(){}
	public CatTest(String name,int age){
		super(name,age);
	}
	
	public void eat(){
		System.out.println("è����");
	}
}

//������
public class AbstractTest {
	public static void main(String[] args){
		//���Թ���
		//��ʽ1���������÷�
		DogTest d = new DogTest();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();		
		
		//��ʽ2��
		DogTest d2 = new DogTest("����",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("--------------------------------");
		//��ʽ3��
		AnimalTest a = new DogTest();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		AnimalTest a2 = new DogTest("����",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
	}

}
