package com.itcast.day09.chouxiang;

/*
 * 	һ�������û�г��󷽷����ɲ����Զ���Ϊ�����ࣿ������ԣ���ʲô����
 * A������
 * B�����ô�������
 * 
 * �����಻�ܺ���Щ�ؼ��ֹ���
 * private  ��ͻ
 * final    ��ͻ
 * static   ������
 */

abstract class Animal2{
	public int num = 10;
	public final int num2 =20;
	
	public Animal2(){}
	
	public Animal2(String name,int age){}
	
	//ǿ��Ҫ��������������
	public abstract void show();
	
	//�ǳ��󷽷���
	public void method(){
		System.out.println("method");
	}
}

class Dog2 extends Animal2{
	//��������������������Ϊ����������ǳ��󷽷�
	public void show(){
		System.out.println("show Dog");
	}
}

class AbstractDemo3 {
	public static void main(String[] args){
		//��������
		Animal2 a = new Dog2();
		a.num = 100;
		System.out.println(a.num);
//		a.num2 = 200;
		System.out.println(a.num2);
		System.out.println("--------------------");
		a.show();
		a.method();
		
	}
}