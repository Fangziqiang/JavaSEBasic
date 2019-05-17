package com.itcast.day09.chouxiang;

/*
 * ѧ��������
 * 		�������񣺻�����ѧԱ����ҵ��ѧԱ
 * 		���ԣ����������䣬�༶��ѧϰ���Է�
 * 
 * ������
 * 		������ѧԺ��
 * 			��Ա����:���������䣬�༶
 * 			��Ա������ѧϰ���Է�
 * 		��ҵ��ѧԱ��
 * 			��Ա���������������䣬�༶
 * 			��Ա������ѧϰ���Է�
 * 
 * 		�õ�һ��ѧԱ�ࡣ
 * 
 */
abstract class Student{
	private String name;
	private int age;
	private String grand;
	public Student(){};
	public Student(String name,int age,String grand){
		this.name=name;
		this.age=age;
		this.grand=grand;
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
	
	public String getGrand(){
		return grand;
	}
	public void setGrand(String grand){
		this.grand=grand;
	}
	
	//ѧϰ
	public abstract void study();
	//�Է�
	public void eat(){
		System.out.println("ѧϰ���ˣ��͸óԷ�");
	} 
}

class BasicStudent extends Student{
	public BasicStudent(){}
	public BasicStudent(String name,int age,String grand){
		super(name,age,grand);
	}
	
	public void study(){
		System.out.println("������ѧ��ѧϰJavaSE");
	}
}

class WorkStudent extends Student{
	public WorkStudent(){}
	public WorkStudent(String name,int age,String grand){
		super(name,age,grand);
	}
	
	public void study(){
		System.out.println("��ҵ��ѧ��ѧϰJavaEE");
	}
}
public class AbstractTest3 {
	public static void main(String[] args){
		
	}
}
