package com.itcast.day09.chouxiang;

/*
 * ��ʦ����
 * 		���������������ʦ����ҵ����ʦ
 * 		���ԣ����������䣬����
 * ������
 * 		��������ʦ
 * 			����������
 * 			����
 * 		��ҵ����ʦ
 * 			����������
 * 			����
 * 
 * ʵ�֣�
 * 		��ʦ��
 * 			��������ʦ
 * 			��ҵ����ʦ
 * 			
 */

//����������ʦ��
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
