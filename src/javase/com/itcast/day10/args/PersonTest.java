package com.itcast.day10.args;
/*
 * ��ʽ������
 * 		�������ͣ�̫�򵥣������ҽ���Ҫ����ģ�
 * 		��������
 * 			�����β� �������������ʱ����ʵ�����Ѿ������ˣ���Ҫ���Ǹ���Ķ���
 * 			�����ࣺ��Ҫ���Ǹó�������������
 * 			�ӿ�
 */		

abstract class Person2{
	public abstract void study();
}

class PersonDemo{
	public void method(Person2 p){
		p.study();
	}
}

//����һ�������ѧ����
class Student2 extends Person2{
	public void study(){
		System.out.println("Good Good Study,Day Day up");
	}
}

class PersonTest{
	public static void main(String[] args){
		//Ŀǰ��û�а취ʹ�õ�
		//��Ϊ������û�ж�Ӧ�ľ�����
		//��ô�����Ǿ�Ӧ���ȶ���һ��������
		//������Ҫʹ��PersonDemo���е�method()����
		PersonDemo pd = new PersonDemo(); 
		Person2 p2= new Student2();
		pd.method(p2);
	}
}